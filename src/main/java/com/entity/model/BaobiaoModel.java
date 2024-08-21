package com.entity.model;

import com.entity.BaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 报表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public class BaobiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报表名称
	 */
	
	private String baobiaomingcheng;
		
	/**
	 * 内容
	 */
	
	private String neirong;
				
	
	/**
	 * 设置：报表名称
	 */
	 
	public void setBaobiaomingcheng(String baobiaomingcheng) {
		this.baobiaomingcheng = baobiaomingcheng;
	}
	
	/**
	 * 获取：报表名称
	 */
	public String getBaobiaomingcheng() {
		return baobiaomingcheng;
	}
				
	
	/**
	 * 设置：内容
	 */
	 
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
			
}
