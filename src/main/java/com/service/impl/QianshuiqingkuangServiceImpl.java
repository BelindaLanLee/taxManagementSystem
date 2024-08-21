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


import com.dao.QianshuiqingkuangDao;
import com.entity.QianshuiqingkuangEntity;
import com.service.QianshuiqingkuangService;
import com.entity.vo.QianshuiqingkuangVO;
import com.entity.view.QianshuiqingkuangView;

@Service("qianshuiqingkuangService")
public class QianshuiqingkuangServiceImpl extends ServiceImpl<QianshuiqingkuangDao, QianshuiqingkuangEntity> implements QianshuiqingkuangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianshuiqingkuangEntity> page = this.selectPage(
                new Query<QianshuiqingkuangEntity>(params).getPage(),
                new EntityWrapper<QianshuiqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianshuiqingkuangEntity> wrapper) {
		  Page<QianshuiqingkuangView> page =new Query<QianshuiqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QianshuiqingkuangVO> selectListVO(Wrapper<QianshuiqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianshuiqingkuangVO selectVO(Wrapper<QianshuiqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianshuiqingkuangView> selectListView(Wrapper<QianshuiqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianshuiqingkuangView selectView(Wrapper<QianshuiqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
