package com.us.improve.designpatterns.chainofresponsibility;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-14 21:21
 * @Version 1.0
 **/
public class ConcreteHandlerB implements IHandler<Integer> {

	private IHandler handler;

	@Override
	public IHandler getSuccessor() {
		return this.handler;
	}

	@Override
	public void setSuccessor(IHandler handler) {
		this.handler = handler;
	}

	@Override
	public void handle(Integer value) {
		if (value < 500) {
			// 自行处理
			System.out.println("ConcreteHandlerB handle, value = " + value);
		} else {
			// 交给下一个节点处理
			if (this.getSuccessor() != null) {
				this.getSuccessor().handle(value);
			}
		}
	}

}
