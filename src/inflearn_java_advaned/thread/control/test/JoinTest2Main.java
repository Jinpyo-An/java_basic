package inflearn_java_advaned.thread.control.test;

import static inflearn_java_advaned.util.MyLogger.log;
import static inflearn_java_advaned.util.ThreadUtils.sleep;

public class JoinTest2Main {

    public static void main(String[] args) throws InterruptedException {
        final Thread t1 = new Thread(new MyTask(), "t1");
        final Thread t2 = new Thread(new MyTask(), "t2");
        final Thread t3 = new Thread(new MyTask(), "t3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("모든 스레드 실행 완료");
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <=3 ; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
