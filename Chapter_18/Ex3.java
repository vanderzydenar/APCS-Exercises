import java.util.Scanner;

public class Ex3
{  
  public static void main ( String[] args )  
  {
    double frontRightTire = 0;
    double frontLeftTire = 0;
    double backRightTire = 0;
    double backLeftTire = 0;

    Scanner scan = new Scanner( System.in );

    System.out.println("Front Left Tire Pressure:");

    frontLeftTire = scan.nextInt();

    System.out.println("Front Right Tire Pressure:");

    frontRightTire = scan.nextInt();

    System.out.println("Back Left Tire Pressure:");

    backLeftTire = scan.nextInt();

    System.out.println("Back Right Tire Pressure:");

    backRightTire = scan.nextInt();

    if(frontLeftTire == frontRightTire && backLeftTire == backRightTire && frontLeftTire < 45 && frontLeftTire > 35 && backLeftTire < 45 && backLeftTire > 35){
        System.out.println("Inflation is OK");
    } else {
        System.out.println("Inflation is FATAL");
    }
    

        
  }
}