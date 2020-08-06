import java.io.*;
public class ArrayNumPrograms 
{
public static void main(String[] args)throws IOException 
{
	int Arr[] = new int [10];
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter 10 Elements for an Array");
	for(int i = 0; i<Arr.length; i++)
	{
		Arr[i] = Integer.parseInt(BR.readLine());
	}
	System.out.println("Following are even elements of given array: ");
	for(int i = 0; i<Arr.length; i++)
	{
	if(Arr[i]%2==0)
	System.out.print(Arr[i]+ " ");
	}		
}
}
