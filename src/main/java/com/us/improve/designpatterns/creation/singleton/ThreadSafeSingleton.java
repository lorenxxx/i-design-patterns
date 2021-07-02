package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 17:16
 * @Version 1.0
 **/
public class ThreadSafeSingleton
{

	private static volatile ThreadSafeSingleton instance;

	private ThreadSafeSingleton()
	{

	}

	// hint: 这种效率并不高
	//	public static final synchronized ThreadSafeSingleton getInstance()
	//	{
	//		if (instance == null)
	//		{
	//			instance = new ThreadSafeSingleton();
	//		}
	//
	//		return instance;
	//	}

	public static final ThreadSafeSingleton getInstance()
	{
		if (instance == null)
		{
			synchronized (ThreadSafeSingleton.class)
			{
				if (instance == null)
				{
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}

}
