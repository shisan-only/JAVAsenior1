package second.demo10.java;

/*
 * this关键字的使用
 * 1、this可以用来修饰属性、调用、方法、构造器
 * 2、this修饰属性和方法
 *    this可以理解为当前对象或者当前正在创建的对象
 *
 *2.1 在类的方法中，我们可以使用 "this.属性"或者"this.方法的方式"来调用当前对象的属性或者方法，
 *    但是通常情况下，我们会选择省略"this"，特殊情况下，如果方法的形参和类的属性同名的时候，
 *    我们必须显式的使用"this.变量"的方式，用来表明此变量是属性，而非形参。
 *
 * 2.2 在类的构造器中，我们可以使用 "this.属性"或者"this.方法的方式"来调用当前正在创建的对象的属性或者方法，
 *    但是通常情况下，我们会选择省略"this"，特殊情况下，如果方法的形参和类的属性同名的时候，
 *    我们必须显式的使用"this.变量"的方式，用来表明此变量是属性，而非形参。
 *
 * 3.this调用构造器
     * 3.1 我们在类的构造器中，可以显式的使用"this（参数列表）"方式，来调用本类中指定的其他构造器
     * 3.2 构造器不能通过"this(形参列表)"方式来调用自己的
     * 3.3 如果一个类中有n个构造器，则最多有n-1个使用的了"this(形参列表)"
     * 3.4 规定："this（形参列表）"必须声明在当前构造器的首行
     * 构造器内部最多只能声明一个"this(形参列表)"方式用来调用其他的构造器。
 */
public class PersonTest {
    public static void main(String[] args) {
        person p = new person();
        p.setAge(18);
        p.setName("小明");
        System.out.println("年龄为：" + p.getAge() + "，姓名是：" + p.getName());

        System.out.println("****this调用构造器****");
        person p1 = new person("this调用构造器："+"小徐",18);
        System.out.println(p1.getName()+p1.getAge());
    }
}

class person {
    private String name;
    private int age;

    public person() {
        //这里的this.eat是用来调用当前类的方法的
        this.eat();
        // person初始化时，如果需要考虑如下的1、2、3、4、......（一共40行代码）那么便会出现冗余
        String text = " person初始化时，如果需要考虑如下的1、2、3、4、......（一共40行代码）那么便会出现冗余";
        System.out.println(text);
    }

    public person(int age) {
        //this调用构造器，这里调用的是空参的
        this();
        this.age = age;
    }

    public person(String name, int age) {
     //这里调用的是带有参数的age属性的构造器
        this(age);
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        //这里边的this表示的是这里边创建类的一个属性
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("人吃饭");
        //这里边省略掉了this
        study();
    }

    public void study() {
        System.out.println("人学习");
    }
}
