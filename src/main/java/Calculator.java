public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b) {
    return a - b;
  }

  public int mulitply(int a, int b) {
    return a * b;
  }

  public double divide(int a, int b) {
    if(b == 0) {
      throw new IllegalArgumentException("Division with 0 is illegal");
    }
    return a / b;
  }
}
