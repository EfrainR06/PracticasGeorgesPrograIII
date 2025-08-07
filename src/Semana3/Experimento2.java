//Efrain Retana Segura UNA
package Semana3;

public class Experimento2 {
    public static void main(String[] args){
        new Experimento2().init();
    }
    public void init(){

        int[] v = {6,8,3,5,4,1,2,7};

        System.out.print("{");
        for (int i = 0; i < v.length; i++){
            System.out.print(i);
            if(i < (v.length - 1)){
                System.out.print(", ");
            }
        }
        System.out.println("}");
        String s = "{";
        for(int i = 0; i  < v.length; i++){
            s+= i;
            if(i < (v.length - 1)){
                s += ", ";
            }
        }
        s+= "}";
        System.out.println(s);
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < v.length; i++) {
            sb.append(i);
            if (i < (v.length - 1)) {
                sb.append(", ");
            }
        }
        sb.append("}");
        System.out.println(sb);

        // 4. Usando una función que encapsula
        //    el código anterior.
        //
        System.out.println(vToString(v));
    }

    public String vToString(int[] v) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < v.length; i++) {
            sb.append(i);
            if (i < (v.length - 1)) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}

