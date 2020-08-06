import java.io.*;
public class PassingArray 
{
static int B[] = new int [10];
static void Passing(int A[]) {
	int sum = 0,l;
	l = A.length;
	for(int i = 0; i<l; i++)
		{
		sum = sum+A[i];
		}
		System.out.print("Sum of all elements of given array is = " + sum);
}
static void input()throws IOException
{
	BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
	System.out.print("Input 10 integer array element: ");
	for(int i = 0; i<B.length; i++)
	B[i] = Integer.parseInt(BR.readLine());
}
public static void main(String[]args)throws IOException
{
	PassingArray obj = new PassingArray();
	obj.input();
	obj.Passing(B);
}
}
