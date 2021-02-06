public class 数字翻译 {
    //给定一个数字，按照如下规则翻译为字符串，0翻译为"a",1翻译为"b",25翻译为"z"。
    // 这样一个数字有可能存在多个翻译，例如，12258有5种不同的翻译，分别是bccfi, bwfi,bczi,mcfi,mzi等等。

    public static int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }
        int y = num % 100;
        if (y <= 9 || y >= 26) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }

    public static void main(String[] args) {
        int a = 12258;
        System.out.println(translateNum(a));
    }
}
