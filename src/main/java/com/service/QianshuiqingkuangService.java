package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianshuiqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianshuiqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianshuiqingkuangView;


/**
 * 欠税情况
 *
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface QianshuiqingkuangService extends IService<QianshuiqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianshuiqingkuangVO> selectListVO(Wrapper<QianshuiqingkuangEntity> wrapper);
   	
   	QianshuiqingkuangVO selectVO(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
   	
   	List<QianshuiqingkuangView> selectListView(Wrapper<QianshuiqingkuangEntity> wrapper);
   	
   	QianshuiqingkuangView selectView(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianshuiqingkuangEntity> wrapper);
   	
}

