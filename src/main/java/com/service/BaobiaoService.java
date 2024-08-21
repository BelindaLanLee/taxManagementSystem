package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaobiaoView;


/**
 * 报表
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface BaobiaoService extends IService<BaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaobiaoVO> selectListVO(Wrapper<BaobiaoEntity> wrapper);
   	
   	BaobiaoVO selectVO(@Param("ew") Wrapper<BaobiaoEntity> wrapper);
   	
   	List<BaobiaoView> selectListView(Wrapper<BaobiaoEntity> wrapper);
   	
   	BaobiaoView selectView(@Param("ew") Wrapper<BaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaobiaoEntity> wrapper);
   	
}

