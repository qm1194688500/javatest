public class Outclass {
    private class Inner implements InterfaceClass{
        @Override
        public void run() {
            System.out.println("Hello");
        }
    }
    public InterfaceClass getInterfaceClass(){
        return new Inner();
    }
}
