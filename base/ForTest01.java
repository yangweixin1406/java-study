public class ForTest01 {
    public static void main (String[] args) {
        int i = 7;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(i + (flag ? "是素数" : "不是素数"));
    }
}