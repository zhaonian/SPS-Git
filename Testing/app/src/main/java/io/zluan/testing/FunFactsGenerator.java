package io.zluan.testing;

import java.util.ArrayList;
import java.util.List;

final class FunFactsGenerator {

  public static List<String> getFunFacts(boolean likeBasketball) {
    List<String> funFacts = new ArrayList<>();
    funFacts.add("I like coding");
    if (likeBasketball) {
      funFacts.add("I like basketball");
    }
    return funFacts;
  }
}
