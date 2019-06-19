package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.server.commandhandler.GetLogsOfType;

public class FileList {
public static void main(String[] args) throws IOException {
	File s=new File("C:\\Users\\Shiny\\Desktop\\Fdz\\new.txt");
	List<String> d =FileUtils.readLines(s);
	for (int i = 0; i < d.size(); i++) {
		if(i%2!=0) {
			System.out.println(d.get(i));
		}
		
	}
}
}
