package second.demo10;

/*
 * 类的结构之三：构造器（或者叫做构造方法、constructor）
 * constructor：建设者、建造者
 *
 * 一、构造器的作用：
 * 1.创建对象
 * 2.可以初始化对象的属性
 * 二、 说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名（形参列表）{}
 * 3.一个类中定义多个构造器，彼此构成重载
 * 4.一旦我们显示的定义了类的构造器，系统便不再给我们提供空参构造器。
 * 5.一个类中至少会有一个构造器
 */
public class PersonText {
    public static void main(String[] args) {
        //创建类的对象 new + 构造器
        Person p = new Person();
        p.eat();
        System.out.println("年龄为"+p.age);
        Person p1 = new Person("Tom");
        System.out.println(p1.name);
        Person p2 = new Person("Tom", 17);
        System.out.println(p2.age + p2.name);
//
//        Person p3 = new Person(18);
//        System.out.println(p3.age);
    }
}

class Person {
    //属性
    String name;
    int age;

    //构造器
    public Person(int a) {
        age = a;
    }

    public Person() {
     age = 18;
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void study() {
        System.out.println("人学习");
    }
}