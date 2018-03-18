package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午12:03:59 
 * @version 1.0 
 */

// 儿童票折扣类：具体策略类
public class ChildrenDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("儿童票：");
		return price * 0.5;
	}

}
