package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 下午8:20:42 
 * @version 1.0 
 */
// 文件夹类：容器构件
public class Folder extends AbstractFile {
	// 定义集合fileList，用于存储AbstractFile类型的成员
	private List<AbstractFile> fileList = new ArrayList<>();
	private String name;

	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int i) {
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		// 模拟杀毒
		System.out.println("======[ 对文件夹'" + name + "'进行杀毒 ]======");
		// 递归调用成员构件的killVirus()方法
		for (AbstractFile af : fileList) {
			af.killVirus();
		}
	}

}
