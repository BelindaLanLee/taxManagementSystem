package com.dao;

import com.entity.NashuishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NashuishenqingVO;
import com.entity.view.NashuishenqingView;


/**
 * 纳税申请
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface NashuishenqingDao extends BaseMapper<NashuishenqingEntity> {
	
	List<NashuishenqingVO> selectListVO(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
	
	NashuishenqingVO selectVO(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
	
	List<NashuishenqingView> selectListView(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);

	List<NashuishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
	
	NashuishenqingView selectView(@Param("ew") Wrapper<NashuishenqingEntity> wrapper);
	
}
