package com.hsbc.model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.hsbc.exceptions.UserCreationException;
import com.hsbc.exceptions.UserNotFoundException;
import com.hsbc.model.beans.User;

public class UserDaoArrayFileImpl implements UserDao {

	// an array without initialization but will be initialized
	private static User[] users = null;
	private static int index = 0;
	@Override
	public void save(User user) throws UserCreationException {
		// since on the very first execution file wouldn't be there we create
		// file & also initialize an array of size 25
		try {
			FileInputStream fis = new FileInputStream("users.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			users = (User[]) ois.readObject();
			// iterate to know the new user needs to be added to which index no.
			index = 0;
			for(User u : users) {
				if(u != null) {
					index++;
				}
			}
			users[index++] = user;
			FileOutputStream fos = new FileOutputStream("users.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(users);
			oos.flush();
			oos.close();
			fos.close();
			ois.close();
			fis.close();
		} catch(ClassNotFoundException | IOException e) {
			users = new User[25];
			try { 
				FileOutputStream fos2 = new FileOutputStream("users.ser");
				ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
				// add the first user in the array
				users[index] = user;
				oos2.writeObject(users);
				oos2.flush();
				oos2.close();
				fos2.close();
				fos2.close();
			} catch(IOException ex) {
				throw new UserCreationException("Looks like file not found");
			}
		}
	}

	@Override
	public User[] findAll() {
		User[] temp = null;
		try { 
			FileInputStream fis = new FileInputStream("users.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			users = (User[]) ois.readObject();
			ois.close();
			fis.close();
			// return the new array having only users by ignoring 'null', find the number of users
			int userCount = 0;
			for(User u: users) {
				if (u != null) 
					userCount++;
			}
			// initialize the array that wants to copy user from users
			temp = new User[userCount];
			for(int i = 0; i < temp.length; i++) {
				temp[i] = users[i];
			}
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public User findUser(int id) throws UserNotFoundException {
		User[] users = findAll();
		for(User u : users) 
			if(u.getUserId() == id)
				return u;
			// throw exception if user not found
		throw new UserNotFoundException("User with an id: "+id+" not found");
	}

}
