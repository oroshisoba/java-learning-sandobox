package com.samples.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderSample {

	/**
	 * InputStreamReader Sample
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String line = null;

		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;

		try {
			inputStream = FileReaderSample.class.getResourceAsStream("FILE.txt");
			inputStreamReader = new InputStreamReader(inputStream, "MS932");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (inputStreamReader != null) {
					inputStreamReader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
