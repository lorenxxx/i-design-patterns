package com.us.improve.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-02 18:16
 * @Version 1.0
 **/
public class Folder implements IFile {

	private String name;

	private List<IFile> files;

	public Folder(String name) {
		this.name = name;
		files = new ArrayList<>();
	}

	@Override
	public void display() {
		for (IFile file : files) {
			file.display();
		}
	}

	public void addFile(IFile file) {
		files.add(file);
	}

	public void removeFile(IFile file) {
		files.remove(file);
	}

}
