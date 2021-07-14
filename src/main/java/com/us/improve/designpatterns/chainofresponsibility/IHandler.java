package com.us.improve.designpatterns.chainofresponsibility;

/**
 * @ClassName IHander
 * @Desciption TODO
 * @Author loren
 * @Date 7/14/21 9:18 PM
 * @Version 1.0
 **/
public interface IHandler<T> {

	/**
	 * 获取后继节点
	 *
	 * @return
	 */
	IHandler getSuccessor();

	/**
	 * 设置后继节点
	 *
	 * @param handler
	 */
	void setSuccessor(IHandler handler);

	/**
	 * 处理
	 *
	 * @param value
	 */
	void handle(T value);

}