package app;

    abstract class Device {
        static int a;
        static int b;

        public Device(int a, int b) {
            this.a = a;
            this.b = b;

        }

        public abstract int getResult();

    }




