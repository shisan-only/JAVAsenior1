package second.text;

import java.util.Scanner;

/*
        �����Circle����Բ�����
 */
                //������
public class demo03 {
    public static void main(String[] args) {
        //����1�����
//        Circle C1 = new Circle();
//        C1.show();
        Circle C2 = new Circle();
        C2.radius=6;
        System.out.println("Բ�����Ϊ"+C2.FindArea());
    }
}

class Circle {
    //����һ��û�з���ֵ �˷�������ȱ�� ��û�и�����һ������ֵ����õķ�����Ҫ�Ѱ뾶���������С�
//    public void show() {
//        System.out.println("������Բ�İ뾶");
//        Scanner bj = new Scanner(System.in);
//        int bj1 = bj.nextInt();
//        double mj;
//        mj = bj1 * bj1 * 3.14;  //Math.pi ΪԲ��3.14��ֵ
//        System.out.println("Բ�����Ϊ" + mj);
//    }
    //�����������з���ֵ���Ҵ������ԡ��ڵ��÷���ʱ�����Ը�ֵ
    double radius;
    public double FindArea(){  //  FindAreaΪ����������
       double area = Math.PI *radius*radius;
       return area;
    }

}