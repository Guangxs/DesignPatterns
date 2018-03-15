package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018年3月13日 下午5:42:38 
 * @version 1.0 
 */
class ConcreteProductA extends Product {

	// 实现业务方法
	@Override
	public void methodDiff() {
		// 业务方法的实现
		System.out.println("This is A's methodDiff");
	}
	
}
