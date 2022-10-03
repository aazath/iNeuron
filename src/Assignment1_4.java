
public class Assignment1_4 {

public static void main(String[] args) {
		
		int size = 15;
		String letter = "*";
		String space =" ";
		//Column
		for (int i = 0; i < size; i++) {
			//row
			for (int j = 0; j < size; j++) {
				if (i==j+(size/2)) 
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
