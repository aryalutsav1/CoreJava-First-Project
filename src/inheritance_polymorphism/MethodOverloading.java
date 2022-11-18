package src.inheritance_polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {

        int a = 5;
        float b=6;
        float c = (float) (a/b);
        System.out.println(c);
        System.out.println("b = "+b);
        int f = Integer.MAX_VALUE;
        System.out.println(f);
        float g = (float) f;
        System.out.println(g);
    }

}
