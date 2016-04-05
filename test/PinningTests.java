import static org.junit.Assert.*;
import org.junit.Test;


public class PinningTests
{
  int mSize= 15;
  
  //Tests for convertToInt
  @Test
  public void convertToIntPositive()
  {
    int x= Integer.MAX_VALUE;
    MainPanel mainN = new MainPanel(mSize);
    int refactored = mainN.convertToInt(x);
    int orig = mainN.convertToIntOrig(x);
    assertEquals(orig, refactored);
  }
  
  //Should cause number formatting exception
  @Test(expected=NumberFormatException.class)
  public void convertToIntNegative()
  {
    int x= (-Integer.MAX_VALUE);
    MainPanel mainN = new MainPanel(mSize);
    int refactored = mainN.convertToInt(x);
    int orig = mainN.convertToIntOrig(x);
    assertEquals(orig, refactored);
  }
/*  Test that failed to alert me to a problem with the method not accepting negatives
  @Test
  public void convertToIntNegativeFailed()
  {
    int x= (-Integer.MAX_VALUE);
    MainPanel mainN = new MainPanel(mSize);
    int refactored = mainN.convertToInt(x);
    int orig = mainN.convertToIntOrig(x);
    assertEquals(orig, refactored);
  }
  */
  
  @Test
  public void convertToIntZero()
  {
    int x= 0;
    MainPanel mainN = new MainPanel(mSize);
    int refactored = mainN.convertToInt(x);
    int orig = mainN.convertToIntOrig(x);
    assertEquals(orig, refactored);
  }
  
   public static void main(String args[]){
    org.junit.runner.JUnitCore.main("PinningTests");
  }
}