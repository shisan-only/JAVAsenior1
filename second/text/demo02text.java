package second.text;

/*
    Ҫ��(1)����demo02��Ķ������øö����name��age��sex���ԣ�����study����������ַ���
     ��studying��������showAge()������ʾageֵ������addAge()�����������age����ֵ����2�ꡣ
        (2)�����ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��
 */
public class demo02text {

    public static void main(String[] args) {
        demo02 d1 = new demo02();
        d1.name = "С��";
        d1.age = 18;
        d1.sex = 1;
        d1.study();
        d1.ShowAge();
        int newAge = d1.addAge(2);
        System.out.println("С����������");
        //***************
        demo02 d2 = new demo02();
        d2.ShowAge();           //����Ľ��Ӧ��Ϊ0����Ϊ����һ���µĶ���ÿnewһ�ξͻ��ڶѿռ����γ�һ���µĿռ䡣
        d2.addAge(20);
        d2.ShowAge();  // ��ʾ�Ľ��Ӧ��Ϊ20����Ϊ��������ʱ��addage�����˷���ֵreturn age  �����ڴ˴��Ľ��Ϊ20

    }
}
