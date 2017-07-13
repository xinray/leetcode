package leetcode.hundred100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ray on 7/13/17.
 */
public class Q93RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> ls = new ArrayList<>();
        int len = s.length();
        for(int i=1;i<=3;i++) {
            if((len-i)>9) continue;
            for(int j=i+1;j<=i+3;j++) {
                if((len-j)>6) continue;
                for(int k=j+1;k<=j+3 && k<len;k++) {
                    int a = Integer.parseInt(s.substring(0,i));
                    int b = Integer.parseInt(s.substring(i,j));
                    int c = Integer.parseInt(s.substring(j,k));
                    int d = Integer.parseInt(s.substring(k));
                    if(a<=255 && b<=255 && c<=255 && d<=255 ) {
                        String ip = a+"."+b+"."+c+"."+d;
                        if (ip.length()<len+3) continue;
                        ls.add(ip);
                    }
                }
            }
        }

        return ls;
    }
}
