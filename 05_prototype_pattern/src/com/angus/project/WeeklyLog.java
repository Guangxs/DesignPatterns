package com.angus.project;

import java.awt.event.MouseWheelEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午8:54:21 
 * @version 1.0 
 */
// 工作周报WeeklyLog：具体原型类
public class WeeklyLog implements Serializable {
	private String name;
	private String date;
	private String content;
	private Attachment attachment;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// @Override
	// protected WeeklyLog clone() {
	// WeeklyLog log = null;
	// try {
	// log = (WeeklyLog) super.clone();
	// } catch (CloneNotSupportedException e) {
	// System.out.println("不支持克隆");
	// }
	// return log;
	// }

	// 使用序列化技术实现深克隆
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
		// 将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		// 将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyLog) ois.readObject();
	}
}
