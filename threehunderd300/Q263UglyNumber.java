package leetcode.threehunderd300;

/**
 * Created by ray on 9/12/17.
 */
public class Q263UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) {return false;}

        while (num%2 == 0) {
            num /=2;
        }
        while (num%3 == 0) {
            num /=3;
        }
        while (num%5 == 0) {
            num /=5;
        }
        return num==1;
    }
}
