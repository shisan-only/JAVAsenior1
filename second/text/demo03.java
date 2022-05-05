package second.text;

import java.util.Scanner;

/*
        设计类Circle计算圆的面积
 */
                //测试类
public class demo03 {
    public static void main(String[] args) {
        //方法1的输出
//        Circle C1 = new Circle();
//        C1.show();
        Circle C2 = new Circle();
        C2.radius=6;
        System.out.println("圆的面积为"+C2.FindArea());
    }
}

class Circle {
    //方法一、没有返回值 此方法中有缺陷 并没有给方法一个属性值。最好的方法是要把半径放在属性中。
//    public void show() {
//        System.out.println("请输入圆的半径");
//        Scanner bj = new Scanner(System.in);
//        int bj1 = bj.nextInt();
//        double mj;
//        mj = bj1 * bj1 * 3.14;  //Math.pi 为圆的3.14的值
//        System.out.println("圆的面积为" + mj);
//    }
    //方法二、带有返回值，且带有属性。在调用方法时给属性赋值
    double radius;
    public double FindArea(){  //  FindArea为方法的名称
       double area = Math.PI *radius*radius;
       return area;
    }

}