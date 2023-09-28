package app;

class DevB extends Device {
    private int constant;

    public DevB(int a, int b, int constant) {
        super(a, b);
        this.constant = constant;
    }

    public int getResult() {
        return (a * b) * constant;
    }
}