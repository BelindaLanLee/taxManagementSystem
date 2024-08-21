package com.dao;

import com.entity.QianshuiqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianshuiqingkuangVO;
import com.entity.view.QianshuiqingkuangView;


/**
 * 欠税情况
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface QianshuiqingkuangDao extends BaseMapper<QianshuiqingkuangEntity> {
	
	List<QianshuiqingkuangVO> selectListVO(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
	
	QianshuiqingkuangVO selectVO(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
	
	List<QianshuiqingkuangView> selectListView(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);

	List<QianshuiqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
	
	QianshuiqingkuangView selectView(@Param("ew") Wrapper<QianshuiqingkuangEntity> wrapper);
	
}
