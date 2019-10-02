package academy.learnProgramming.algorithm.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {

	public static void main (String[] args) throws NumberFormatException, IOException
	{
		//code
		
		MinIndex min = new MinIndex();
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println(min.findMin(arr));

	}
}
