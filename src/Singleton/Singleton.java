package Singleton;

import java.util.Scanner;

public class Singleton {
	private static Singleton instance = null;
	private static Scanner readMe = null;
	private static String myFriend;

	public Singleton(){} // exist only to defeat instantiation

	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();

			System.out.println("New and only one singleton instance created : )");
		}
		else System.out.println("Are you out of mind? I cant create another singleton instance ...");

		return instance;
	}

	public static Scanner getScanner(){
		if(readMe == null){
			System.out.println("Hi, i'm Your special FRIEND! Say kazooo!");
			readMe  = new Scanner(System.in);
			myFriend = readMe.next();
			checkIfYouAreMySpecialFriend(myFriend);
		}
		else System.out.println("I have only one special FRIEND ! GTFO !!!");

		return readMe;
	}

	public static void checkIfYouAreMySpecialFriend(String friend){

		 System.out.println(friend.equals("kazooo") ? "KAZOOOOOOOO !!!" : ": (");
	}

	// With the Singleton Design Pattern you can:
	// - ensure that only one instance of class is created
	// - Provide a global point of access to the object
	// - Allow multiple instances in the future without affecting a singleton class clients
	//
	// The most important thing in Singleton is a private static field instance,
	// it provides that there is only one instance of specific singleton class in our application,
	// and only way to create an instance is through the getInstance() method which is
	// our guard that checks if any instance of Singleton Class already exist.
	//
	// Singleton Design Pattern example usage:
	// - window managers
	// - streams like Scanner
	// - DB connections
	//
	// Singleton design pattern diagram can be found here:
	// http://core0.staticworld.net/images/idge/imported/article/jvw/2003/04/jw-0425-designpatterns1-100156690-orig.jpg
}
