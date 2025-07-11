package enums;

public enum Apple {

    A(100),
    B(200),
    C(300);

    int size;
    private Apple(int size) {
        this.size = size;
    }

    public void display() {
        System.out.println("Apple A size: "+A.size);
        System.out.println("Apple B size: "+B.size);
        System.out.println("Apple C size: "+C.size);
    }
}
