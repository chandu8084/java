class main
 {
   public static void main(String args[])
   {
  int a=18,b=15;
   System.out.println("before swapping"+a+" "+b);
    a=a^b;
    b=a^b;
    a=a^b;
     System.out.println("after swapping"+a+" "+b);
   }
}