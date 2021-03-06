package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午5:35:22 
 * @version 1.0 
 */
// 在本实例中，为了详细说明自定义迭代器的实现过程，
// 我们没有使用JDK中内置的迭代器，事实上，
// JDK内置迭代器已经实现了对一个List对象的正向遍历

// 抽象聚合类
public abstract class AbstractList {
	protected List<Object> objects = new ArrayList<>();

	public AbstractList() {}

	public AbstractList(List<Object> objects) {
		this.objects = objects;
	}

	public void addObject(Object obj) {
		objects.add(obj);
	}

	public void removeObject(Object obj) {
		objects.remove(obj);
	}

	public List<Object> getObjects() {
		return this.objects;
	}

	// 声明创建迭代器的抽象工厂方法
	public abstract AbstractIterator createIterator();
}
