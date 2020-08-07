import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BubbleSortArray2 
{
	public static void main(String[] args)throws IOException
	{
	String Arr[] = new String [5];
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter 5 Elements for an Array");
	for(int i = 0; i<Arr.length; i++)
		{
		Arr[i] = BR.readLine();
		}
		for(int i = 0; i<Arr.length-1; i++)
		{
			for(int j = 0; j<Arr.length-1-i; j++)
			{
				if(Arr[j].compareTo(Arr[j+1])<0)
				{
					String Temp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = Temp;
				}
			}
	
		}
		System.out.println("Sorted Array is given below: ");
		for(int i = 0; i<Arr.length; i++)
		System.out.println(Arr[i]+" ");
	}

}
