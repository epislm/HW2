import java.util.*;

public class Question2
{  
        public static void main(String args[])
        {
			String[] months = {"January", "February", "March", "April", "May", "June", "July","August","September","October","November","December"};
			int[]	days = {31,28,31,30,31,30,31,31,30,31,30,31};
			boolean leapYear;
			Scanner my_Scanner = new Scanner(System.in);
			boolean firstMonth = true;
			System.out.println("What year is it?");
			int year = my_Scanner.nextInt();
			
			System.out.println("What day did the first of January fall on? \n Ex: Su Mo Tu We Th Fr Sa ");
			String firstOfJan = my_Scanner.next();
			
			/*
			To determine whether a year is a leap year, follow these steps: 1.If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5. 
																			2.If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4. 
																			3.If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5. 
																			4.The year is a leap year (it has 366 days). 
																			5.The year is not a leap year (it has 365 days).  if div by 4 but not 100 yes
																																if div by 4 and 100 and 400 yes

			*/
			
			System.out.println("The first of january is : " + firstOfJan);
			if ( ((year%4) == 0) && ((year%100) != 0) ){
				leapYear = true;
			}
			else if (((year%4) == 0) && ((year%100) == 0) && ((year%400) == 0)){
				leapYear = true;
			}
				
			else {
			leapYear = false;	
			}
			
			if(leapYear == true)
				days[2] = 29;
			
			for(int i = 0; i < months.length;i++){
			System.out.println("\n      " + months[i] );
			System.out.println("Su Mo Tu We Th Fr Sa ");
				for(int j = 0;j < days[i] ;j++){
						
						
						if (j == 7)
							System.out.println();
						if (j == 14)
							System.out.println();
						if (j == 21)
							System.out.println();
						if (j == 28)
							System.out.println();
						System.out.printf("%2d ",(j + 1));
					
					
				}
			
			}
		}
}