package second.text;
/*
    ���������ʹ��
    1.��⣺���Ǵ����Ķ���û����ʾ�ĸ���һ������������Ϊ��������
    2.������������������ֻ���Ե���һ��
    3.�����е�ʹ������
 */
public class third {
    public static void main(String[] args) {
        phone p = new phone();
        p.price=1999.99;
        System.out.println("�ֻ��ļ۸�Ϊ"+p.price);
        p.playGame();
        p.sendEmail();
        System.out.println("*******");

        //�������� ������Ա�û�и������� ������phone������һ��  ÿһ��newһ�������ڶ����´���һ����ַ
        new phone().sendEmail();
        new phone().playGame();
        System.out.println("********");
        //����ʵ��֤�������ε�new������һ�����󣬶�����������Ҳ֤�������������һ��������
        new phone().price=1999.99;
        new phone().setPrice(); //���н������double��Ĭ��ֵ 0.0
        //****
        System.out.println("***********");
        PhoneMall show = new PhoneMall();
        show.show(p);
        System.out.println("******");
        /*
        * �������new phone Ҳ��һ�������Ķ��󣬵����ڴ��У��ѿռ��´�����phone����Լ��ĵ�ֵַ����PhoneMall����ķ�����Ҳ���Ǿֲ�������
        * �ֲ���������ջ�ռ��еģ������������������������ö�Ρ�
        * ������ע�⣡����
        * ��һ����⣬��һ��׼ȷ��
        * ��Ϊ���ǵ��õ���һ�������βεķ�������������Ҫ�ڵ���ʱ���������βΣ��������β�����Ϊphone����Ϊ�����������phoneʵ����l�����������p
        * �����������������ʹ��p������������������У�����ֱ���´�����һ��phone�����͡�����������   �����������Ҳ�ǿ�����phone��ʹ�÷���
         */
        show.show(new phone());
    }
}
class PhoneMall{
    public void show(phone use){  //������ߵ���phone����Ϊ�������βο�������������ͣ����Կ��Ե���phone�� use�Ǹ�������õ��β�����
        use.sendEmail();
        use.playGame();
    }

}
class phone{
    double price; //�۸�
    public void sendEmail(){
        System.out.println("�ֻ����Է����ʼ�");
    }
    public void playGame(){
        System.out.println("�ֻ���������Ϸ");
    }
    public void setPrice(){
        System.out.println("�ֻ��ļ۸�Ϊ"+price);
    }
}