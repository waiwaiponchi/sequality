package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testSum() {
    // Testing sum method
    assertEquals(5, Calculate.sum(2, 3));
    assertEquals(0, Calculate.sum(-2, 2));
    assertEquals(-5, Calculate.sum(-2, -3));
  }

  @Test
  public void testAverage() {
    // Testing average method
    assertEquals(2.5, Calculate.average(2, 3), 0.0001);
    assertEquals(0.0, Calculate.average(-2, 2), 0.0001);
    assertEquals(-2.5, Calculate.average(-2, -3), 0.0001);
  }

  @Test
  public void testSumRange() {
    // Testing sumRange method
    assertEquals(55, Calculate.sumRange(1, 10));
    assertEquals(0, Calculate.sumRange(-5, 5));
    assertEquals(-15, Calculate.sumRange(-5, -1));
  }

  @Test
  public void testAverageRange() {
    // Testing averageRange method
    assertEquals(5.5, Calculate.averageRange(1, 10), 0.0001);
    assertEquals(0.0, Calculate.averageRange(-5, 5), 0.0001);
    assertEquals(-3.0, Calculate.averageRange(-5, -1), 0.0001);
  }

  @Test
  public void testSumOddRange() {
    // Testing sumOddRange method
    assertEquals(25, Calculate.sumOddRange(1, 10));
    assertEquals(0, Calculate.sumOddRange(-2, 2));
    assertEquals(-9, Calculate.sumOddRange(-5, -1));
  }

  @Test
  public void testSumEvenRange() {
    // Testing sumEvenRange method
    assertEquals(30, Calculate.sumEvenRange(1, 10));
    assertEquals(0, Calculate.sumEvenRange(-1, 1));
    assertEquals(-6, Calculate.sumEvenRange(-5, -1));
  }
}
