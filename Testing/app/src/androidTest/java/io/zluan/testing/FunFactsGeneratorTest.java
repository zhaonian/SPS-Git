package io.zluan.testing;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public final class FunFactsGeneratorTest {

  @Test
  public void getFunFacts_personLikesBasketball_shouldHaveBothFunFacts() {
    List<String> expectedFunFacts = Arrays.asList("I like coding", "I like basketball");
    List<String> actualFunFacts = FunFactsGenerator.getFunFacts(true);
    assertEquals(expectedFunFacts, actualFunFacts);
  }

  @Test
  public void getFunFacts_personDoesNotLikeBasketball_shouldOnlyHaveIlikeCoding() {
    List<String> expectedFunFacts = Arrays.asList("I like coding");
    List<String> actualFunFacts = FunFactsGenerator.getFunFacts(false);
    assertEquals(expectedFunFacts, actualFunFacts);
  }
}
