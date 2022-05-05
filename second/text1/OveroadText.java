package second.text1;

/*
编写程序，定义三个重载方法并调用。方法名为mOL。
?三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
?在主类的main ()方法中分别用参数区别调用三个方法。
3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
法求两个double值中的最大值，第三个方法求三个double值中的最大值，
并分别调用三个方法
 */
public class OveroadText {
    public static void main(String[] args) {
        OveroadText text = new OveroadText();
        text.get(2);
        text.get(2, 4);
        text.get("你好");
        text.Max(4, 78);
        text.Max(3.4, 6.8);
        text.Max(9.9, 54.6, 76.6);
    }

    public void get(int i) {
        System.out.println("结果为" + i * i);
    }

    public void get(int i, int y) {
        System.out.println("结果为" + i * i + y * y);
    }

    public void get(String i) {
        System.out.println(i);
    }

    public void Max(int i, int y) {
        if (i > y) {
            System.out.println("最大值为" + i);
        } else if (y > i) {
            System.out.println("最大值为" + y);
        }
    }

    public void Max(double i, double y) {
        double Max = 0.0;
        if (y < i) {
            Max = i;
            System.out.println("最大值为" + i);
        } else if (y > i) {
            Max = y;
            System.out.println("最大值为" + y);
        }
    }

    public void Max(double i, double y, double z) {
        double Max = 0.0;
        if (y < i && z < i) {
            Max = i;
            System.out.println("最大值为" + i);
        } else if (y > i && y > z) {
            Max = y;
            System.out.println("最大值为" + y);
        } else if (z > i && z > y) {
            Max = z;
            System.out.println("最大值为" + z);
        }
    }
}
