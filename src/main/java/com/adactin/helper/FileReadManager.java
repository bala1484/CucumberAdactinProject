package com.adactin.helper;

import java.io.IOException;

public class FileReadManager {
	
	private FileReadManager() {
	}
	
	public static FileReadManager fm = new FileReadManager();
	
	public static FileReadManager getInstan() {
		return fm;
	}
	
	public static ConfigReader cr;

	public ConfigReader getCr() throws IOException {
		if (cr==null) {
			cr=new ConfigReader();
		}
		return cr;
	}

}
