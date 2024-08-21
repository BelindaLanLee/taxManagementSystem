package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanshuiyewuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanshuiyewuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanshuiyewuView;


/**
 * 办税业务
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
public interface BanshuiyewuService extends IService<BanshuiyewuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanshuiyewuVO> selectListVO(Wrapper<BanshuiyewuEntity> wrapper);
   	
   	BanshuiyewuVO selectVO(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
   	
   	List<BanshuiyewuView> selectListView(Wrapper<BanshuiyewuEntity> wrapper);
   	
   	BanshuiyewuView selectView(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanshuiyewuEntity> wrapper);
   	
}

