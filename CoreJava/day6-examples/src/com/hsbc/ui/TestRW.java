package com.hsbc.ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRW {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("abc.txt");
			FileWriter fw = new FileWriter("xyz.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			int c = 0;
			String line = null;
			int loopCounter = 0;
			while ( (line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				loopCounter++;
			}
			bw.flush();
			fw.flush();
			br.close();
			bw.close();
			fw.close();
			fr.close();
			System.out.println("___File Written____");
			System.out.println("Loop Iteration: "+loopCounter);
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
