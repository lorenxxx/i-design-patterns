package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 17:08
 * @Version 1.0
 **/
public final class LazyInitializedSingleton
{

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton()
	{

	}

	public static LazyInitializedSingleton getInstance()
	{
		// 警告：这里有线程安全问题
		if (instance == null)
		{
			instance = new LazyInitializedSingleton();
		}

		return instance;
	}

}
