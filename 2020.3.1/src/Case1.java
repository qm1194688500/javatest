public class Case1 {
    static final int COUNT = 10;
    static final long NUMBER = 10_0000_0000;
    static long sum(){
        long r = 0;
        for (long i = 0; i <NUMBER ; i++) {
            r+=i;
            }
            return r;
    }
    static void one(){
        long b = System.nanoTime();
        for (int i = 0; i <COUNT ; i++) {
            System.out.println(sum());
        }
        long e = System.nanoTime();
        double s = (e-b)/1000_000_000.0;
        System.out.printf("单线程，运行时间: %f%n", s);
    }
    static class SumThread extends Thread {
        @Override
        public void run() {
            System.out.println(sum());
        }
    }


    static void 多线程() throws InterruptedException {
        long b = System.nanoTime();
        // 因为当前也处于一个线程中，所以，只需要再创建 COUNT - 1 个线程就够了
        Thread[] threads = new Thread[COUNT - 1];
        for (int i = 0; i < COUNT - 1; i++) {
            // 最后执行的就是上面定义的类中的 run 方法
            threads[i] = new SumThread();
            threads[i].start();
        }

        // 剩下的一次，当前线程来计算
        System.out.println(sum());

        // 当前线程计算结束了，但还需要等另外的 COUNT - 1 个线程结束（计算完了）
        for (int i = 0; i < COUNT - 1; i++) {
            threads[i].join();
        }

        long e = System.nanoTime();

        double s = (e - b) / 1000_000_000.0;
        System.out.printf("多线程，运行时间: %f%n", s);
    }

    public static void main(String[] args) throws InterruptedException {
        // main 有个线程
        one();
        System.out.println("=================================");
        多线程();
    }
}
