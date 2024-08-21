package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaonashuifeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaonashuifeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaonashuifeiView;


/**
 * 缴纳税费
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface JiaonashuifeiService extends IService<JiaonashuifeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaonashuifeiVO> selectListVO(Wrapper<JiaonashuifeiEntity> wrapper);
   	
   	JiaonashuifeiVO selectVO(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
   	
   	List<JiaonashuifeiView> selectListView(Wrapper<JiaonashuifeiEntity> wrapper);
   	
   	JiaonashuifeiView selectView(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaonashuifeiEntity> wrapper);
   	
}

