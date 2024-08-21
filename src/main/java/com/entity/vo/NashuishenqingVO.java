package com.entity.vo;

import com.entity.NashuishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 纳税申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-01 16:53:05
 */
public class NashuishenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 工资
	 */
	
	private Integer gongzi;
		
	/**
	 * 税率
	 */
	
	private String shuilv;
		
	/**
	 * 缴纳费用
	 */
	
	private String jiaonafeiyong;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：工资
	 */
	 
	public void setGongzi(Integer gongzi) {
		this.gongzi = gongzi;
	}
	
	/**
	 * 获取：工资
	 */
	public Integer getGongzi() {
		return gongzi;
	}
				
	
	/**
	 * 设置：税率
	 */
	 
	public void setShuilv(String shuilv) {
		this.shuilv = shuilv;
	}
	
	/**
	 * 获取：税率
	 */
	public String getShuilv() {
		return shuilv;
	}
				
	
	/**
	 * 设置：缴纳费用
	 */
	 
	public void setJiaonafeiyong(String jiaonafeiyong) {
		this.jiaonafeiyong = jiaonafeiyong;
	}
	
	/**
	 * 获取：缴纳费用
	 */
	public String getJiaonafeiyong() {
		return jiaonafeiyong;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
