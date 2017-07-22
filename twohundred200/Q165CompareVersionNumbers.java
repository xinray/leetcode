package leetcode.twohundred200;

/**
 * Created by ray on 7/22/17.
 */
public class Q165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int len = Math.max(v1.length, v2.length);

        for(int i=0;i<len;i++) {
            int v12 = (v1.length >i)?Integer.parseInt(v1[i]):0;
            int v22 = (v2.length >i)?Integer.parseInt(v2[i]):0;
            if (v12 > v22) {
                return 1;
            } else if (v12 < v22) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
