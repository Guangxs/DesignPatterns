package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����12:00:13 
 * @version 1.0 
 */
// ѧ��Ʊ�ۿ��ࣺ���������
public class StudentDiscount extends Discount {

	@Override
	public double calculate(double price) {
		System.out.println("ѧ��Ʊ��");
		return price * 0.8;
	}

}