package second.text1;

/*
 * ���ڱ����ĸ�ֵ
 * �������Ϊ�����������ͣ���ʱ�ĸ�ֵʱ���������������ֵ��
 * �������Ϊ�����������ͣ���ʱ��ֵ��Ϊ�������������ݵĵ�ֵַ
 * ����������ϸ�Դ�����������
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        System.out.println("******������������******");
        int m = 10;
        int n = m;  //��m��ֵ����n
        System.out.println("m=" + m + ",n=" + n);
        n = 20;
        System.out.println("m=" + m + ",n=" + n);
        System.out.println("***********");
        System.out.println("***������������*****");
        Order o1 = new Order();
        o1.OrderId = 10086;
        Order o2 = o1;  // ���������new��newû�й�ϵ����Ϊ�����ﲢ����һ�����ڷ������Եĸ�ֵ�����Ƕ��ڵ�ֵַ�ĸ�ֵ��  �����ֵ�Ժ���ôo1��o2�ĵ�ֵַ��ͬ����ָ����һ����ͬ��ʵ�塣
        System.out.println("o2��ֵΪ" + o2.OrderId + ",o1��ֵΪ" + o1.OrderId);
        o2.OrderId = 10088;
        System.out.println("o2��ֵΪ" + o2.OrderId + ",o1��ֵΪ" + o1.OrderId);
        Order o3 = new Order();
        o3.OrderId = o1.OrderId;
        System.out.println(o3.OrderId);
        o3.OrderId=10089;
        System.out.println(o3.OrderId+","+o1.OrderId);
        o3 = o1;
        o3.OrderId=2000;
        System.out.println(o3.OrderId+","+o1.OrderId);



    }
}
class Order {
    int OrderId;
}