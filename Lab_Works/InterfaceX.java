// Program to show Interfacing between two classes
package Lab_Works;
    public interface InterfaceX {
        int doubleInt(int i);
    }
    class ClassA implements InterfaceX {
        @Override
        public int doubleInt(int i) {
            return i + i;
        }
    }
    class ClassB implements InterfaceX {
        @Override
        public int doubleInt(int i) {
            return 2 * i;
        }
    }
    class TestInterface {
        public static void main(String[] args) {
            new TestInterface();
        }

        public TestInterface() {
            InterfaceX i1 = new ClassA();
            InterfaceX i2 = new ClassB();
            System.out.println("i1 is class " + i1.getClass().getName());
            System.out.println("i2 is class " + i2.getClass().getName());
        }
    }