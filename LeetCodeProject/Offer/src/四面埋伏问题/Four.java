package 四面埋伏问题;

import java.util.Random;

public class Four {
    static int money = 100;
    static Random random = new Random();
    public static void main(String[] args){
        System.out.println(getCount(1000000));
    }

    private static int getCount(int i) {
        int total = 0;
        int total2 = 0;
        int[] ambushes = layAmbushes();
        for (int a = 0;a<i;a++){
        //一次选择
            //自己选择一个
        int myInt = randomInt4();
//        System.out.println("自己选择了:"+myInt);
        //主持人选择一个
        int hostInt = getHostInt(ambushes,myInt);

        //自己不能选择了
            total+=ambushes[myInt]==1?money:0;

            //自己还可以选择
            int myNewInt = getMyNewInt(hostInt);
            total2+=ambushes[myNewInt]==1?money:0;

        }
        float t1 = total*1.0f/i;
        float t2 = total2*1.0f/i;

        System.out.println("如果自己不能选择得到的钱数:"+t1);
        System.out.println("如果自己可以选择得到的钱数:"+t2);



        return 0;
    }

    //得到不等于这个数的新的int
    private static int getMyNewInt(int hostInt) {
        int k ;
        do {
            k = randomInt4();
        }while (k==hostInt);
        return k;
    }

    //得到主持人的一个位置，与自己选择的不同 并且是有埋伏的一个
    private static int getHostInt(int[] ambushes, int myInt) {
        int k;
        do {
            k = randomInt4();
        }while (ambushes[k]!=0||k==myInt);
        return k;
    }

    private static int randomInt4() {
        return random.nextInt(4);
    }

    //返回四个随机数 三个0 一个1
    private static int[] layAmbushes() {
        int[] res = new int[]{0,0,0,0};
        int index = randomInt4();
        res[index] = 1;
        System.out.println("随机生成位置在："+index);
        return res;
    }
}
