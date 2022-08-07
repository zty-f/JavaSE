package main.test03;

public enum Singleton05 {
    INSTANCE;

    private static Singleton05 getInstance(){
        return INSTANCE;
    }
}
