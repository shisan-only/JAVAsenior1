package second.text1;

import javafx.scene.shape.Circle;
 /*
    *     （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
            indArea()方法返回圆的面积。
            （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
            如下：public void printAreas(Circle c, int time)
            在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
            例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
            （3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值
     */

public class passObject_Text {
    public static void main(String[] args) {
      PassObject one = new PassObject();  // 想要调用那个类里的方法 便为哪一个类创建一个对象，而后调用类里的方法。
      one.printAreas(new Circle1(),5);
    }
}
     class Circle1 {
        double radius;
        public double indArea() {
            double area;
            area = radius * radius * Math.PI;
            return area;
        }
    }

   class PassObject {
        public void printAreas(Circle1 c, int time) {
            System.out.println("Radius\t\tArea");
            for (int i = 1; i < time+1; i++) {
                c.radius = i;
                System.out.println(c.radius + "\t\t" + c.indArea());
            }
        }
    }
