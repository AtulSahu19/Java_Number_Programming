class Disarium_Number{
public static void main(String []args)
{
int num=518;//89,135,518 is disarium number and 90,136,519 is not
int num1=num;
int num2=num;
int count=0;
int sum=0;
while(num1!=0)
{
count++;
num1/=10;
}
while(num2!=0)
{
int result=1;
int rem=num2%10;
for(int i=1;i<=count;i++)
{
result=result*rem;
}
count--;
num2/=10;
sum=sum+result;
}
 /*
int result2=1;
int rem2=num2%10;
for(int i=1;i<=count;i++)
{
result2=result2*rem2;
}
sum=sum+result2;

count--;
num2/=10;
int result3=1;
int rem3=num2%10;
for(int i=1;i<=count;i++)
{
result3=result3*rem3;
}
sum=sum+result3;
}
System.out.println(sum);
*/
if (sum==num)
{
System.out.println(" it is disarium number "+sum);
}
else
{
System.out.println(" it is not disarium number "+num);
}

}}



