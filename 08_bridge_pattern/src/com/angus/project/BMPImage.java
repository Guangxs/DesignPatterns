package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:41:51 
 * @version 1.0 
 */
// BMP��ʽͼ�����������
public class BMPImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// ģ�����BMP�ļ������һ�����ؾ������
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",��ʽΪBMP");
	}

}