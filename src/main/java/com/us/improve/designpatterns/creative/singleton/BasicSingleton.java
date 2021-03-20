package com.us.improve.designpatterns.creative.singleton;

/**
 * @Author loren
 * @Description 基础单例模式
 * @Date 2021-03-20 16:35
 * @Version 1.0
 **/
public final class BasicSingleton
{

	private static BasicSingleton instance;

	private BasicSingleton()
	{
		// 模拟创建对象所需要的时间
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static BasicSingleton getInstance()
	{
		// 多线程环境下，这里不安全
		if (instance == null)
		{
			instance = new BasicSingleton();
		}

		return instance;
	}

	public static void main(String[] args)
	{
		BasicSingleton singleton1 = BasicSingleton.getInstance();
		BasicSingleton singleton2 = BasicSingleton.getInstance();

		System.out.println(singleton1 == singleton2);
	}

}
