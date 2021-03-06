package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午9:49:24 
 * @version 1.0 
 */
// 抽象公文接口，也可以定义为抽象类，提供clone方法，将业务方法声明为抽象方法
public interface OfficialDocument extends Cloneable {
	public OfficialDocument clone();

	public void display();
}
