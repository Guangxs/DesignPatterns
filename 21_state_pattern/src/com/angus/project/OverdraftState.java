package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 上午10:37:58 
 * @version 1.0 
 */
// 透支状态：具体状态类
public class OverdraftState extends AccountState {

	public OverdraftState(Account account) {
		super(account);
		setStateName("透支状态");
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
		System.out.println("计算利息");
	}

	// 状态转换
	@Override
	public void stateCheck() {
		if (account.getBalance() > 0) {
			account.setState(new NormalState(account));
		} else if (account.getBalance() <= -2000) {
			account.setState(new RestrictedState(account));
		}
	}

}
