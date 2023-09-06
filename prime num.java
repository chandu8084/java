class main
{
 public static void main(String args[])
 {
   int start=1,num=4,count=0
   while(start<=num)
   {
   if(num%start==0)
   {
   count++;
   }
   start++;
   }
   if(count==2)
   System.out.println(num+"Prime number");
   else
   System.out.println(num+"Not a prime number");
 }
}