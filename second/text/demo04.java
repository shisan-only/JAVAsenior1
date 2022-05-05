package second.text;
/*
            编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形，
            在main方法中调用该方法。
            3.2 修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再
            计算该矩形的面积，并将其作为方法返回值。在main方法中调用该方法，
            接收返回的面积值并打印。
            3.3 修改上一个程序，在method方法提供m和n两个参数，方法中打印一个
            m*n的*型矩形，并计算该矩形的面积， 将其作为方法返回值。在main方法
            中调用该方法，接收返回的面积值并打印。
            *如何打印出来一个*号矩形
 */
public class demo04 {
    //测试类
    public static void main(String[] args) {
        /*
        此时在方法里边直接调用方法需要静态，但是在现在这个时候，暂时不用。所以我们需要先造一个方法。
         */
        //3.1的测试
//        demo04 p1 = new demo04();
//        p1.method();
        //3.2测试
        //3.2.1在编写代码中一定要注意中括号的使用，已经语句的位置。在
        //3.2.2在接受方法的返回值时，new出来一个新的变量去接受它，直接等于方法就好。  多多理解
//        demo04 p2 = new demo04();
//        int area =p2.method();
//        System.out.println("面积为"+area);
        //3.3.1测试
        demo04 p3 = new demo04();
//        System.out.println(p3.method(5,6));
        int area = p3.method(5,6);
        System.out.println("面积为"+area);

    }

    //3.1
//        public void method(){
//            for (int i=0;i<8;i++){
//                for(int j=0;j<10;j++){
//                    System.out.print("*");//如何打印出来矩形？？？我靠了  这个理解咋这么扯
//
//                }
//                System.out.println();
    //3.2
//    public int method() {
//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int area = 10 * 8;
//        return area;
//    }
    //3.3
    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int area = m * n;
        return area;
    }
}