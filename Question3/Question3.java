import java.util.*;
public class Question3
{  
        public static void main(String args[])
        {

			Scanner my_scanner = new Scanner(System.in);
			
			String imput = my_scanner.next();
			String my_Copy = new StringBuilder(imput).reverse().toString();
			
			if (imput.equals(my_Copy)){
				System.out.println("It is a pallendrone");
			}
			else 
				System.out.println("It is not a pallendrone");
	
		}
}