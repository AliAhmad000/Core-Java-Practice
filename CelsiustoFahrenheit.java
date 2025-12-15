// Celsius to Fahrenheit Conversion

import java.util.*;
public class CelsiustoFahrenheit
{
 public static void main(String args[])
{
  //private static final Logger logger = LoggerFactory.getlogger(CelsiustoFahrenheit.class);

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Temperature in Celsius: ");
  int Celsius = sc.nextInt();
  int Fahrenheit = (Celsius * 9/5) + 32;
  System.out.println(Fahrenheit);
}
}