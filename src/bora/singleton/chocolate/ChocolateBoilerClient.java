package bora.singleton.chocolate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChocolateBoilerClient {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 클라이언트 스레드 생성
        for (int i = 0; i < 3; i++) {
            executorService.execute(new ChocolateBoilerTask());
        }

        // 스레드 풀 종료
        executorService.shutdown();
    }

    static class ChocolateBoilerTask implements Runnable {
        @Override
        public void run() {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            boiler.fill();
            boiler.boil();
            boiler.drain();
        }
    }
}
