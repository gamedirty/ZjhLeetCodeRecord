package 四面埋伏问题;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        Random random = new Random();
        for (int i = 0;i<1000;i++){
            int ran = random.nextInt(4);
            switch (ran){
                case 0:
                    n0++;
                    break;
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
            }
        }
        System.out.println("0出现的次数是："+n0+",1出现的次数是:"+n1+",2出现的次数是:"+n2+",3出现的次数是:"+n3);
    }
}
