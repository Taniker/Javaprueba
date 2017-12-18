package svqjug.java;

public class XCopy {
    public static void main(String[] args) {
        IntContainer original = new IntContainer();
        original.value = 42;

        XCopy x = new XCopy();
        IntContainer returnFromGo = x.go(original);
        System.out.println(original.value + " " + returnFromGo.value);
    }

    private IntContainer go(IntContainer arg) {
        arg.value = arg.value * 2;
        return arg;
    }
}

class IntContainer {
    int value;
}
