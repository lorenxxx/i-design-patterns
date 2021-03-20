package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 16:50
 * @Version 1.0
 **/
public final class EagerInitializedSingleton
{

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton()
	{

	}

	public static final EagerInitializedSingleton getInstance()
	{
		return instance;
	}

}
