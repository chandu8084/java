class main
{
 public static void main(String args[])
 {
   int end=1,num=4,count=0;  
   while(num>=end)
   {
   if(num%end==0)
   { 
   count++;
   }
   end++;
   }
   if(count==2)
   System.out.println(num+"Prime number");
   else
   System.out.println(num+"Not a prime number");
 }
}