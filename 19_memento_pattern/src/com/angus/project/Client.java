package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:40:53 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		MementoCaretaker caretaker = new MementoCaretaker();
		Chessman chessman = new Chessman("˧", 12, 3);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setX(1);
		display(chessman);
		caretaker.setMemento(chessman.save());
		chessman.setY(30);
		display(chessman);
		System.out.println("******����******");
		chessman.restore(caretaker.getMemento());
		display(chessman);

	}

	public static void display(Chessman chessman) {
		System.out.println(
				"����" + chessman.getLabel() + "��ǰλ��Ϊ��" + "��" + chessman.getX() + "��" + "��" + chessman.getY() + "�С�");
	}
}