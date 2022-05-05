package second.demo10;

/*
 * 总结属性赋值的先后顺序
 *  1、默认初始化值
 *  2、显示初始化
 *  3、构造器初始化
 * 上面都是对象没有new出来进行的赋值，从new出来到对象执行完毕都只会执行一次
 *
 *  4、通过"对象.方法"或者"对象.属性"的方式来赋值
 * 这个可以执行多次
 *
 *  顺序为 1-2-3-4   主要是取决与后面
 *   以上操作的先后顺序
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        //在这里改变的话是显示初始化值
        System.out.println(u.age);
        User u1 = new User(2);
        u1.setAge(3);
        System.out.println(u1.age);
    }
}

class User {
    //直接在这里赋值的话便是默认初始化值
    String name;
    int age = 1;

    public User() {

    }

    public User(int a) {
        age = a;
    }

    public void setAge(int a) {
        age = a;
    }
}