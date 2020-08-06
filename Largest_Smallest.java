import java.io.*;
public class Largest_Smallest 
{
public static void main(String[] args)throws IOException 
{
	double Arr[] = new double [10];
	double Largest=Arr[0]=Arr[0], Smallest=Arr[0];
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter 10 Elements for an Array");
			for(int i = 0; i<Arr.length; i++)
			{
				Arr[i] = Double.parseDouble(BR.readLine());
			}
			for(int i = 0; i<Arr.length; i++)
			{
				if(Arr[i]>=Largest)
				Largest = Arr[i];
				
			}
			for(int i = 0; i<Arr.length; i++)
			{
				if(Arr[i]<=Smallest)
				Smallest = Arr[i];
				
			}
System.out.println("Largest Element is : " + Largest);
System.out.println("Smallest Element is : " + Smallest);
			}		
			}

