import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class PascalTriangle {
  public static ArrayList<ArrayList<Long>> printPascal(int n) {
    // Write your code here.
    ArrayList<ArrayList<Long>> ans = new ArrayList<>();
    ArrayList<Long> prev = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ArrayList<Long> curr = new ArrayList<>();
      curr.add((long) 1);
      for (int j = 1; j < prev.size(); j++) {
        curr.add(prev.get(j) + prev.get(j - 1));
      }
      if (i != 0)
        curr.add((long) 1);
      ans.add(new ArrayList<>(curr));
      prev = curr;
    }
    return ans;
  }
}
