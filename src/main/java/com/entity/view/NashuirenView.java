package com.entity.view;

import com.entity.NashuirenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 纳税人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
@TableName("nashuiren")
public class NashuirenView  extends NashuirenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public NashuirenView(){
	}
 
 	public NashuirenView(NashuirenEntity nashuirenEntity){
 	try {
			BeanUtils.copyProperties(this, nashuirenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
