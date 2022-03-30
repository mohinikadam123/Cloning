package ControlStatement;
import java.util.Scanner;
public class Exercise4 {

    
  public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input no=");
        int day =in.nextInt();
        System.out.println(getDayName(day)); 
    }
  public static String getDayName(int day)
  {
	 
        String dayName = "";
        switch (day)
        {
        case 1:dayName = "Monday";
        break;
        case 2:dayName = "Thusday";
        break;
        case 3:dayName = "Wednsday";
        break;
        case 4:dayName = "Thursday";
        break;
        case 5:dayName = "Friday";
        break;
        case 6:dayName = "Saturday";
        break;
        case 7:dayName = "Sunday";
        break;
        }
		return dayName;
    }
}

