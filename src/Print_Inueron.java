
public class Print_Inueron {
	public static void main(String[] args) {
		int size = 9;
		String letter = "$";
		String space = " ";
		String between ="  ";
		
		//row
		for(int i =0; i<size; i++) 
		{	
			//i
			for (int j = 0; j < 1; j++) 
			{
				if(j==0 && i!=1)
					System.out.print(letter);
				else
					System.out.print(space);
			} 
			
			System.out.print(between);
			//N
			for (int j = 0; j < size; j++) 
			{
				if(j==0 ||j==size-1||i==j)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//E
			for (int j = 0; j < size; j++) 
			{
				if(i==0 ||j==0||i==(size-1)/2||i==size-1)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//U
			for (int j = 0; j < size; j++) 
			{
				if(j==0 && i<size-1||j==size-1 && i<size-1 ||i==size-1 && j!=0 && j!= size-1)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//R
			for (int j = 0; j < size; j++) 
			{
				if(j==0 || i==0 && j!=size-1 ||i==(size-1)/2 && j!=size-1 
						||(j==size-1 && i< (size-1)/2) || j == i && i> (size-1)/2)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//O
			for (int j = 0; j < size; j++) 
			{
				if(i==0 && j>0 && j<size-1||j==0 && i>0 && i<size-1||j==size-1
						&& i>0 && i<size-1 ||i==size-1 && j>0 && j<size-1)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			
			System.out.print(between);
			//N
			for (int j = 0; j < size; j++) 
			{
				if(j==0 ||j==size-1||i==j)
					System.out.print(letter);
				else
					System.out.print(space);
			}
			System.out.println();
		}
	}
}
