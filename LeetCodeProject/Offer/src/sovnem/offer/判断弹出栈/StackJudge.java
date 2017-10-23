package sovnem.offer.判断弹出栈;

/**
 * 题目描述：
 *          输入两个整数序列，第一个序列表示栈的压入顺序，
 *          请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 *          例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列
 *          ，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */

/**
 * 解：
 *
 */
public class StackJudge {
   static int[] push = new int[]{1,2,3,4,5};
   static int[] pop = new int[]{2,1,4,3,5};

    /**
     * 按照压入得顺序依次压入数据
     * 同时比较最后依次压入得数据是不是和弹出队列的剩余的第一个相等，如果相等
     *
     * 则从当前压入队列的下标开始往前，从弹出队列的第一个数据往后遍历，直到到达压入队列的第一个元素，判断是不是全部相等。
     *
     * 如果不相等则返回false
     *
     * 如果相等，从刚才记录到的初始坐标开始重复进行上边的判断。
     *
     * @param args
     */
   public static void main(String[] args){
       System.out.println("是不是弹出栈啊："+IsPopOrder(push,pop));
   }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int start = 0;
        int end;
        for (int i = 0;i<pushA.length;i++){
            if (pushA[i]==popA[start]){//遍历所有元素与弹出序列的第start个数据做对比，相等的话，遍历判断此时push下标以前和pop序列的数据是不是相等。
                end = i;
                for (int j = start;j<=end;j++){
                    if (pushA[j]!=popA[start+end-j]){
                        return false;
                    }
                }
                start = i+1;
            }
        }
        return true;
    }

}
