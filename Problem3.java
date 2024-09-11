public class Problem3
{
  public static void main(String[] args)
  {
    double deci = 67.3424;
    int threeDigit = (int) ((deci%(int)(deci))*1000); 
    System.out.println(threeDigit);
    int digit1 = (threeDigit/100);
    int digit2 = (threeDigit%100)/10;
    int digit3 = (threeDigit%10)%10;
    System.out.println(digit1 + " " + digit2 + " " + digit3);
  }
}

