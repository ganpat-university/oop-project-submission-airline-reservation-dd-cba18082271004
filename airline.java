//done all work but remaining do while loops in password login
import java.util.*;
class airline{

String destination;
int f_no;
double c_time;
double g_time;
String name;
int price;
public void set_data(int price,double c_time,double g_time,int f_no,String destination){//to give student data
this.destination=destination;
this.f_no=f_no;
this.c_time=c_time;
this.g_time=g_time;
this.price=price;
}
public int airline_show(String f){//to check id and password.
    if(destination.equals(f))
    {
System.out.println("Your Default Location Will Be |AHMEDABAD|");
    System.out.println("\n\nFLIGHT NO.:-"+f_no);
    System.out.println("FLIGHT ARIVAL TIMING:-"+c_time);
    System.out.println("FLIGHT DEPARTURE TIMING:-"+g_time);
    System.out.println("FLIGHT DESTINATION:-"+destination);
    System.out.println("FLIGHT PRICE:-"+price);
    return 1;
    }
    return 0;
}

public int airline_set(String f,String name){//to check id and password.
    if(destination.equals(f))
    {
//System.out.println("Your Default Location Will Be |AHMEDABAD|");
    System.out.println("\n\nFLIGHT NO.:-"+f_no);
    System.out.println("FLIGHT ARIVAL TIMING:-"+c_time);
    System.out.println("FLIGHT DEPARTURE TIMING:-"+g_time);
    System.out.println("FLIGHT DESTINATION:-"+destination);
    System.out.println("FLIGHT PRICE:-"+price);
    this.name=name;
    return 1;
    }
    return 0;
}
void airline_show_set()
{
//System.out.println("Your Default Location Will Be |AHMEDABAD|");
    System.out.println("\n\nflight id is :"+f_no);
    System.out.println("FLIGHT ARIVAL TIMING:-"+c_time);
    System.out.println("FLIGHT DEPARTURE TIMING:-"+g_time);
    System.out.println("FLIGHT DESTINATION:-"+destination);
    System.out.println("FLIGHT FARE IS:-"+price);
    System.out.println("PASSENGER NAME:-"+name);
}


public static void main(String args[])
{

      Scanner sc=new Scanner(System.in);
    airline sob[]=new airline[4];
    sob[0]=new airline();
    sob[1]=new airline();
    sob[2]=new airline();
    sob[3]=new airline();
    int x=0,i=0,m=0,c=0;
//public void set_data(double c_time,double g_time,int f_no,String destination)
    sob[0].set_data(1000,11.30,12.30,1001,"MUMBAI");
    sob[1].set_data(2000,13.40,15.0,1002,"jJAIPUR");
    sob[2].set_data(3000,18.00,20.00,1003,"DELHI");
    sob[3].set_data(4000,22.30,23.20,1004,"KERALA");
 do{
System.out.println("					|WELCOME TO AIRLINE MANAGEMENT SYSTEM|");
System.out.println("\nPLEASE ENTER 1 FOR INPUTNG DESTINATION.");
System.out.println("ENTER 2 FOR CONFORMATION OF TICKET.");
System.out.println("ENTER 3 EXIT.");
c=sc.nextInt();
if(c==1)    
{
   System.out.println("FLIGHT DESTINATION: \n");
    String n=sc.next();
    for(i=0;i<=3;i++)
    {
    x=sob[i].airline_show(n);
    if(x==1)
     break;    
    if(i==3 && x==0)
    System.out.println("Sorry this flight is not avalable");
   }
}
else if(c==2)
{
           System.out.println("FLIGHT DESTINATION:\n");
        String n=sc.next();
        System.out.println("ENTER THE PASSENGER NAME FOR CONFORMATION.");
        String name=sc.next();

        for(i=0;i<=3;i++)
        {
        x=sob[i].airline_set(n,name);
        if(x==1)
        {
        sob[i].airline_show_set();
         break;
        }
        else if(i==3 && x==0)
    System.out.println("sorry this flight is not avalable");

        
        }
   
}
}while(c!=3);
}
}