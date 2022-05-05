package second.text1;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Date date = new Date();
        date.m=10;
        date.n=20;
        System.out.println("m的值为"+date.m+",n的值为"+date.n);
        ValueTransferTest2 set = new ValueTransferTest2();
        set.swap(date);
        System.out.println("m的值为"+date.m+",n的值为"+date.n);
    }
    //交换变量 此时交换的为对象
    public void swap (Date date1){     //这里括号里的数据是代表创建了一个新的变量类型为Date的数值。
                                    // 这里在栈空间里边是具有两个的date空间，但是却都指向了堆空间中同一个地址值
        int temp = date1.m;
        date1.m = date1.n;
        date1.n = temp;
    }
}
class Date{
    int m;
    int n;
}
