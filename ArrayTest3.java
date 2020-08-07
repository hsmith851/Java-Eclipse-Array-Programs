
public class ArrayTest3 {

	public static void main(String[] args) 
	{
	String s[] = new String[4];
	int L = s.length-1;
	s[0] = "Book";
	s[L-0] = "Pencil";
	s[1] = "Pen";
	s[L-1] = "Marker";
	for(int i=0; i<L+1; i++)
	System.out.print(s[i]+ "\t");
	}

}
