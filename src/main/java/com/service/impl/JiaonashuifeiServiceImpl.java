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


import com.dao.JiaonashuifeiDao;
import com.entity.JiaonashuifeiEntity;
import com.service.JiaonashuifeiService;
import com.entity.vo.JiaonashuifeiVO;
import com.entity.view.JiaonashuifeiView;

@Service("jiaonashuifeiService")
public class JiaonashuifeiServiceImpl extends ServiceImpl<JiaonashuifeiDao, JiaonashuifeiEntity> implements JiaonashuifeiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaonashuifeiEntity> page = this.selectPage(
                new Query<JiaonashuifeiEntity>(params).getPage(),
                new EntityWrapper<JiaonashuifeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaonashuifeiEntity> wrapper) {
		  Page<JiaonashuifeiView> page =new Query<JiaonashuifeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaonashuifeiVO> selectListVO(Wrapper<JiaonashuifeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaonashuifeiVO selectVO(Wrapper<JiaonashuifeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaonashuifeiView> selectListView(Wrapper<JiaonashuifeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaonashuifeiView selectView(Wrapper<JiaonashuifeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
