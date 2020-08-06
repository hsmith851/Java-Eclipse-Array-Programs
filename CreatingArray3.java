import java.util.Scanner;

public class CreatingArray3 {

	public static void main(String[] args) {
		int height [] = new int [5];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter five elements: ");
for(int i = 0; i<5; i++)
{
	height[i] = obj.nextInt();
}
for(int i = 0; i<5; i++)
{
System.out.print( height[i] + ", ");
}		
	}

}
