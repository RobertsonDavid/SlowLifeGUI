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
  
  @Test
  public void convertToIntNegative()
  {
    int x= (Integer.MAX_VALUE)*-1;
    MainPanel mainN = new MainPanel(mSize);
    int refactored = mainN.convertToInt(x);
    int orig = mainN.convertToIntOrig(x);
    assertEquals(orig, refactored);
  }
  
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