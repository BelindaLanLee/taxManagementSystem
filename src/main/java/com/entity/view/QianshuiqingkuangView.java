package com.entity.view;

import com.entity.QianshuiqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 欠税情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
@TableName("qianshuiqingkuang")
public class QianshuiqingkuangView  extends QianshuiqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QianshuiqingkuangView(){
	}
 
 	public QianshuiqingkuangView(QianshuiqingkuangEntity qianshuiqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, qianshuiqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
