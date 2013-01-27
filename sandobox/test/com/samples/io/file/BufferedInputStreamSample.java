package com.samples.io.file;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Byte IO sample
 * 
 * @author oroshisoba
 *
 */
public class BufferedInputStreamSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InputStream inputStream = null;
		BufferedInputStream bufferedInputStream = null;
		byte[] buffer = new byte[1024];

		try {
			inputStream = BufferedInputStreamSample.class.getResourceAsStream("FILE.txt");
			bufferedInputStream = new BufferedInputStream(inputStream);
			while (bufferedInputStream.read(buffer) > -1) {
				System.out.println(buffer);
				System.out.println(new String(buffer));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
