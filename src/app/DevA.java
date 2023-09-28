package app;

class DevA extends Device {
    public DevA(int a, int b) {
        super(a, b);
    }

    public int getResult() {
        return a * b;
    }
}