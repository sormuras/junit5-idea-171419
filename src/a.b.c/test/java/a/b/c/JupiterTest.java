package a.b.c;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JupiterTest {
  @Test
  void moduleIsNamed() {
    Assertions.assertTrue(getClass().getModule().isNamed());
  }
}
