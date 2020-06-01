public class MethodsTest01 {
    public static void main (String[] args) {
        MethodsTest01.sumInt(10, 30);
    }
    // 方法体当中不能再定义方法
    public static void sumInt (int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}