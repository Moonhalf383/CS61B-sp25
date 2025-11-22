import java.util.ArrayList;
import java.util.List;

public class ListExercises {

  /** Returns the total sum in a list of integers */
  public static int sum(List<Integer> L) {
    // TODO: Fill in this function.
    int sum = 0;
    for (int i : L) {
      sum += i;
    }
    return sum;
  }

  /** Returns a list containing the even numbers of the given list */
  public static List<Integer> evens(List<Integer> L) {
    // TODO: Fill in this function.
    List<Integer> evenList = new ArrayList<>();
    for (Integer i : L) {
      if (i % 2 == 0)
        evenList.add(i);
    }
    return evenList;
  }

  /** Returns a list containing the common item of the two given lists */
  public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
    // TODO: Fill in this function.
    List<Integer> commonList = new ArrayList<>();
    for (Integer i1 : L1) {
      for (Integer i2 : L2) {
        if (i1 == i2) {
          Boolean state = true;
          for (Integer i3 : commonList) {
            if (i3 == i1)
              state = false;
          }
          if (state)
            commonList.add(i1);
        }
      }
    }
    return commonList;
  }

  /**
   * Returns the number of occurrences of the given character in a list of
   * strings.
   */
  public static int countOccurrencesOfC(List<String> words, char c) {
    // TODO: Fill in this function.
    int occurrences = 0;
    for (String word : words) {
      for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) == c)
          occurrences += 1;
      }
    }
    return occurrences;
  }
}
