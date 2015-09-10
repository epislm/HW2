import java.util.*;
public class Question1
{  
        public static void main(String args[])
        {
			int rows;
			Scanner my_scanner = new Scanner(System.in);
			rows = my_scanner.nextInt();
			
			for(int i = 1; i <= rows  ;i++){				
				System.out.println();
					for(int x=i; x <= rows+1; x++)
					System.out.print("  ");
	
				for(int k = 1; k <= i;k++){
				System.out.printf("%2d",k);}
						
					for(int j= i-1; j >= 1;j-- )
					System.out.printf("%2d",j);
				
			}
			
		}
}