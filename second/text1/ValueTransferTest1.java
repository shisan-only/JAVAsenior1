package second.text1;

import java.util.Date;

/*
 * �������βεĴ��ݻ��ƣ�ֵ����
 * 1�� �βΣ���������ʱ��������С�����ڵĲ���
 *     ʵ�Σ���������ʱ��ʵ�ʴ��ݸ��βε�����
 * 2��ֵ���ݻ���
 * �������Ϊ�����������ͣ���ʱ��ʵ�θ����βε��ǣ�ʵ����ʵ�洢������ֵ��
 * �������Ϊ�����������ͣ���ʱʵ�θ����βε���ʵ�δ洢���ݵĵ�ֵַ��
 * ����������ϸ�Դ�����������
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println("m=" + m + ",n=" + n);
        //��������������ֵ
//        int temp = m;
//        m = n;
//        n = temp;
        ValueTransferTest1 s1 = new ValueTransferTest1();
        //       s1.swap(m,n);
        System.out.println("m=" + m + ",n=" + n);
    }

    // �������õĻ��ǻ����������ͣ���ô������m��n����������е�m��n�ʹ˴����е�m��n�ǲ�һ���ģ�ֻ���ڱ��δ�����ֱ֮���������ô
    //������ֵ���ǽ������.
    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
//        System.out.println("m=" + m + ",n=" + n);
    }
    }




