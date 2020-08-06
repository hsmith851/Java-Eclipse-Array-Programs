import java.io.*;
public class Combining_Array 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Enter the size of the first array: ");
	int xL = Integer.parseInt(BR.readLine());
	int x [] = new int [xL];
	System.out.println("Enter element for the array: ");
	for(int i=0; i<xL; i++)
	x[i] = Integer.parseInt(BR.readLine());
	
	System.out.print("Enter the size of the Second array: ");
	int yL = Integer.parseInt(BR.readLine());
	int y [] = new int [yL];
	System.out.println("Enter element for the array: ");
	
	for(int i=0; i<yL; i++)
	y[i] = Integer.parseInt(BR.readLine());
	int zL = xL+yL;
	int z[] = new int [zL];
	jgkjhgh
	for(int i = 0; i<xL; i++)
		z[i] = x[i];
	for(int i = xL, j=0; i<zL; i++,j++)
		z[i] = y[i];
	for(int i=0; i<zL; i++)
	System.out.print(z[i]+" ");
	System.out.println();
	}

}
