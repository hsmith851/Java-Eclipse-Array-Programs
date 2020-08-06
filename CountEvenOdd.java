import java.io.*;
public class CountEvenOdd {

	public static void main(String[] args)throws IOException 
		{
		int Arr[] = new int [10];
		int CE = 0, CO = 0;
		BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter 10 Elements for an Array");
		for(int i = 0; i<Arr.length; i++)
		{
			Arr[i] = Integer.parseInt(BR.readLine());
		}
		for(int i = 0; i<Arr.length; i++)
		{
			if(Arr[i]%2==0)
			CE++; 
			else
			CO++;
		}
	System.out.println("Number of Even Numbers from given Array: " + CE);
	System.out.println("Number of Odd Numbers from given Array: " + CO);
		}		
		}

