package bora.singleton.classic;

public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    // 기타 인스턴스 변수

    private SynchronizedSingleton() {}

    public synchronized static SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
