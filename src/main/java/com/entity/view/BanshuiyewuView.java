package com.entity.view;

import com.entity.BanshuiyewuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 办税业务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
@TableName("banshuiyewu")
public class BanshuiyewuView  extends BanshuiyewuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanshuiyewuView(){
	}
 
 	public BanshuiyewuView(BanshuiyewuEntity banshuiyewuEntity){
 	try {
			BeanUtils.copyProperties(this, banshuiyewuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
