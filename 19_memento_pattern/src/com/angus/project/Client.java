package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午8:40:53 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		MementoCaretaker caretaker = new MementoCaretaker();
		Chessman chessman = new Chessman("帅", 12, 3);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setX(1);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setY(30);
		display(chessman);
		System.out.println("******悔棋******");
		chessman.restore(caretaker.getMemento());
		display(chessman);

	}

	public static void display(Chessman chessman) {
		System.out.println(
				"棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行" + "第" + chessman.getY() + "列。");
	}
}
