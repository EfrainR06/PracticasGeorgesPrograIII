package Semana3;

import java.io.UnsupportedEncodingException;

public class Experimento4 {

    public static void main(String[] args) {
        try {
            byte[] utf8Bytes = "ñ".getBytes("UTF-8");
            for (int i = 0; i < utf8Bytes.length; i++) {
                System.out.printf("utf8Bytes[%d] = %4d (%2$2x) %n",
                        i, utf8Bytes[i]); // Resultado: 0xc3 0xb1
            }
            System.out.println();

            String s = new String(new byte[]{(byte) 0xC3, (byte) 0xB1}, "UTF-8");
            System.out.println(s);  // Resultado: ñ
            System.out.println();

        } catch (UnsupportedEncodingException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }

    }

}