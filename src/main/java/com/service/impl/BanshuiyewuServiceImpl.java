package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BanshuiyewuDao;
import com.entity.BanshuiyewuEntity;
import com.service.BanshuiyewuService;
import com.entity.vo.BanshuiyewuVO;
import com.entity.view.BanshuiyewuView;

@Service("banshuiyewuService")
public class BanshuiyewuServiceImpl extends ServiceImpl<BanshuiyewuDao, BanshuiyewuEntity> implements BanshuiyewuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanshuiyewuEntity> page = this.selectPage(
                new Query<BanshuiyewuEntity>(params).getPage(),
                new EntityWrapper<BanshuiyewuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanshuiyewuEntity> wrapper) {
		  Page<BanshuiyewuView> page =new Query<BanshuiyewuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanshuiyewuVO> selectListVO(Wrapper<BanshuiyewuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanshuiyewuVO selectVO(Wrapper<BanshuiyewuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanshuiyewuView> selectListView(Wrapper<BanshuiyewuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanshuiyewuView selectView(Wrapper<BanshuiyewuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
