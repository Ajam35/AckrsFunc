//Andrew LaRoche
// CS310 Ackermann's Function lab
// 3/13/15


/**
 * This program demonstrates the Ackermann's function method
 */

public class AckrsFunc
{
  public static void main(String[] args)
  {
  System.out.println(ackermann(0,0));
  System.out.println(ackermann(0,1));
  System.out.println(ackermann(1,1));
  System.out.println(ackermann(1,2));
  System.out.println(ackermann(1,3));
  System.out.println(ackermann(2,2));
  System.out.println(ackermann(3,2));
  
  }
  /**
   * The 'ackermann' method calculates how well a computer performs recursion
   * @param m the first number to use in the calculation
   * @param n the second number to use in the calculation
   * @return The result of whether m or n is equal to zero or the result of the ackermann function.
   */
  public static int ackermann(int m, int n)
  {
    if ( m == 0)
    {
      return n + 1;
    }
    else if ( n == 0)
    {
      return ackermann(m-1, 1);
    }
    else
    {
      return ackermann(m-1, ackermann(m, n-1) );
    }
  
  
  
  }
}
