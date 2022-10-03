

public class AlphabetPattern{
	public static void main(String[] args) {
		int size = 12;
		String letter = "*";
		String space = " ";
		String between ="  ";
		
		//row
		for(int i =0; i<size; i++) 
		{	
			//A
			for (int j = 0; j < size; j++) 
			{
				if(j==0 && i>0 || i==0 && j>0 && j<size-1|| i==size/2 ||(j==size-1&&i>0))
					System.out.print(letter);
				else
					System.out.print(space);
			} 
			System.out.print(between);
			//B
			for (int j = 0; j < size; j++) 
			{
				if(j==0||i==0 && j<size-1||i==size-1 &&j<size-1||i==size/2 && j<size-1
						||i>0 && i!= size/2 && i!= size-1 &&j==size-1)
					System.out.print(letter);
				else
					System.out.print(space);
			} 
			
			System.out.print(between);
			//C
			for (int j = 0; j < size; j++) 
			{
				if(i==0 &&j>0 ||i==size-1 && j>0||j==0 && i>0 && i<(size-1))
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//D
			for (int j = 0; j < size; j++) 
			{
				if(i==0 &&j>0 ||i==size-1 && j>0||j==0|| j==size-1 && i>0 && i<(size-1))
					System.out.print(letter);
				else
					System.out.print(space);
			}
			System.out.println();
		}
	}
}
