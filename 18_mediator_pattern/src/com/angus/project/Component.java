package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����7:23:54 
 * @version 1.0 
 */

// ��������ࣺ����ͬ����
abstract class Component {
	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	// ת������
	public void changed() {
		mediator.componentChanged(this);
	}

	public abstract void update();
}