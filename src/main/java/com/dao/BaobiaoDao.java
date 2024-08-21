package com.dao;

import com.entity.BaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaobiaoVO;
import com.entity.view.BaobiaoView;


/**
 * 报表
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public interface BaobiaoDao extends BaseMapper<BaobiaoEntity> {
	
	List<BaobiaoVO> selectListVO(@Param("ew") Wrapper<BaobiaoEntity> wrapper);
	
	BaobiaoVO selectVO(@Param("ew") Wrapper<BaobiaoEntity> wrapper);
	
	List<BaobiaoView> selectListView(@Param("ew") Wrapper<BaobiaoEntity> wrapper);

	List<BaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<BaobiaoEntity> wrapper);
	
	BaobiaoView selectView(@Param("ew") Wrapper<BaobiaoEntity> wrapper);
	
}
