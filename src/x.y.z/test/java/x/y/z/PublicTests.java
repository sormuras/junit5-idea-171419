package x.y.z;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PublicTests {
    @Test
    void moduleIsNamed() {
        Assertions.assertTrue(getClass().getModule().isNamed());
    }
}
