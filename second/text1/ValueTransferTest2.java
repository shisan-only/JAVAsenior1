package second.text1;

public class ValueTransferTest2 {
    public static void main(String[] args) {
        Date date = new Date();
        date.m=10;
        date.n=20;
        System.out.println("m��ֵΪ"+date.m+",n��ֵΪ"+date.n);
        ValueTransferTest2 set = new ValueTransferTest2();
        set.swap(date);
        System.out.println("m��ֵΪ"+date.m+",n��ֵΪ"+date.n);
    }
    //�������� ��ʱ������Ϊ����
    public void swap (Date date1){     //����������������Ǵ�������һ���µı�������ΪDate����ֵ��
                                    // ������ջ�ռ�����Ǿ���������date�ռ䣬����ȴ��ָ���˶ѿռ���ͬһ����ֵַ
        int temp = date1.m;
        date1.m = date1.n;
        date1.n = temp;
    }
}
class Date{
    int m;
    int n;
}
