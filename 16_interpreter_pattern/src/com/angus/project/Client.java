package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����4:42:45 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		String instruction = "up move 5 and down run 10 and left leap 5";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		System.out.println(handler.output());
	}
}
