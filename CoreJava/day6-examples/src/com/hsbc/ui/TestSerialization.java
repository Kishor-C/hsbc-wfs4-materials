package com.hsbc.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.hsbc.model.beans.Person;

public class TestSerialization {

	public static void main(String[] args) {
		try {
			Person p = new Person("Kishor", 34);
			FileOutputStream fos = new FileOutputStream("person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("________Object Serialized______");
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
