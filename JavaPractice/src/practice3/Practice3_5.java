package practice3;

//import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Practice3_5 {
	
	public static void main(String[] args) throws IOException {
		String zipFileTo = "C:\\Users\\haham\\Desktop\\lottery.zip";
		
		String[] sourceFiles = { 
						"Lotto01.txt", "Lotto02.txt", "Lotto03.txt",
						"Lotto04.txt", "Lotto05.txt", "Lotto06.txt",
						"Lotto07.txt", "Lotto08.txt", "Lotto09.txt",
						"Lotto10.txt", "Lotto11.txt", "Lotto12.txt",
						"Lotto13.txt", "Lotto14.txt", "Lotto15.txt",
						"Lotto16.txt", "Lotto17.txt", "Lotto18.txt",
						"Lotto19.txt", "Lotto20.txt",  };
	
		byte[] buffer = new byte[1024];
		FileOutputStream output = new FileOutputStream(zipFileTo);
		ZipOutputStream zipout = new ZipOutputStream(output);
		
		for(int i=0; i<sourceFiles.length; i++) {
			
			FileInputStream fin = new FileInputStream(sourceFiles[i]);
			//FileInputStream fin = new FileInputStream(source);
			//System.out.println(source);
			//System.out.println(file.getName());
			zipout.putNextEntry( new ZipEntry(sourceFiles[i]) );
			
			int len;
			while( (len=fin.read(buffer)) != -1 ) {
				zipout.write(buffer, 0, len);
			}		
			fin.close();		
		}
		zipout.finish();
		zipout.close();
		output.close();
		
	}

}
