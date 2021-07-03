package com.us.improve.designpatterns.composite;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-02 18:30
 * @Version 1.0
 **/
public class VideoFile implements IFile {

	private String name;

	public VideoFile(String name) {
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("Video File: " + this.name);
	}

}
