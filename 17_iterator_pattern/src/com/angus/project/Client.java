package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����5:55:03 
 * @version 1.0 
 */
public class Client {
	
	public static void main(String[] args) {
		// �����ۺ϶���
		AbstractList productList = new ProductList();
		productList.addObject("����");
		productList.addObject("��ͷ");
		productList.addObject("ϡ��");
		productList.addObject("����");
		productList.addObject("����");

		// ��������������
		AbstractIterator iterator = productList.createIterator();

		System.out.println("���������");
		while (!iterator.isLast()) {
			System.out.print(iterator.getNextItem() + " ");
			iterator.next();
		}

		System.out.println("\n---------------------");
		System.out.println("���������");
		while (!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem() + " ");
			iterator.previous();
		}

	}
}