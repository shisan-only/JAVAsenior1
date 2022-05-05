package second.text;
/*
    要求：(1)创建demo02类的对象，设置该对象的name、age和sex属性，调用study方法，输出字符串
     “studying”，调用showAge()方法显示age值，调用addAge()方法给对象的age属性值增加2岁。
        (2)创建第二个对象，执行上述操作，体会同一个类的不同对象之间的关系。
 */
public class demo02 {
    String name;
    int age;
    /*
    * sex为1时 表示为男性
    * sex为0时 表示为女性
     */
    int sex;
    public void study(){
        System.out.println("studying");
    }
    //在方法中调用属性
    public void ShowAge(){
        System.out.println("年龄为"+age);
    }
    public int addAge(int i){  //括号里的形参不可以赋值
        age += i;   //基本的运算逻辑
       return age;
    }

}