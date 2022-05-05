package second.demo10;

/*
 * 面向对象的特征一、封装与隐藏
 * 一、问题的引入
 *  当我们创建一个类的对象后，我们可以通过“对象”，“属性”的方式，对对象的属性进行赋值。这里，赋值的操作要受到
 *  属性的数据类型和存储类型的制约。但是此处之外，没有其他制约条件，但是在实际问题中，我们需要给这个属性加入其他的额外
 *  的限制条件，这个条件不能够再属性声明时体现，我们只能够在通过方法进行限制条件的添加。比如说我们在下面代码中的setLegs.
 *  同时，我们需要避免用户通过创建对象的方式，来给这个属性赋值，则需要将这个属性声明为私有的（private）
 * --------此时，针对于这个属性便体现了封装性---------
 * 二、封装性的体现
 * 我们将属性私有化（private），同时提供公共的（public）方法来获取（getXxx）和设置个体（setXxx）属性的值  (这里只是封装性的一个体现)
 *
 * 拓展： 封装性的体现：第一条 如上  第二条 不对外暴露的私有的方法 第三条 单例模式 等等
 * 三、封装性的体现，需要权限修饰符来配合
 * 1.java规定的4种权限，（从小到大排列）：private、缺省、protected、public
 * 2.这四种权限可以用来修饰类以及类的内部结构，属性、方法、构造器、内部类
 * 3.具体的：4种权限都可以用来修饰类的内部结构，属性，方法，构造器，内部类、
 *           修饰类的话，只能用缺省、public
 *总结封装性：java提供了4种权限修饰符来修饰类的内部结构，提供类及类的内部结构在被调用时的可见性大小
 */
public class AnimalText {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.setAge(6);
        System.out.println(a.getAge());

//        a.legs = 4;  // 当设置他为私有的后，便可不能再调用。

        a.show();
        System.out.println(a.getLegs());
//       a.legs = -4;  //再给Animal创建成功对象后，重新调用了一次方法。相当于new出来新的一块空间
        //为这个属性创建一个类，在类中给个这个属性给予条件，而后让对象去调用这个类。符合后正常输出，不符合则返回0
//        a.setLegs(6);
        a.setLegs(-6);
        a.show();
    }

}

class Animal {
    String name;
    private int age;
    private int legs;//腿的个数

    //对于属性的设置
    public void setLegs(int l) {
        legs = l;
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
        }
    }

    //对于属性的获取
    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("动物进食");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("name=" + name + ",age=" + age + ",legs=" + legs);
    }
}