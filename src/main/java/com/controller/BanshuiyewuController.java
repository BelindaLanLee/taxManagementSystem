package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BanshuiyewuEntity;
import com.entity.view.BanshuiyewuView;

import com.service.BanshuiyewuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 办税业务
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
@RestController
@RequestMapping("/banshuiyewu")
public class BanshuiyewuController {
    @Autowired
    private BanshuiyewuService banshuiyewuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BanshuiyewuEntity banshuiyewu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nashuiren")) {
			banshuiyewu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BanshuiyewuEntity> ew = new EntityWrapper<BanshuiyewuEntity>();
    	PageUtils page = banshuiyewuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banshuiyewu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BanshuiyewuEntity banshuiyewu, HttpServletRequest request){
        EntityWrapper<BanshuiyewuEntity> ew = new EntityWrapper<BanshuiyewuEntity>();
    	PageUtils page = banshuiyewuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, banshuiyewu), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BanshuiyewuEntity banshuiyewu){
       	EntityWrapper<BanshuiyewuEntity> ew = new EntityWrapper<BanshuiyewuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( banshuiyewu, "banshuiyewu")); 
        return R.ok().put("data", banshuiyewuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BanshuiyewuEntity banshuiyewu){
        EntityWrapper< BanshuiyewuEntity> ew = new EntityWrapper< BanshuiyewuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( banshuiyewu, "banshuiyewu")); 
		BanshuiyewuView banshuiyewuView =  banshuiyewuService.selectView(ew);
		return R.ok("查询办税业务成功").put("data", banshuiyewuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BanshuiyewuEntity banshuiyewu = banshuiyewuService.selectById(id);
        return R.ok().put("data", banshuiyewu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BanshuiyewuEntity banshuiyewu = banshuiyewuService.selectById(id);
        return R.ok().put("data", banshuiyewu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BanshuiyewuEntity banshuiyewu, HttpServletRequest request){
    	banshuiyewu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banshuiyewu);

        banshuiyewuService.insert(banshuiyewu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BanshuiyewuEntity banshuiyewu, HttpServletRequest request){
    	banshuiyewu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(banshuiyewu);

        banshuiyewuService.insert(banshuiyewu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BanshuiyewuEntity banshuiyewu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(banshuiyewu);
        banshuiyewuService.updateById(banshuiyewu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        banshuiyewuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BanshuiyewuEntity> wrapper = new EntityWrapper<BanshuiyewuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("nashuiren")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = banshuiyewuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
