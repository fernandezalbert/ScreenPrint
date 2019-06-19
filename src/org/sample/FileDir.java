package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileDir {
	public static void main(String[] args) throws IOException {
		File s=new File("C:\\Users\\Shiny\\Desktop\\Fdz\\Feroz");
		boolean b=s.mkdir();
		System.out.println(b);
			
		}
	}
