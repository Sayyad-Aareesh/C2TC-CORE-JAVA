// Java Program to Determine the name
// and version of the operating system

import java.util.*;

public class Find_OS_Name_Version
 {

	// Getting name of the OS
	private static final String nameOfOs
		= System.getProperty("os.name");

	// Getting version of the OS
	private static final String versionOfOS
		= System.getProperty("sun.arch.data.model");

	// Main driver method
	public static void main(String[] args)
	{
		// Printing name of OS
		System.out.println(
			"Name of the operating system is " + nameOfOs);

		// Printing version of the OS
		System.out.println(
			"Version of the operating system is "
			+ versionOfOS);
	}
}
