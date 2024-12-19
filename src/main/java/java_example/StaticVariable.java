package java_example;

public class StaticVariable {
    int nonStaticVariable = 10;
    static int staticVariable = 20;

    public static void staticMethod(){
        System.out.println(staticVariable);  // non-static variable static metodun daxilinde yerlese bilmir compile error verir
    }

    public void nonStaticMethod(){
        System.out.println(nonStaticVariable);
    }
}
