import java.io.*;
public class DoubleDimensionalArray {

public static void main(String[] args)throws IOException
{
	String [] Name = new String [5];
	int M[][] = new int [5][4];
	int sum[] = new int [5];
	int s = 0; 
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	
	for(int i = 0; i<5; i++)
	{
	System.out.print("Enter the Name of the student: ");
	Name[i] = BR.readLine();
		for(int j = 0; j<4; j++)
		{
			System.out.print("Enter the Mark of the subject: " + (j+1) + ": ");
			M[i][j] = Integer.parseInt(BR.readLine());
			s = s+ M[i][j];
			sum[i] = s;
		}
	s = 0;			
	}
	
	System.out.println("Name \t\t Total Marks");
	for(int i=0; i<5; i++)
	{
	System.out.println(Name[i] + "\t" + sum[i]);
	}
}
}
