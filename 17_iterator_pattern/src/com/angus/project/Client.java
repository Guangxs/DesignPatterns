package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午5:55:03 
 * @version 1.0 
 */
public class Client {
	
	public static void main(String[] args) {
		// 创建聚合对象
		AbstractList productList = new ProductList();
		productList.addObject("包子");
		productList.addObject("馒头");
		productList.addObject("稀饭");
		productList.addObject("豆浆");
		productList.addObject("油条");

		// 创建迭代器对象
		AbstractIterator iterator = productList.createIterator();

		System.out.println("正向遍历：");
		while (!iterator.isLast()) {
			System.out.print(iterator.getNextItem() + " ");
			iterator.next();
		}

		System.out.println("\n---------------------");
		System.out.println("反向遍历：");
		while (!iterator.isFirst()) {
			System.out.print(iterator.getPreviousItem() + " ");
			iterator.previous();
		}

	}
}
