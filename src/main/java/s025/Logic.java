package s025;

public class Logic {
    public static void main(String[] args) {
        boolean alpha = true;
        boolean beta = false;

        System.out.println(alpha && beta); // false
        System.out.println(alpha || beta); // true
        System.out.println(!alpha); // false
        System.out.println(alpha & beta); // false
        System.out.println(alpha | beta); // true

        int gamma = 0b101; // 5
        int delta = 0b110; // 6
        
        /*
         * 000000....101
         * not: 11111....010
         * è molto semplice compiere errori
         */

        System.out.println(gamma & delta); // 4 == 0100
        System.out.println(gamma | delta); // 7 == 0111
        System.out.println(gamma ^ delta); // 3 == 0011

        System.out.println(~gamma); // -6
    }
}
