package second.exer;

/*
    ��д�����࣬TriAngle��TriAngleTest������TriAngleTest��������˽�еĵ�
    �߳�base�͸�height��ͬʱ����������������˽�б��������⣬�ṩ��
    ��Ҫ�Ĺ���������һ������ʹ����Щ�������������������ε������
 */
public class TriAngle {
    public static void main(String[] args) {
        TriAngleTest t1 = new TriAngleTest(20,10);
        System.out.println("�����εĳ�Ϊ��"+t1.getBase()+"�����εĸ�Ϊ:"+t1.getHeight());
        TriAngleTest t2 = new TriAngleTest();
        t2.setBase(12);
        t2.setHeight(10);
        System.out.println("-----------");
        System.out.println("�����εĳ�Ϊ"+t2.getBase()+"�����εĸ�Ϊ"+t2.getHeight());


    }
}

class TriAngleTest {
    private int base;
    private int height;
    public TriAngleTest(){

    }
    public TriAngleTest(int b, int h) {
         base = b;
         height = h;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}