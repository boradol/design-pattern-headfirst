package bora.singleton.classic;

public class DclSingleton {
    private static DclSingleton uniqueInstance;

    // 기타 인스턴스 변수

    private DclSingleton() {}

    public static DclSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DclSingleton.class) {
                uniqueInstance = new DclSingleton();
            }
        }
        return uniqueInstance;
    }
}
