package leetcode.threehunderd300;

/**
 * Created by ray on 9/12/17.
 */
public class Q258AddDigits {
    public int addDigits(int num) {
        int count = num;

        while(count >=10) {

            count = 0;
            while(num>=10) {
                count +=num%10;
                num = num/10;
            }
            count += num;
            num = count;
        }
        return count;
    }
}
