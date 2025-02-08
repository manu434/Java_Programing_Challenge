package Oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Compile_Exception {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("E:\\hhtp"); // Ensure the correct file path format
			System.out.println("Started");
			Thread.sleep(4000);
			System.out.println("Stopped");
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException occurred: " + e.getMessage());
		}
	}
}
