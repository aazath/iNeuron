
public class Assignment1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 14;
		char letter = '*';
		String space = " ";
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i==0 || i==size-1 || i+j <= (size-1)/2 || i-j >= (size-1)/2)
				{
					System.out.print(letter);
				}
				else
				{
					System.out.print(space);
				}
			}
			System.out.println();
		}

	}

}
