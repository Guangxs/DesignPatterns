package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����8:04:25 
 * @version 1.0 
 */
// �����ࣺ���崦����
public class Director extends Approver {

	public Director(String name) {
		super(name);
	}

	// �������󷽷�
	@Override
	public void proceddRequest(PurchaseRequest request) {
		if (request.getAmount() < 50000) {
			// ��������
			System.out.println("����" + this.name + "�����ɹ�����" + request.getNumber() + "����" + request.getAmount()
					+ "Ԫ���ɹ�Ŀ�ģ�" + request.getPurpose() + "��");
		} else {
			// ת������
			this.successor.proceddRequest(request);
		}
	}

}