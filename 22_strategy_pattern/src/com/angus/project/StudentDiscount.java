package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午12:00:13 
 * @version 1.0 
 */
// 学生票折扣类：具体策略类
public class StudentDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("学生票：");
		return price * 0.8;
	}

}
