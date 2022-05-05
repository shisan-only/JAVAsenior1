package second.text;
/*
* 自定义数组的工具类
* 主要是来考察封装为一个方法
 */
public class ArrysUbil {
    //求数组的最大值
    public int getMax(int[] arr) {//这里是需要来调用一个参数，用来告诉我们是想要调用谁的最大值和最小值
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //求数组的最小值
    public int getMin (int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    //求数组的总和
    public int getSum (int [] arr){

        return 0;
    }
    //求数组的平均值
    public int getAvg (int [] arr){
        return 0;
    }
    //反转数组
    public void reverse(int [] arr){

    }
    //复制数组
    public int[] copy(int [] arr){
        return null;
    }
    //数组排序
    public void sort(int [] arr){

    }
    //遍历数组
    public void print (int [] arr){

    }
    //查找指定元素
    public int getIndex(int [] arr,int dest){
        return 0;
    }
}

