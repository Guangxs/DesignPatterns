package com.angus.pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/** 
 * @author GuangSIR 
 * @date 2018��3��16�� ����4:25:59 
 * @version 1.0 
 */
// FileReader���ļ���ȡ�࣬�䵱��ϵͳ��
public class FileReader {
	public String read(String fileName) {
		System.out.print("��ȡ�ļ�����ȡ���ģ�");
		StringBuilder sb = new StringBuilder();
		FileInputStream fs = null;

		try {
			File file = new File(fileName);
			// System.out.println(file.getAbsolutePath());
			fs = new FileInputStream(file);
			int data;
			byte[] buffer = new byte[1024];
			try {
				while ((data = fs.read(buffer)) != -1) {
					sb.append(new String(buffer, 0, data));
				}
				fs.close();
				System.out.println(sb.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
}