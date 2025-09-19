package ex_02_JavaPrograms;

public class Lab006_Common_Math_Exception {
    public static void main(String[] args) {
        System.out.println(10/0);
        //JVM will give us the error --> "Exception in thread "main" java.lang.ArithmeticException"
    }
}
