package svqjug.java;

public class Numeros {
    public static void main(String[] args) {
        int[] numerosPares = new int[11];
        int x = 1;
        int i;

        while (x < 11) {
            if (x % 2 == 0) {
                numerosPares[x] = x;
            }
            //System.out.println("x es "+x);
            //System.out.println(numerosPares[x]);
            x = x + 1;
        }

        for (i = 10; i >= 0; i = i - 1) {
            if (numerosPares[i] != 0) {
                //System.out.println("i es "+i);
                System.out.println(numerosPares[i]);

            }


        }

    }
}
