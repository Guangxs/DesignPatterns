package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����7:43:12 
 * @version 1.0 
 */
class Client {
	public static void main(String args[]) {

		// ����ͬ�¶���
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();

		// �����н��߶���
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;

		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}
}