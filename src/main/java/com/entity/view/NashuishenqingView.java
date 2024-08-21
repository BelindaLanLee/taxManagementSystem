package com.entity.view;

import com.entity.NashuishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 纳税申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
@TableName("nashuishenqing")
public class NashuishenqingView  extends NashuishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NashuishenqingView(){
	}
 
 	public NashuishenqingView(NashuishenqingEntity nashuishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, nashuishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
