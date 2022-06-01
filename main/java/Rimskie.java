public enum Rimskie {
    C(100), XC(90), L(50), XL(40),
    X(10), IX(9), V(5), IV(4), I(1),
    II(2), III(3);
    private int value;

    Rimskie(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
