import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  private Calculator calculator;

  @Before
  public void setUp() {
    calculator = new Calculator();
  }

  @After
  public void tearDown() {
    calculator = null;
  }
//  addition testing:
  // + +
//  - +
//  - -

  @Test
  public void plusplusAddition() {
    final int exp = 9;
    final int res = calculator.add(3, 6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void plusminusAddition() {
    final int exp = -3;
    final int res = calculator.add(3, -6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void minusminusAddition() {
    final int exp = -9;
    final int res = calculator.add(-3, -6);
    Assert.assertEquals(exp, res);
  }

//  substract testing:
//  + +
//  - +
//  - -
  @Test
  public void plusplusSubstraction() {
    final int exp = -3;
    final int res = calculator.substract(3, 6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void plusminusSubstraction() {
    final int exp = 9;
    final int res = calculator.substract(3, -6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void minusminusSubstraction() {
    final int exp = 3;
    final int res = calculator.substract(-3, -6);
    Assert.assertEquals(exp, res);
  }

//  multiplication testing
//  + +
//  + -
//  - -
//  + 0
//  - 0
  @Test
  public void plusplusMultiplication() {
    final int exp = 18;
    final int res = calculator.mulitply(3, 6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void plusminusMultiplication() {
    final int exp = -18;
    final int res = calculator.mulitply(3, -6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void minusminusMultiplication() {
    final int exp = 18;
    final int res = calculator.mulitply(-3, -6);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void pluszeroMultiplication() {
    final int exp = 0;
    final int res = calculator.mulitply(3, 0);
    Assert.assertEquals(exp, res);
  }
  @Test
  public void minuszeroMultiplication() {
    final int exp = 0;
    final int res = calculator.mulitply(-3, 0);
    Assert.assertEquals(exp, res);
  }

//  division testing
  @Test
  public void nonzeroDivision() {
    final double exp = 2.0;
    final double res = calculator.divide(10, 4);
    Assert.assertEquals(exp, res, 0.0);
  }
  @Test(expected = IllegalArgumentException.class)
  public void zeroDivision() {
    calculator.divide(10, 0);
  }
}
