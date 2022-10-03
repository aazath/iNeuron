
public class NamePrinting {
	public static void main(String[] args) {
		//variables
		int size = 9;
		String letter = "*";
		String space = " ";
		String between ="  ";
		
		//nested loop will print my name: AAZATH
		for (int i = 0; i < size; i++) {
			
			//A
			for (int j = 0; j < size; j++) {
				if (j==0 && i>0 || i==0 && j>0 && j<size-1
						||j==size-1 && i>0||i==(size-1)/2) 
				{
					System.out.print(letter);
				} 
				else 
				{
					System.out.print(space);
				}
				
			}
			System.out.print(between);
			//A
			for (int j = 0; j < size; j++) {
				if (j==0 && i>0 || i==0 && j>0 && j<size-1
						||j==size-1 && i>0||i==(size-1)/2) 
				{
					System.out.print(letter);
				} 
				else 
				{
					System.out.print(space);
				}
				
			}
			
			System.out.print(between);
			//Z
			for (int j = 0; j < size; j++) {
				if (i==0||i==size-1||j+i == size) 
				{
					System.out.print(letter);
				} 
				else 
				{
					System.out.print(space);
				}
				
			}
			
			System.out.print(between);
			//A
			for (int j = 0; j < size; j++) {
				if (j==0 && i>0 || i==0 && j>0 && j<size-1
						||j==size-1 && i>0||i==(size-1)/2) 
				{
					System.out.print(letter);
				} 
				else 
				{
					System.out.print(space);
				}
				
			}
			
			System.out.print(between);
			//T
			for (int j = 0; j < size; j++) {
				if (i==0 ||j==(size-1)/2) 
				{
					System.out.print(letter);
				} 
				else 
				{
					System.out.print(space);
				}
				
			}
			
			System.out.print(between);
			//H
			for (int j = 0; j < size; j++) {
				if (j==0 || j==size-1||i==(size-1)/2) 
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
