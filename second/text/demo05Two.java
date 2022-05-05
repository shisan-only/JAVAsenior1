package second.text;

import javax.swing.*;
/*
/测试类
/*
            定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
            score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
            问题一：打印出3年级(state值为3）的学生信息。
            问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
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

    public void one(StudentTwo[] studentTwos) {  //不明白    这是在指定用哪一个的数组
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
                    //冒泡排序中的顺序很重要。
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
        System.out.println("学生的学号为" + number + "," + "学生的年级为" + state + "," + "学生的成绩为" + score + ".");
    }

}

