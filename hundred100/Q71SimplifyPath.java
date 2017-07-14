import java.util.*;

/**
 * Created by wanxinrui on 2017/7/10.
 *
 *
 * 很多陷阱的地方
 */
public class Q71SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> dq = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        String[] pathlist = path.split("/");
        int lenpath = pathlist.length;

        for (int i = 0; i < lenpath;i++) {
            if(pathlist[i].equals("..") && !dq.isEmpty() ) {
                dq.pop();
            } else if (!pathlist[i].equals(".") && !pathlist[i].equals("")&& !pathlist[i].equals("..")) {
                dq.push( pathlist[i]);
            }
            //else if (!skip.contains( pathlist[i])) dq.push( pathlist[i]);
        }
        String res = "";
        while(!dq.isEmpty()) {res =  '/' + dq.pop() +  res ;}

        return res.isEmpty()?"/":res;
    }
}
