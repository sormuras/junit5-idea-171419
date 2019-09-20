package a.b.c;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JupiterTest {
  @Test
  void moduleIsNamed() {
    Assertions.assertTrue(getClass().getModule().isNamed());
  }

  @Test
  void t1() {
    System.out.println("JupiterTest.t1");
  }

  @Test
  void t2() {
    System.out.println("JupiterTest.t2");
  }

  @Test
  void t3() {
    System.out.println("JupiterTest.t3");
  }
}
