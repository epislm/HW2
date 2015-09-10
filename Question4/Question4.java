public class Question4
{  
        public static void main(String args[])
        {
			int x = 5;
			outerloop:
			for(;;){
				if (x == 5)
				switch(x){
				case 5:
					System.out.println("True. Going to break");
					break outerloop;
				}
			}
			
		}
}