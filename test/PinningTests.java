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
  
  //tests for the cell tostring include dead and alive with and without the constructor
  @Test
  public void toStringAliveCon()
  {
    Cell c = new Cell(true);
    String x=c.toString();
    assertEquals("X",x);
  }
  
  @Test
  public void toStringDeadCon()
  {
    Cell c = new Cell(false);
    String x=c.toString();
    assertEquals(".",x);
  }
  
  @Test //tests the setAlive() still works
  public void toStringAlive()
  {
    //without constructor
    Cell c = new Cell();
    c.setAlive(true);
    String x=c.toString();
    assertEquals("X",x);
  }
  
  @Test //tests the setDead() still works
  public void toStringDead()
  {
    //without constructor
    Cell c = new Cell();
    c.setAlive(false);
    String x=c.toString();
    assertEquals(".",x);
  }
  
   public static void main(String args[]){
    org.junit.runner.JUnitCore.main("PinningTests");
  }
}