public class RemoveDuplicateString
	 {
		static void RD(String A[])
		{
			int L = A.length;
			System.out.println("Given Array is: ");
			for(int i = 0; i<L; i++)
			System.out.print(A[i]+ " ");
			System.out.println();
			for(int i = 0; i<L-1; i++) 
			{
				for(int j = 0; j<L-1; j++) 
				{
					if(A[i].equalsIgnoreCase(A[j])==true)
					{
						A[i]=A[L-1];
						L--;
					}
				}
			}
			System.out.println("New Array with repeatation: ");		
			for(int i=0; i<L; i++)
			System.out.print(A[i]+ " ");
		}

	}
