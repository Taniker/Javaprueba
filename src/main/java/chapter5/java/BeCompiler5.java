package chapter5.java;

public class BeCompiler5 {
    public static void main(String[] args) {
        BeCompiler5 o = new BeCompiler5();
        o.go();
    }

    void go() {
        int y = 7;

        for (int x = 1; x < 8; x++) {
            y++;

            if (x > 4) {
                System.out.println(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x= " + x);
                break;
            }
        }
    }
}
