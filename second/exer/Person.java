package second.exer;

/*
        创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
        用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
        在 PersonTest 类 中实例化 Person 类的对象 b， 调 用 setAge() 和
        getAge()方法，体会Java的封装性。

 */
public class Person {
    public static void main(String[] args) {
        PersonText a = new PersonText();
        a.setAge(16);
        System.out.println("年龄为:" + a.getAge());
    }
}

class PersonText {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && 130 >= age) {
            this.age = age;
        } else {
            //this.age = 0;
            System.out.println("传入的数据非法");
        }
    }

    public int getAge() {
        return age;
    }
}