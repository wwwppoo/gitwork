package cn.itstudy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.manning.com/gsmith/SampleChapter1.pdf");
			URLConnection connection = url.openConnection();
			InputStream is = connection.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			OutputStream os = new FileOutputStream("G:\\ceshi\\SampleChapter1.pdf");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			byte[] value = new byte[1024];
			int len = 0;
			while((len=bis.read(value)) != -1){
				bos.write(value,0,len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
