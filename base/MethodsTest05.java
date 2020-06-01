public class MethodsTest05 {
    public static void main (String[] args) {
        A.m();
        m2();
    }

    public static void m2 () {
        System.out.println("I am M2 functio");
    }
}

class A {
    public static void m () {
        System.out.println("I am A methods");
    }
}