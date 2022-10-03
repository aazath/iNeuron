
public class Assignment1_3 {

	public static void main(String[] args) {
		
		int size = 15;
		String letter = "*";
		String space =" ";
		//Column
		for (int i = 0; i < size; i++) {
			//row
			for (int j = 0; j < size; j++) {
				if (i==0 || j==0 ||i==size-1 ||j==size-1
						||i+j<=(size-1)/2 || j-i >= (size-1)/2) 
				{					
					System.out.print(letter);
				} else {
					System.out.print(space);
				}
			}
			System.out.println();
		}

	}

}
