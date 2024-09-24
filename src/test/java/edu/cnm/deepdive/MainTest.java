package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {

  private static final double[] celsiusTemperatures = {-40, 0, 10, 20, 30, 50, 100};
  private static final double[] fahrenheitTemperatures = {-40, 32, 50, 68, 86, 122, 212};
  private static final double TOLERANCE = 0.000_000_000_1;

  @Test
  void convertC2F() {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double fahrenheit = fahrenheitTemperatures[i];
      assertEquals(fahrenheit, Main.convertC2F(celsius), TOLERANCE);
    }
  }

  @Test
  void convertF2C() {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double fahrenheit = fahrenheitTemperatures[i];
      assertEquals(celsius, Main.convertF2C(fahrenheit), TOLERANCE);
    }
  }

}
