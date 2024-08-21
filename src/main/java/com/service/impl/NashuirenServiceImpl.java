package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.NashuirenDao;
import com.entity.NashuirenEntity;
import com.service.NashuirenService;
import com.entity.vo.NashuirenVO;
import com.entity.view.NashuirenView;

@Service("nashuirenService")
public class NashuirenServiceImpl extends ServiceImpl<NashuirenDao, NashuirenEntity> implements NashuirenService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NashuirenEntity> page = this.selectPage(
                new Query<NashuirenEntity>(params).getPage(),
                new EntityWrapper<NashuirenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NashuirenEntity> wrapper) {
		  Page<NashuirenView> page =new Query<NashuirenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NashuirenVO> selectListVO(Wrapper<NashuirenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NashuirenVO selectVO(Wrapper<NashuirenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NashuirenView> selectListView(Wrapper<NashuirenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NashuirenView selectView(Wrapper<NashuirenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
