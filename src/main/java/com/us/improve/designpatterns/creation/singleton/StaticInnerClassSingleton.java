package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 17:35
 * @Version 1.0
 **/
public class StaticInnerClassSingleton
{

	private static class StaticInnerClassSingletonHelper
	{
		private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
	}

	private StaticInnerClassSingleton()
	{

	}

	public static final StaticInnerClassSingleton getInstance()
	{
		return StaticInnerClassSingletonHelper.INSTANCE;
	}

}
