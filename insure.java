 class main
{
public static void main(String args[])
{
 string health="excellent",location="city",gender"female";
 int age=34;
double premium=0,policy_amount=1000000,max_amount=0;
if(heaith=="excellent"&&(age>=25&&age<=35)&&location=="city")
   {
   if(gender=="male"&&policy_amount<=2000000)
  {
   premium=4.0*policy_amount/1000;
    max_amount=3.0*100000/1000;
    }
    else
     {
     System.out.println("PERSON NOT INSURED");
     }
     }
	else if(health=="poor"&&age>=25&&age<=35&&location=="village"gender=="male"&&policy_amount==10000)
       {
else
	{
	System.out.println("person not insured");
	}
	double loss=max_amount-premium;
	System.out.println(premium+" "+ max_amount+" "+loss);
   }
 }
}