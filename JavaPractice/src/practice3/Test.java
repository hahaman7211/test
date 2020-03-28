package practice3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {
	
	public static void main(String[] args) throws IOException {
		String[] fileName = new String[20];
	
		File file;	
		FileInputStream input;
		FileOutputStream out = new FileOutputStream("C:\\Users\\haham\\Desktop\\myLotto.zip");
		ZipOutputStream zipout = new ZipOutputStream(out);
		byte[] buffer = new byte[1024];
		
		for(int i=0; i<fileName.length; i++) {
			String temp = String.format("%02d", i+1);
			
			//directories of the files that you want to zip  
			fileName[i] = "C:\\Users\\haham\\Desktop\\Lotto" + temp + ".txt";
			file = new File(fileName[i]);
			
			input = new FileInputStream(file);
			
			//get the file name, not the directory
			ZipEntry ze = new ZipEntry(file.getName());
			zipout.putNextEntry(ze);
			
			int len;
			
			//input.read(buffer) to get the context of file
			while( (len=input.read(buffer)) != -1  ) {
				zipout.write(buffer, 0, len);
			}		
			input.close();
		}
		zipout.finish();
		zipout.close();
		out.close();
	
		
	}

}
