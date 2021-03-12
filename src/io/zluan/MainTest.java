package io.zluan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MainTest {
  @Test public void testFunFact_likeB() {
    Main main = new Main();
    String expected = main.getFunFacts(true);
    assertEquals(expected, "I like ba");
  }
}