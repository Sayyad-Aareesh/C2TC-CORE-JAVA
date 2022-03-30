// Java program to illustrate join() method in Java

import java.lang.*;

public class Concurency_JoinDemo implements Runnable {
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "
						+ t.getName());

		// checks if current thread is alive
		System.out.println("Is Alive? " + t.isAlive());
	}

	public static void main(String args[]) throws Exception
	{
		Thread t = new Thread(new Concurency_JoinDemo());
		t.start();

		// Waits for 1000ms this thread to die.
		t.join(1000);

		System.out.println("\nJoining after 1000"
						+ " milliseconds: \n");
		System.out.println("Current thread: "
						+ t.getName());

		// Checks if this thread is alive
		System.out.println("Is alive? " + t.isAlive());
	}
}
