package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NashuirenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NashuirenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NashuirenView;


/**
 * 纳税人
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
public interface NashuirenService extends IService<NashuirenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NashuirenVO> selectListVO(Wrapper<NashuirenEntity> wrapper);
   	
   	NashuirenVO selectVO(@Param("ew") Wrapper<NashuirenEntity> wrapper);
   	
   	List<NashuirenView> selectListView(Wrapper<NashuirenEntity> wrapper);
   	
   	NashuirenView selectView(@Param("ew") Wrapper<NashuirenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NashuirenEntity> wrapper);
   	
}

