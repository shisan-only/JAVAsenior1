package second.text1;
/*
* ����������
* 1�����壺��ͬһ�����У�����һ�����ϵ�ͬ���ķ�����ֻҪ���ǵĲ������Ͳ�ͬ���ɡ�
*     ��ͬһ��ͬ   ͬһ���ࡢ��ͬ�ķ�����
*          �����б�ͬ������������ͬ���������Ͳ�ͬ
* 2������
*    Arrys���е�sort����/binary Search����
* 3���ж��Ƿ����أ�
*      ��������Ȩ�����η�������ֵ�����Լ��βα������������嶼û�й�ϵ��
* 4����ͨ��������÷�����ʱ��,���ȷ��һ��ָ���ķ�����
*    ������----> �����б�
 */
public class OverLoad {
    public static void main(String[] args) {
        OverLoad test = new OverLoad();
        test.getSum(1,2); //�ڵ��÷�����ʱ������к��ʵ�����������ȵ�ȥʹ����ͬ�ķ��������û�����������ͻ����ת��
    }
    //���µ��ĸ������������˷���������
    public void getSum(int i,int j){
        System.out.println(i+j);
    }
    public void getSum (double d1,double d2){
        System.out.println("2");
    }
    public void getSum (String s ,int i){

    }
    public void getSum (int i ,String s){

    }
}
