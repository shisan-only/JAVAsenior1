package second.text;
/*
    Ҫ��(1)����demo02��Ķ������øö����name��age��sex���ԣ�����study����������ַ���
     ��studying��������showAge()������ʾageֵ������addAge()�����������age����ֵ����2�ꡣ
        (2)�����ڶ�������ִ���������������ͬһ����Ĳ�ͬ����֮��Ĺ�ϵ��
 */
public class demo02 {
    String name;
    int age;
    /*
    * sexΪ1ʱ ��ʾΪ����
    * sexΪ0ʱ ��ʾΪŮ��
     */
    int sex;
    public void study(){
        System.out.println("studying");
    }
    //�ڷ����е�������
    public void ShowAge(){
        System.out.println("����Ϊ"+age);
    }
    public int addAge(int i){  //��������ββ����Ը�ֵ
        age += i;   //�����������߼�
       return age;
    }

}