package second.exer;

/*
    编写两个类，TriAngle和TriAngleTest，其中TriAngleTest类中声明私有的底
    边长base和高height，同时声明公共方法访问私有变量。此外，提供类
    必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngle {
    public static void main(String[] args) {
        TriAngleTest t1 = new TriAngleTest(20,10);
        System.out.println("三角形的长为："+t1.getBase()+"三角形的高为:"+t1.getHeight());
        TriAngleTest t2 = new TriAngleTest();
        t2.setBase(12);
        t2.setHeight(10);
        System.out.println("-----------");
        System.out.println("三角形的长为"+t2.getBase()+"三角形的高为"+t2.getHeight());


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