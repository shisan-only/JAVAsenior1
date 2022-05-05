package second.text1;

/*
 * 关于变量的赋值
 * 如果变量为基本数据类型，此时的赋值时变量所保存的数据值。
 * 如果变量为引用数据类型，此时赋值的为变量所保存数据的地址值
 * ！！！！仔细对待！！！！！
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("******基本数据类型******");
        int m = 10;
        int n = m;  //把m的值赋给n
        System.out.println("m=" + m + ",n=" + n);
        n = 20;
        System.out.println("m=" + m + ",n=" + n);
        System.out.println("***********");
        System.out.println("***引用数据类型*****");
        Order o1 = new Order();
        o1.OrderId = 10086;
        Order o2 = o1;  // 首先这里和new不new没有关系，因为在这里并不是一个对于方法属性的赋值，而是对于地址值的赋值。  这个赋值以后，那么o1和o2的地址值相同，都指向了一个相同的实体。
        System.out.println("o2的值为" + o2.OrderId + ",o1的值为" + o1.OrderId);
        o2.OrderId = 10088;
        System.out.println("o2的值为" + o2.OrderId + ",o1的值为" + o1.OrderId);
        Order o3 = new Order();
        o3.OrderId = o1.OrderId;
        System.out.println(o3.OrderId);
        o3.OrderId=10089;
        System.out.println(o3.OrderId+","+o1.OrderId);
        o3 = o1;
        o3.OrderId=2000;
        System.out.println(o3.OrderId+","+o1.OrderId);



    }
}
class Order {
    int OrderId;
}