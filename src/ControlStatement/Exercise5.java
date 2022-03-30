package ControlStatement;

import java.util.Scanner;

public class Exercise5 
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	int noOfDaysInMonth=0;
    String MonthOfName="Unknown";
	System.out.println("Input the month no=");
	int month=input.nextInt();
	System.out.println("Input year=");
	int year=input.nextInt();
	switch(month)
	{
	case 1:MonthOfName="January";
	      noOfDaysInMonth=31;
	      break;
	case 2:MonthOfName="feburay";
    noOfDaysInMonth=28;
    break;
	case 3:MonthOfName="March";
    noOfDaysInMonth=31;
    break;
	case 4:MonthOfName="April";
    noOfDaysInMonth=30;
    break;
	case 5:MonthOfName="May";
    noOfDaysInMonth=31;
    break;
	case 6:MonthOfName="Jun";
    noOfDaysInMonth=30;
    break;
	case 7:MonthOfName="July";
    noOfDaysInMonth=31;
    break;
	case 8:MonthOfName="Augast";
    noOfDaysInMonth=31;
    break;
	case 9:MonthOfName="September";
    noOfDaysInMonth=30;
    break;
	case 10:MonthOfName="Octobar";
    noOfDaysInMonth=31;
    break;
	case 11:MonthOfName="November";
    noOfDaysInMonth=30;
    break;
	case 12:MonthOfName="December";
    noOfDaysInMonth=31;
    break;
	}
	System.out.print(MonthOfName + " " + year + " has " + noOfDaysInMonth + " days\n");
}

}
