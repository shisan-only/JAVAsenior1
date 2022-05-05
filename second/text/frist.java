package second.text;
/*
    类和对象的使用（面向对象思想的落地实现）：
    1.创建类、设计类的成员
    2.创建类的对象
    3.通过“对象，属性”或“方法”调用对象的结构
 */
//测试类
public class frist {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的属性、方法
        //调用对象的属性
        p1.name="Tom";
        p1.Age=16;
        p1.isMale=true;
        System.out.println(p1.Age);

        //调用方法
        p1.eat();
        p1.use("手机");
        p1.speak();
    }
}
 class Person{
    //属性
     String name;
     int Age;
     boolean isMale;
     //方法
     /*
     方法的声明：权限修饰符 返回值类型 方法名 （形参列表）{
                        方法体
     }
        注意：static、final、abstract 来修饰方法 后面了解

        说明：
        一、关于修饰符：
           Java规定的4种修饰符：private、public、缺省、protected  --> 封装性
        二、关于返回值类型 ：有返回值vs没有返回值
           1.如果方法有返回值的话，则必须在方法中声明，指定返回值的类型。同时，方法中，
            需要使用return关键字来返回指定类型的变量和常量："return 数据"。
           2.如果方法没有返回值，则方法声明，使用void来表示。通常，在没有返回值的方法中就不需要使用return。
           如果使用return的话，只能有return来表示结束方法的意思。
           3.我们在定义方法时要不要有返回值？
             1.1 题目要求
             1.2 凭经验，具体情况具体分析
         三、方法名
             属于标识符，遵循标识符的规则和规范。“见名知意”
         四、形参列表：方法中可以声明0个，1个，或多个形参。
              1.1 格式：数据类型1 形参1，数据类型2 形参2，······
            1.2 我们在定义方法时，需不需要形参？
               1.2.1 题目要求
               1.2.2 凭经验，具体的情况具体分析
          五、 方法体 ： 方法功能的体现。
      return关键字的使用：
            1、使用范围：使用在方法体中
            2、作用：2.1 结束方法
                     2.2 针对于有返回值的类型，可以用"return"数据方法来返回所要的数据。
            3、注意点：return关键字后面不可以声明执行语句。
          六、方法的使用中，可以调用当前类的属性或方法
                特殊的 方法a中有调用了方法a  这种方法称为递归方法
                方法中不可以下定義方法

      */
     public void eat() {
         System.out.println("人可以吃东西");
     }

     public void speak() {
         System.out.println("人可以说话");
     }

     public void use(String gongju) {     //带有参数的方法
         System.out.println("可以使用工具" + gongju);
     }
}