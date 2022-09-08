package com.hsbc.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.hsbc.model.beans.Person;

public class TestDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("person.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p = (Person)ois.readObject();
			System.out.println(p);
			ois.close();
			fis.close();
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
