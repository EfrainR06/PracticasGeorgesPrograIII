package Semana2.Ejemplo6;

public class Ejemplo6 {

    public static void main(String[] args){
        //Ejemplo6 v = new Ejemplo6();
        //v.m():

        new Ejemplo6().m();
    }

    public void m() {
        A1 a1 = new A1();
        p(a1);

        p(new A1());
        p(new Ad());
        p(new A1() { //subclase anónima
            @Override
            public void s() {
                System.out.println("Ax.s()");
            }
        });
        q(() ->{
            System.out.println("B.t()");
        });
    }
    public void p(A1 a1){
        a1.s();
    }
    public void q(IB b1){
        b1.t();
    }
}
