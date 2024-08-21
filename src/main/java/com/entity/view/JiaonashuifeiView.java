package com.entity.view;

import com.entity.JiaonashuifeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 缴纳税费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
@TableName("jiaonashuifei")
public class JiaonashuifeiView  extends JiaonashuifeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaonashuifeiView(){
	}
 
 	public JiaonashuifeiView(JiaonashuifeiEntity jiaonashuifeiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaonashuifeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
