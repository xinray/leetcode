package leetcode.threehunderd300;

/**
 * Created by ray on 7/30/17.
 */
public class Q204CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count =0;
        for(int i=2;i<n;i++) {
            if(notPrime[i] == false) {
                count++;
                for(int j=2;i*j<n;j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}
