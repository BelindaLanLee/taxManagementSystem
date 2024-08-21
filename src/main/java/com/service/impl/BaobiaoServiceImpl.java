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


import com.dao.BaobiaoDao;
import com.entity.BaobiaoEntity;
import com.service.BaobiaoService;
import com.entity.vo.BaobiaoVO;
import com.entity.view.BaobiaoView;

@Service("baobiaoService")
public class BaobiaoServiceImpl extends ServiceImpl<BaobiaoDao, BaobiaoEntity> implements BaobiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaobiaoEntity> page = this.selectPage(
                new Query<BaobiaoEntity>(params).getPage(),
                new EntityWrapper<BaobiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaobiaoEntity> wrapper) {
		  Page<BaobiaoView> page =new Query<BaobiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaobiaoVO> selectListVO(Wrapper<BaobiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaobiaoVO selectVO(Wrapper<BaobiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaobiaoView> selectListView(Wrapper<BaobiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaobiaoView selectView(Wrapper<BaobiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
