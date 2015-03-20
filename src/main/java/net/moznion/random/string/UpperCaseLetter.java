package net.moznion.random.string;

import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class UpperCaseLetter implements Letter {
  @Getter
  private static final List<String> VALUES = Collections.unmodifiableList(Arrays.asList(
      "A", "B", "C", "D", "E", "F", "G", "H",
      "I", "J", "K", "L", "M", "N", "O", "P",
      "Q", "R", "S", "T", "U", "V", "W", "X",
      "Y", "Z"));
  private static final int SIZE = VALUES.size();
  private static final Random RANDOM = new Random();

  @Override
  public String getRandomLetter() {
    return VALUES.get(RANDOM.nextInt(SIZE)).toString();
  }
}