import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class hello{
public static void inout(){
      try{
        System.setIn(new FileInputStream("input.txt"));
        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      }catch(Exception e){
        System.err.println("error");
      }
  }
  public static void main(String[] args){  
   inout();
  Scanner sc =new Scanner(System.in);
  int number =sc.nextInt();
  int reverse = 0;  
  while(number != 0)   
  {  
  int remainder = number % 10;  
  reverse = reverse * 10 + remainder;  
  number = number/10;  
  }  
  System.out.println("The reverse of the given number is: " + reverse); 
}     
}