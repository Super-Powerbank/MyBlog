import java.util.Scanner;

public class 最长公共子串 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s1 = "";
//        String s2 = "";
//        int k = s.length();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.substring(i, i + 1).equals(" ")) {
//                s1 = s.substring(0, i);
//                s2 = s.substring(i + 1, k);
//            }
//        }
//        if (s1.length() < 1 || s1.length() > 5000 || s2.length() < 1 || s2.length() > 500) {
//            return;
//        }
//        if (s1.length() == 0 || s2.length() == 0) {
//            return;
//        }
//        int length1 = s1.length();
//        int length2 = s2.length();
//        int max = 0;
//        int posJ = 0;
//        // 上半个矩形的对角线
//        for (int j = length2 - 1; j >= 0; j--) {
//            int len = 0;
//            int j1 = j;
//            for (int i = 0; i < length1; i++) {
//                if (j1 >= length2)
//                    break;
//                if (s1.charAt(i) == s2.charAt(j1)) {
//                    len++;
//                    if (len > max) {
//                        posJ = j1;
//                        max = len;
//                    }
//                } else {
//                    len = 0;
//                }
//                j1++;
//            }
//        }
//
//        // 下半个矩形的对角线
//        for (int i = 1; i < length1; i++) {
//            int len = 0;
//            int i1 = i;
//            for (int j = 0; j < length2; j++) {
//                if (i1 >= length1) {
//                    break;
//                }
//                if (s1.charAt(i1) == s2.charAt(j)) {
//                    len++;
//                    if (len > max) {
//                        posJ = j;
//                        max = len;
//                    }
//                } else {
//                    len = 0;
//                }
//                i1++;
//            }
//        }
//
//        String str = "";
//        str = s2.substring(posJ - max + 1, posJ + 1);
//        System.out.println(str.equals("") ? "-1" : str);
//    }
//}


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        String s2 = "";
        int k = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(" ")) {
                s1 = s.substring(0, i);
                s2 = s.substring(i + 1, k);
            }
        }
        if (s1.length()<1||s1.length()>5000||s2.length()<1||s2.length()>500) {
            return ;
        }
        if (s1.length()==0||s2.length()==0){
            return;
        }

        int m = s1.length();
        int n = s2.length();
        int end = 0;
        int max = 0;
        int row = 0;
        int col = n;
        while (row < m) {
            int i = row;
            int j = col;
            int len = 0;
            while (i < m && j < n) {
                if (s1.charAt(i) != s2.charAt(j)) {
                    len = 0;
                } else {
                    len++;
                }
                if (len > max) {
                    max = len;
                    end = i;
                }
                i++;
                j++;
            }
            if (col > 0) {
                col--;
            } else {
                row++;
            }
        }
        if (max==0){
            System.out.println(-1);
        }
        System.out.println(s1.substring(end - max + 1, end + 1));
    }
}

