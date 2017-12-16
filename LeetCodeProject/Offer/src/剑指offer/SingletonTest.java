package 剑指offer;

public class SingletonTest {
    public static void main(String[] args){
        System.out.println("args = [" + args + "]");
//        Singleton.getInstance();
        Singleton ins = Singleton.Holder.INSTANCE;
    }
}
