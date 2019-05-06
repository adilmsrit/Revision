package Practice;

public class FinallyConcept {
  public static void main(String[] args) {
    FinallyConcept finallyConcept = new FinallyConcept();
    finallyConcept.test1();
  }

  public void test1() {
    try {
      System.out.println("Inside test1 method");
      throw new RuntimeException("Runtime exception message ad");
    } catch (Exception e) {
      System.out.println("inside catch block");
      //System.out.println(e.getMessage());
    } finally {
      System.out.println("Inside Finally");
    }
  }


}
