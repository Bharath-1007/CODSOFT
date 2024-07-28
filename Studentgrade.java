import java.util.*;
class Studentgrade
{
public static void main(String[] args)
{
Scanner x= new Scanner(System.in);
int sum=0;
System.out.print("Enter student name : ");
String name=x.nextLine();
System.out.print("Enter Number Of Subjects : ");
int n=x.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Subject " + i +" : ");
a[i]=x.nextInt();
}
for(int i=0;i<n;i++)
{
sum+=a[i];
}

System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("\t\t\t\t\t\t\tSTUDENT GRADE");
System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

System.out.println("STUDENT NAME : "+name);
System.out.println("Total Marks = "+ sum);
double average = sum / n;
System.out.println("Average Mark is =  "+ average);

if(average>90)
System.out.println("O grade");

else if(average>80 && average<=90)
System.out.println("A+ grade");

else if(average>70 && average<=80)
System.out.println("A grade");

else if(average>60 && average<=70)
System.out.println("B grade");

else if(average>50 && average<=60)
System.out.println(" B+ grade");

else 
System.out.println("Arrear");

}
}