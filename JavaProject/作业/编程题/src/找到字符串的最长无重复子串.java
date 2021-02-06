import java.io.*;
import java.util.*;

public class 找到字符串的最长无重复子串 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] s = br.readLine().trim().split(" ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int res = getRes(arr);
        System.out.println(res);
    }

    public static int getRes(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int[] map = new int[1000008];
        for (int i = 0; i < arr.length; i++) {
            map[arr[i]] = -1;
        }
        int pre = -1;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            pre = Math.max(pre, map[arr[i]]);
            len = Math.max(len, i - pre);
            map[arr[i]] = i;
        }
        return len;
    }
}

