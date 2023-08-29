class main 
 {
  public static void main(String args[])
   {
     int number=188;
      if(number>=0 && number<=25)
	{
	 System.out.println("SINGLE DIGIT");	
	}
        else if(number>=10 && number<40)
	{
	System.out.println("TWO DIGIT");
	} 
      else if(number>=100 && number<=999)
	{	
	System.out.println("THREE DIGIT");
      }
   }
}	