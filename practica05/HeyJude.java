public class HeyJude{
    public static void main (String[] pps) {

	String HEY = "Hey Jude ";
	String DONT = "don't ";
	String MAKE = "make it bad ";
        String BE = "be afraid ";
	String LET = "let me down ";
	String TAKE = "take a sad song and make it better ";
	String MADE = "you were made to go out and get her ";
	String FOUND = "you have found her, now go and get her ";
	String REMEMBER = "Remember to ";
	String HEART = "let her into your heart ";
	String SKIN = "let her under your skin ";
	String THEN = "Then you ";
	String START = "can start ";
	String BEGIN = "begin ";
	String BETTER = "to make it better ";
	String BBBBB = "Better, ";
	String NA = "Na ";
	String OH = "Oh";

	int p = 1;
	int c = 0;

	while (p < 8) {
	    if (p == 1 || p == 2 || p == 4 || p == 6) {
		System.out.print(HEY);
		System.out.print(DONT);
	    }
	    if (p==4){
		System.out.println(LET);
		System.out.println(FOUND);
	    }
	    if (p == 1 || p == 6) {
		System.out.println(MAKE);
		System.out.println(TAKE);
	    }
	    if (p == 2){
		System.out.println(BE);
		System.out.println(MADE);
	    }
	    if (p == 1 || p == 2 || p == 4 || p == 6){
		System.out.print(REMEMBER);
	    }
	    if (p == 1 || p == 4){
		System.out.println(HEART);
	    }
	    if (p == 2 || p == 6){
		System.out.println(SKIN);
	    }
	    if (p==1||p==2||p==4||p==6){
		System.out.print(THEN);
	    }
	    if (p==1||p==4){
		System.out.print(START);
	    }
	    if (p==2||p==6){
		System.out.print(BEGIN);
	    }
	    if (p==1||p==2||p==4||p==6){
		System.out.println(BETTER);
	    }
		if (p==1||p==2||p==4){
		    
		    System.out.println("\n");
		
	       
	    }
	    if (p==3 || p==5 || p==7){
		while(c < 10){
		System.out.print(NA);

		c++;
		
		}
		if (p==3 || p==5){
		System.out.println(""+"\n");
		}
		c=0;
	    }
	    if (p==6){
		while(c < 5){
		    System.out.print(BBBBB);

		    c++;

		}
		 System.out.println(OH+"\n");
		c=0;
	    }
	    if (p==7){
		System.out.println(HEY);
	    }
		
		    
	    

	    p++;
	}


    }
}
