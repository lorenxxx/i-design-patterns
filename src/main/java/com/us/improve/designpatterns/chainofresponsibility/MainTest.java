package com.us.improve.designpatterns.chainofresponsibility;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-14 21:34
 * @Version 1.0
 **/
public class MainTest {

	public static void main(String[] args) {
		IHandler<Integer> handlerA = new ConcreteHandlerA();
		IHandler<Integer> handlerB = new ConcreteHandlerB();
		IHandler<Integer> handlerDefault = new ConcreteHandlerDefault();

		handlerA.setSuccessor(handlerB);
		handlerB.setSuccessor(handlerDefault);

		//handlerA.handle(299);
		handlerA.handle(699);
	}

}
