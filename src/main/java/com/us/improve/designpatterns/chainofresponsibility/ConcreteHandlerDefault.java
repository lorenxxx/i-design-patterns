package com.us.improve.designpatterns.chainofresponsibility;

/**
 * @Author loren
 * @Description 责任链中的默认处理节点，一般放在责任链的末尾
 * @Date 2021-07-14 21:21
 * @Version 1.0
 **/
public class ConcreteHandlerDefault implements IHandler<Integer> {

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
		// 兜底，默认处理
		System.out.println("ConcreteHandlerDefault handle, value = " + value);
	}

}
