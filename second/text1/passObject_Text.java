package second.text1;

import javafx.scene.shape.Circle;
 /*
    *     ��1������һ��Circle�࣬����һ��double�͵�radius���Դ���Բ�İ뾶��һ��
            indArea()��������Բ�������
            ��2������һ����PassObject�������ж���һ������printAreas()���÷����Ķ���
            ���£�public void printAreas(Circle c, int time)
            ��printAreas�����д�ӡ���1��time֮���ÿ�������뾶ֵ���Լ���Ӧ�������
            ���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ�����
            ��3����main�����е���printAreas()������������Ϻ������ǰ�뾶ֵ
     */

public class passObject_Text {
    public static void main(String[] args) {
      PassObject one = new PassObject();  // ��Ҫ�����Ǹ�����ķ��� ��Ϊ��һ���ഴ��һ�����󣬶����������ķ�����
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
