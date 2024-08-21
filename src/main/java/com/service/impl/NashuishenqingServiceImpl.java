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


import com.dao.NashuishenqingDao;
import com.entity.NashuishenqingEntity;
import com.service.NashuishenqingService;
import com.entity.vo.NashuishenqingVO;
import com.entity.view.NashuishenqingView;

@Service("nashuishenqingService")
public class NashuishenqingServiceImpl extends ServiceImpl<NashuishenqingDao, NashuishenqingEntity> implements NashuishenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NashuishenqingEntity> page = this.selectPage(
                new Query<NashuishenqingEntity>(params).getPage(),
                new EntityWrapper<NashuishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NashuishenqingEntity> wrapper) {
		  Page<NashuishenqingView> page =new Query<NashuishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NashuishenqingVO> selectListVO(Wrapper<NashuishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NashuishenqingVO selectVO(Wrapper<NashuishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NashuishenqingView> selectListView(Wrapper<NashuishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NashuishenqingView selectView(Wrapper<NashuishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
