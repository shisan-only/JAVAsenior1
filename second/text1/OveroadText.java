package second.text1;

/*
��д���򣬶����������ط��������á�������ΪmOL��
?���������ֱ����һ��int����������int������һ���ַ����������ֱ�
ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
?�������main ()�����зֱ��ò��������������������
3.�����������ط���max()����һ������������intֵ�е����ֵ���ڶ�����
��������doubleֵ�е����ֵ������������������doubleֵ�е����ֵ��
���ֱ������������
 */
public class OveroadText {
    public static void main(String[] args) {
        OveroadText text = new OveroadText();
        text.get(2);
        text.get(2, 4);
        text.get("���");
        text.Max(4, 78);
        text.Max(3.4, 6.8);
        text.Max(9.9, 54.6, 76.6);
    }

    public void get(int i) {
        System.out.println("���Ϊ" + i * i);
    }

    public void get(int i, int y) {
        System.out.println("���Ϊ" + i * i + y * y);
    }

    public void get(String i) {
        System.out.println(i);
    }

    public void Max(int i, int y) {
        if (i > y) {
            System.out.println("���ֵΪ" + i);
        } else if (y > i) {
            System.out.println("���ֵΪ" + y);
        }
    }

    public void Max(double i, double y) {
        double Max = 0.0;
        if (y < i) {
            Max = i;
            System.out.println("���ֵΪ" + i);
        } else if (y > i) {
            Max = y;
            System.out.println("���ֵΪ" + y);
        }
    }

    public void Max(double i, double y, double z) {
        double Max = 0.0;
        if (y < i && z < i) {
            Max = i;
            System.out.println("���ֵΪ" + i);
        } else if (y > i && y > z) {
            Max = y;
            System.out.println("���ֵΪ" + y);
        } else if (z > i && z > y) {
            Max = z;
            System.out.println("���ֵΪ" + z);
        }
    }
}
