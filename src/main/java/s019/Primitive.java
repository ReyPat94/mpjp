package s019;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println(flag);

        /*
         * apice singolo per i caratteri,
         * doppio per le stringhe
         */
        char c = 'A';
        System.out.println(c);

        byte y = 42;
        System.out.println(y);

        /*
         * l'underscore al posto delle migliaia
         * usato in java per comodità
         */
        short x = 12_000;
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        /*
         * la L finale rappresenta un long
         * mettila maiuscola sennò si confonde
         * con un 1
         */
        long z = 1_000_000_000_000_000L;
        System.out.println(z);

        /*
         * idem per i float, metti F
         * sennò è double
         */
        float f = 3.12e20F;
        System.out.println(f);

        double d = 3.12e200;
        System.out.println(d);
        
        double nan = Double.NaN;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        
        if(!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
