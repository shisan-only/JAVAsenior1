package second.text;

import javax.swing.*;
/*
/������
/*
            ������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�
            score(int)�� ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
            ����һ����ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��
            �������ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
 */
public class demo05Two {
    public static void main(String[] args) {
        StudentTwo[] studentTwos = new StudentTwo[20];
        for (int i = 0; i < studentTwos.length; i++) {
            studentTwos[i] = new StudentTwo();
            studentTwos[i].number = i + 1;
            studentTwos[i].state = (int) (Math.random() * 6 + 1);
            studentTwos[i].score = (int) (Math.random() * 100 + 1);
        }
        demo05Two stu = new demo05Two();
        stu.sSeat(studentTwos);
        System.out.println("*********");
        stu.one(studentTwos);
        System.out.println("********");
        stu.two(studentTwos);
        stu.sSeat(studentTwos);
//        stu.SetTwo(studentTwos);
    }

    public void sSeat(StudentTwo[] studentTwos) {
        for (int i = 0; i < studentTwos.length; i++) {
            studentTwos[i].set();
        }

    }

    public void one(StudentTwo[] studentTwos) {  //������    ������ָ������һ��������
        for (int i = 0; i < studentTwos.length; i++) {
            if (studentTwos[i].state == 3) {
                studentTwos[i].set();
            }
        }

    }

    public void two(StudentTwo[] studentTwos) {
        for (int i = 0; i < studentTwos.length - 1; i++) {
            for (int x = 0; x < studentTwos.length - 1 - i; x++) {
                if (studentTwos[x].score > studentTwos[x + 1].score) {
                    //ð�������е�˳�����Ҫ��
                    StudentTwo temp = studentTwos[x];
                    studentTwos[x] = studentTwos[x + 1];
                    studentTwos[x + 1] = temp;
                }
            }
        }
    }
}


class StudentTwo {
    int number;
    int state;
    int score;

    public void set() {
        System.out.println("ѧ����ѧ��Ϊ" + number + "," + "ѧ�����꼶Ϊ" + state + "," + "ѧ���ĳɼ�Ϊ" + score + ".");
    }

}

