package second.text;
/*
            ��д��������һ��method�������ڷ����д�ӡһ��10*8 ��*�;��Σ�
            ��main�����е��ø÷�����
            3.2 �޸���һ��������method�����У�����ӡһ��10*8��*�;����⣬��
            ����þ��ε��������������Ϊ��������ֵ����main�����е��ø÷�����
            ���շ��ص����ֵ����ӡ��
            3.3 �޸���һ��������method�����ṩm��n���������������д�ӡһ��
            m*n��*�;��Σ�������þ��ε������ ������Ϊ��������ֵ����main����
            �е��ø÷��������շ��ص����ֵ����ӡ��
            *��δ�ӡ����һ��*�ž���
 */
public class demo04 {
    //������
    public static void main(String[] args) {
        /*
        ��ʱ�ڷ������ֱ�ӵ��÷�����Ҫ��̬���������������ʱ����ʱ���á�����������Ҫ����һ��������
         */
        //3.1�Ĳ���
//        demo04 p1 = new demo04();
//        p1.method();
        //3.2����
        //3.2.1�ڱ�д������һ��Ҫע�������ŵ�ʹ�ã��Ѿ�����λ�á���
        //3.2.2�ڽ��ܷ����ķ���ֵʱ��new����һ���µı���ȥ��������ֱ�ӵ��ڷ����ͺá�  ������
//        demo04 p2 = new demo04();
//        int area =p2.method();
//        System.out.println("���Ϊ"+area);
        //3.3.1����
        demo04 p3 = new demo04();
//        System.out.println(p3.method(5,6));
        int area = p3.method(5,6);
        System.out.println("���Ϊ"+area);

    }

    //3.1
//        public void method(){
//            for (int i=0;i<8;i++){
//                for(int j=0;j<10;j++){
//                    System.out.print("*");//��δ�ӡ�������Σ������ҿ���  ������զ��ô��
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