package leetcode.seventy70;

/**
 * Created by ray on 7/9/17.
 */
public class Q67AddBinary {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        if(a == null || a.isEmpty()) {
            return b;
        }
        if(b == null || b.isEmpty()) {
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        int alen = a.length() - 1, blen = b.length() -1, carry = 0;
        int digit = 0,d = 0;
        int aByte;
        int bByte;

        while(alen>-1 || blen>-1 || carry ==1) {
            aByte = (alen > -1) ? Character.getNumericValue(aArray[alen--]) : 0;
            bByte = (blen > -1) ? Character.getNumericValue(bArray[blen--]) : 0;
            digit = aByte + bByte +carry;
            carry = digit /2;
            d = digit%2;
            sb.append(d);
        }

        return sb.reverse().toString();
    }
}
