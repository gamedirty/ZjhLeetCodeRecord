package 剑指offer;

public class Singleton {
    private Singleton() {
        System.out.println("单例初始化");
    }

    static class Holder {
        static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }

}
