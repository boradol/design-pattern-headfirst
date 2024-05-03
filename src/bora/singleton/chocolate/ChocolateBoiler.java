package bora.singleton.chocolate;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {

        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        System.out.println(this + " : fill");
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        System.out.println(this + " : drain");
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        System.out.println(this + " : boil");
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
