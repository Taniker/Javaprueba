
package svqjug.java;

public class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new Puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
            //System.out.println("obs[x].doS " + obs[x].doStuff(x));
        }
        System.out.println("result " + result);
    }
}

class Puzzle4b {
    int ivar;

    public int doStuff(int factor) {
        if (ivar > 100) {
            System.out.println("factor " + factor);
            System.out.println("ivar > 100 " + ivar);
            return ivar * factor;


        } else {
            System.out.println("factor else" + factor);
            return ivar * (5 - factor);
            //System.out.println("ivar else " +ivar);

        }

    }
}
