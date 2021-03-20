package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 16:58
 * @Version 1.0
 **/
public final class StaticBlockSingleton
{

	private static final StaticBlockSingleton instance;

	private StaticBlockSingleton()
	{

	}

	static
	{
		instance = new StaticBlockSingleton();
	}

	public static final StaticBlockSingleton getInstance()
	{
		return instance;
	}

}
