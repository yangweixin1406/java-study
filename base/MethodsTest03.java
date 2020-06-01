public class MethodsTest03 {
    // 定义的方法有static关键字的时候，调用方法使用  类名.方法名（实际参数）
    // 【修饰符】 返回值类型 方法名 (形参) { 方法体 }
    public static void main (String[] args) {
        System.out.println(MethodsTest03.sumInt(1, 9));
    }

    // 返回值类型：byte，short，int，long，float，double,boolean,char
    // void是空
    // 返回值类型不是void，表示这个方法执行结束必须返回一个具体的数值
    public static int sumInt (int a, int b) {
        return a + b;
    }
}