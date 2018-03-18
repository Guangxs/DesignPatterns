package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����10:37:58 
 * @version 1.0 
 */
// ͸֧״̬������״̬��
public class OverdraftState extends AccountState {

	public OverdraftState(Account account) {
		super(account);
		setStateName("͸֧״̬");
	}

	@Override
	public void deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		stateCheck();
	}

	@Override
	public void withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		stateCheck();
	}

	@Override
	public void computeInterest() {
		System.out.println("������Ϣ");
	}

	// ״̬ת��
	@Override
	public void stateCheck() {
		if (account.getBalance() > 0) {
			account.setState(new NormalState(account));
		} else if (account.getBalance() <= -2000) {
			account.setState(new RestrictedState(account));
		}
	}

}