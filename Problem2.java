public class Problem2
{
  public static void main(String[] args)
  {
    double one = 57.3934;
    double two = 22.5211;
    int roundOne = (int) (one + 0.5);
    int roundTwo = (int) (two + 0.5);
    int result = roundOne + roundTwo;
    System.out.println("Number one: " + one);
    System.out.println("Number two: " + two);
    System.out.println("Result: " + roundOne + " + " + roundTwo + " = " + result);
  }
}
