import java.util.Scanner;
import java.lang.Math;
public class DigitCountFor{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number");
  int num = input.nextInt();
  System.out.println("Digit is "+ digits(num));
}
  static int digits(int num){
    if(num<0){
      num = num*-1;
    }
    return (int)(Math.log10(num))+1;
}
