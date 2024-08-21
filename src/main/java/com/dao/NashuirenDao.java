package com.dao;

import com.entity.NashuirenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NashuirenVO;
import com.entity.view.NashuirenView;


/**
 * 纳税人
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
public interface NashuirenDao extends BaseMapper<NashuirenEntity> {
	
	List<NashuirenVO> selectListVO(@Param("ew") Wrapper<NashuirenEntity> wrapper);
	
	NashuirenVO selectVO(@Param("ew") Wrapper<NashuirenEntity> wrapper);
	
	List<NashuirenView> selectListView(@Param("ew") Wrapper<NashuirenEntity> wrapper);

	List<NashuirenView> selectListView(Pagination page,@Param("ew") Wrapper<NashuirenEntity> wrapper);
	
	NashuirenView selectView(@Param("ew") Wrapper<NashuirenEntity> wrapper);
	
}
