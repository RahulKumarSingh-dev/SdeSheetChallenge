import java.util.*;
import java.io.*;
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class MergeIntervals {
  static class Interval {
    int start, finish;

    Interval(int start, int finish) {
      this.start = start;
      this.finish = finish;
    }
  }

  public static List<Interval> mergeIntervals(Interval[] intervals) {
    // write your code here.
    Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
    List<Interval> ans = new ArrayList<>();
    ans.add(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
      Interval last = ans.get(ans.size() - 1);
      Interval curr = intervals[i];
      if (last.finish >= curr.start) {
        last.finish = Math.max(last.finish, curr.finish);
      } else
        ans.add(curr);
    }
    return ans;
  }
}
