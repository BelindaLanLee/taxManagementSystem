package com.dao;

import com.entity.JiaonashuifeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaonashuifeiVO;
import com.entity.view.JiaonashuifeiView;


/**
 * 缴纳税费
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface JiaonashuifeiDao extends BaseMapper<JiaonashuifeiEntity> {
	
	List<JiaonashuifeiVO> selectListVO(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
	
	JiaonashuifeiVO selectVO(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
	
	List<JiaonashuifeiView> selectListView(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);

	List<JiaonashuifeiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
	
	JiaonashuifeiView selectView(@Param("ew") Wrapper<JiaonashuifeiEntity> wrapper);
	
}
