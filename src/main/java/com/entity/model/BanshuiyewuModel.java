package com.entity.model;

import com.entity.BanshuiyewuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 办税业务
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-01 16:53:04
 */
public class BanshuiyewuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 缴纳费用
	 */
	
	private Integer jiaonafeiyong;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：缴纳费用
	 */
	 
	public void setJiaonafeiyong(Integer jiaonafeiyong) {
		this.jiaonafeiyong = jiaonafeiyong;
	}
	
	/**
	 * 获取：缴纳费用
	 */
	public Integer getJiaonafeiyong() {
		return jiaonafeiyong;
	}
			
}
