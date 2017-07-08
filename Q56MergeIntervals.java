package leetcode;

import sun.jvm.hotspot.utilities.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ray on 7/8/17.
 *
 *
 * 第一种方法 排序 很通用。 第二种方法 很巧妙,不错
 */
public class Q56MergeIntervals {

    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        List<Interval> ret = new ArrayList<>();
        Interval prev = null;

        for (Interval iter: intervals) {
            if( prev == null || iter.start>prev.end) {
                ret.add(iter);
                prev = iter;
            } else if(iter.end> prev.end){
                prev.end = iter.end;
            }
        }
        return ret;
    }

//    public List<Interval> merge(List<Interval> intervals) {
//        // sort start&end
//        int n = intervals.size();
//        int[] starts = new int[n];
//        int[] ends = new int[n];
//        for (int i = 0; i < n; i++) {
//            starts[i] = intervals.get(i).start;
//            ends[i] = intervals.get(i).end;
//        }
//        Arrays.sort(starts);
//        Arrays.sort(ends);
//        // loop through
//        List<Interval> res = new ArrayList<Interval>();
//        for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
//            if (i == n - 1 || starts[i + 1] > ends[i]) {
//                res.add(new Interval(starts[j], ends[i]));
//                j = i + 1;
//            }
//        }
//        return res;
//    }
}
