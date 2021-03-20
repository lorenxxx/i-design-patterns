package com.us.improve.designpatterns.creation.singleton;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-03-20 17:11
 * @Version 1.0
 **/
public class Client
{

	public void testEagerInitializedSingleton()
	{
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}

	public void testStaticBlockSingleton()
	{
		StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}

	public void testLazyInitializedSingleton()
	{
		LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}

	public void testThreadSafeSingleton()
	{
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}

	public void testStaticInnerClassSingleton()
	{
		StaticInnerClassSingleton instance1 = StaticInnerClassSingleton.getInstance();
		StaticInnerClassSingleton instance2 = StaticInnerClassSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}

	public static void main(String[] args)
	{
		Client client = new Client();

		client.testEagerInitializedSingleton();
		client.testStaticBlockSingleton();
		client.testLazyInitializedSingleton();
		client.testThreadSafeSingleton();
		client.testStaticInnerClassSingleton();
	}

}
