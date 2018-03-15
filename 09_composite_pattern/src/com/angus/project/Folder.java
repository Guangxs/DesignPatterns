package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:20:42 
 * @version 1.0 
 */
// �ļ����ࣺ��������
public class Folder extends AbstractFile {
	// ���弯��fileList�����ڴ洢AbstractFile���͵ĳ�Ա
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
		// ģ��ɱ��
		System.out.println("======[ ���ļ���'" + name + "'����ɱ�� ]======");
		// �ݹ���ó�Ա������killVirus()����
		for (AbstractFile af : fileList) {
			af.killVirus();
		}
	}

}