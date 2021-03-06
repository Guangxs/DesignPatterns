package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:07:56 
 * @version 1.0 
 */
// 正常状态类：具体状态类
public class NormalState extends AccountState {

	public NormalState(Account account) {
		super(account);
		setStateName("普通状态");
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
		System.out.println("账户处于正常状态，没有产生利息！");
	}

	// 状态转换
	@Override
	public void stateCheck() {
		if (account.getBalance() <= -2000) {
			account.setState(new RestrictedState(account));
		} else if (account.getBalance() <= 0) {
			account.setState(new OverdraftState(account));
		}
	}

}
