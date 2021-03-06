package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午8:04:25 
 * @version 1.0 
 */
// 主任类：具体处理者
public class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	// 具体请求方法
	@Override
	public void proceddRequest(PurchaseRequest request) {
		if (request.getAmount() < 50000) {
			// 处理请求
			System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
					+ "元，采购目的：" + request.getPurpose() + "。");
		} else {
			// 转发请求
			this.successor.proceddRequest(request);
		}
	}

}
