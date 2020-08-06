import java.io.*;
public class SumEvenOdd
{
public static void main(String[] args)throws IOException 
	{
	int Arr[] = new int [10];
	int SE = 0, SO = 0;
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter 10 Elements for an Array");
	for(int i = 0; i<Arr.length; i++)
	{
		Arr[i] = Integer.parseInt(BR.readLine());
	}
	for(int i = 0; i<Arr.length; i++)
	{
		if(Arr[i]%2==0)
		SE += Arr[i];
		else
		SO += Arr[i];
	}
System.out.println("Sum of Even Numbers from given Array: " + SE);
System.out.println("Sum of Odd Numbers from given Array: " + SO);

		
		}		
	}

