package Semana2;

public class B{

    public void m(){
        System.out.println("B.m()");
    }
    public void p(){
        System.out.println("B.p()");
    }
    public static void main(String[] args) {
        B b2 = new B();
        b2.p();
    }
}