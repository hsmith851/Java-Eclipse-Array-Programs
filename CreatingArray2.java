import java.util.Scanner;

public class CreatingArray2 {

	public static void main(String[] args) {
		int height [] = new int [5];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter five elements: ");
for(int i = 0; i<5; i++)
{
	height[i] = obj.nextInt();
}
		System.out.println(
				height[0] + ", " +
				height[1] + ", " +
				height[2] + ", " +
				height[3] + ", " +
				height[4] + ", " 
				);

	}

}
