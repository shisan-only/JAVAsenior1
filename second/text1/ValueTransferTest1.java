package second.text1;

import java.util.Date;

/*
 * 方法的形参的传递机制：值传递
 * 1、 形参：方法定义时，声明的小括号内的参数
 *     实参：方法调用时，实际传递给形参的数据
 * 2、值传递机制
 * 如果参数为基本数据类型，此时的实参赋给形参的是，实参真实存储的数据值。
 * 如果参数为引用数据类型，此时实参赋给形参的是实参存储数据的地址值。
 * ！！！！仔细对待！！！！！
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //交换两个变量的值
//        int temp = m;
//        m = n;
//        n = temp;
        ValueTransferTest1 s1 = new ValueTransferTest1();
        //       s1.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);
    }

    // 这里引用的还是基本数据类型，那么输出后的m和n是上面代码中的m和n和此代码中的m和n是不一样的，只有在本段代码中之直接输出，那么
    //输出后的值才是交换后的.
    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
//        System.out.println("m=" + m + ",n=" + n);
    }
    }




