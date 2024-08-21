package com.dao;

import com.entity.BanshuiyewuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanshuiyewuVO;
import com.entity.view.BanshuiyewuView;


/**
 * 办税业务
 * 
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
public interface BanshuiyewuDao extends BaseMapper<BanshuiyewuEntity> {
	
	List<BanshuiyewuVO> selectListVO(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
	
	BanshuiyewuVO selectVO(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
	
	List<BanshuiyewuView> selectListView(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);

	List<BanshuiyewuView> selectListView(Pagination page,@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
	
	BanshuiyewuView selectView(@Param("ew") Wrapper<BanshuiyewuEntity> wrapper);
	
}
