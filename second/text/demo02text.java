package second.text;

/*
    要求：(1)创建demo02类的对象，设置该对象的name、age和sex属性，调用study方法，输出字符串
     “studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
        (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class demo02text {

    public static void main(String[] args) {
        demo02 d1 = new demo02();
        d1.name = "小明";
        d1.age = 18;
        d1.sex = 1;
        d1.study();
        d1.ShowAge();
        int newAge = d1.addAge(2);
        System.out.println("小明的新年龄");
        //***************
        demo02 d2 = new demo02();
        d2.ShowAge();           //输出的结果应该为0，因为这是一个新的对象，每new一次就会在堆空间内形成一个新的空间。
        d2.addAge(20);
        d2.ShowAge();  // 显示的结果应该为20，因为在设计类的时候，addage运用了返回值return age  所以在此处的结果为20

    }
}
