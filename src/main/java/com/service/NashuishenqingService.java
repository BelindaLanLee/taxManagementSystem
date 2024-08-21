package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NashuishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NashuishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NashuishenqingView;


/**
 * 纳税申请
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface NashuishenqingService extends IService<NashuishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NashuishenqingVO> selectListVO(Wrapper<NashuishenqingEntity> wrapper);
   	
   	NashuishenqingVO selectVO(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
   	
   	List<NashuishenqingView> selectListView(Wrapper<NashuishenqingEntity> wrapper);
   	
   	NashuishenqingView selectView(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NashuishenqingEntity> wrapper);
   	
}

