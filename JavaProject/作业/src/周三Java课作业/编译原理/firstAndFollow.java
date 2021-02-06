package 周三Java课作业.编译原理;

import java.util.Scanner;


public class firstAndFollow {
    static String TSTR_FIRST = "";
    static String TSTR_FOLLOW = "";
    static int size = 0;
    static String[][] preResult = null;
    static String[][] first = null;
    static String[][] follow = null;
    public static void main(String[] args) {
        preResult = input();
        size = preResult.length;
        first = getFirst();
        System.out.println("first集：");
        for (String[] strings : first) {
            System.out.print("First(" + strings[0] + ")={");
            int i = 0;
            for (i = 0; i < strings[1].length() - 1; i++) {
                System.out.print(strings[1].charAt(i) + ",");
            }
            System.out.println(strings[1].charAt(i) + "}");
        }
        follow = getFollow();
        System.out.println("follow集：");
        for (String[] strings : follow) {
            System.out.print("Follow(" + strings[0] + ")={");
            int i = 0;
            if (strings[1].length() == 1) {
                System.out.println(strings[1].charAt(i) + "}");
            }else if (strings[1].length() > 1) {
                for (i = 0; i < strings[1].length() - 1; i++) {
                    System.out.print(strings[1].charAt(i) + ",");
                }
                System.out.println(strings[1].charAt(i) + "}");
            }else {
                System.out.println("}");
            }
        }

    }
    private static String[][] getFirst() {
        String[][] first = new String[size][2];
        for (int i = 0; i < size; i++) {
            first[i][0] = preResult[i][0];
            try {
                getF(preResult[i][0], preResult[i][1]);
            } catch (Exception e) {
                System.out.println("存在递归");
            }
            first[i][1] = TSTR_FIRST;
            TSTR_FIRST = "";
        }
        return first;
    }
    private static String getF(String str1, String str2) {
        String temp = "";
        if (str2.contains("|")) {
            String[] strtemp;
            strtemp = str2.split("\\|");
            for (int i = 0; i < strtemp.length; i++) {
                getF(str1, strtemp[i]);
            }
        } else {
            if ('A' <= str2.charAt(0) && str2.charAt(0) <= 'Z') {
                for (int i = 0; i < size; i++) {
                    if (preResult[i][0].equals(String.valueOf(str2.charAt(0)))) {
                        if (!str1.equals(String.valueOf(str2.charAt(0))))
                            getF(preResult[i][0], preResult[i][1]);
                    }
                }
            } else {
                temp = String.valueOf(str2.charAt(0));
                if (!TSTR_FIRST.contains(temp))
                    TSTR_FIRST = TSTR_FIRST.concat(String.valueOf(str2.charAt(0)));
            }
        }
        return temp;
    }
    private static String[][] getFollow() {
        String[][] Follow = new String[size][2];

        for (int i = 0; i < size; i++) {
            Follow[i][0] = preResult[i][0];
            getFo(preResult[i][0]);
            Follow[i][1] = TSTR_FOLLOW;
            TSTR_FOLLOW = "";
        }
        for (int i = 0; i < size; i++) {
            StringBuffer sb = new StringBuffer(Follow[i][1]);
            for (int j = 0; j < sb.length(); j++) {
                String temp = sb.toString();
                if (sb.charAt(j) == 'ε') {
                    sb.deleteCharAt(j);
                    temp = sb.toString();
                }
                Follow[i][1] = temp;
            }
        }
        return Follow;

    }

    // 递归求follow
    private static String getFo(String str3) {
        if (str3.equals(preResult[0][0])) {
            if (!TSTR_FOLLOW.contains("#"))
                TSTR_FOLLOW = TSTR_FOLLOW.concat("#");
        }
        for (int i = 0; i < size; i++) {
            if (preResult[i][1].contains(str3)) {
                char[] ch = preResult[i][1].toCharArray();
                for (int j = 0; j < ch.length; j++) {
                    if (str3.equals(String.valueOf(ch[j]))) {/*&& ch[j + 1] != '|'*/
                        if (j + 1 < ch.length && ch[j + 1] != '|') {
                            if ('A' <= ch[j + 1] && ch[j + 1] <= 'Z') {//下一个是非终结符
                                for(int k =0;k < size; k++){
                                    if (first[k][0].equals(String.valueOf(ch[j + 1]))) {
                                        if (first[k][1].contains("ε")) {
                                            if (first[k][0].equals(str3))  break;
                                            String strr = getFo(first[k][0]);
                                            if (!TSTR_FOLLOW.contains(strr))
                                                TSTR_FOLLOW = TSTR_FOLLOW.concat(String.valueOf(strr));
                                        }
                                    }
                                }
                                // 把后面的first集加到该follow集中
                                for (int k = 0; k < size; k++) {
                                    if (first[k][0].equals(String.valueOf(ch[j + 1]))) {
                                        if (!TSTR_FOLLOW.contains(first[k][1]))
                                            TSTR_FOLLOW = TSTR_FOLLOW.concat(first[k][1]);
                                        break;
                                    }
                                }
                            }
                            else if (isT(String.valueOf(ch[j + 1]))) {//下一个是终结符
                                if (!TSTR_FOLLOW.contains(String.valueOf(ch[j+1])))
                                {
                                    TSTR_FOLLOW = TSTR_FOLLOW.concat(String.valueOf(ch[j + 1]));
                                }
                            }
                        } else {
                            if (preResult[i][0].equals(str3))  break;
                            String strr = getFo(String.valueOf(preResult[i][0]));
                            if (!TSTR_FOLLOW.contains(strr))
                                TSTR_FOLLOW = TSTR_FOLLOW.concat(String.valueOf(strr));
                        }
                        break;
                    }
                }
            }
        }
        return TSTR_FOLLOW;
    }
    private static boolean isT(String tmp){
        for (int i = 0; i < size; i++) {
            if (tmp.equals(preResult[i][0]))  return false;
        }
        return true;
    }
    private static String[][] input(){
        Scanner in = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String temp = null;
        while(!(temp = in.next()).equals("end")){
            sb.append(temp);
        }
        in.close();
        String[] wenfas = sb.toString().split(";");
        String[][] chaifen = new String[wenfas.length][2];
        int tmp = 0;
        for (String string : wenfas) {
            chaifen[tmp] = string.split("->");
            tmp++;
        }
        char xx = 'A';
        for(int m = 0; m < chaifen.length; m++){
            if (chaifen[m][0].contains("’")) {
                String temp1 = chaifen[m][0];
                for (int n = 0; n < chaifen.length; n++) {
                    if (chaifen[n][1].contains(temp1)) {
                        chaifen[n][1] = chaifen[n][1].replaceAll(temp1, xx+"");
                    }
                    if (chaifen[n][0].equals(temp1)) {
                        chaifen[n][0] = xx + "";
                    }
                }
                xx++;
            }
        }

        return chaifen;
    }

}
