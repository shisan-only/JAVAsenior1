package second.text1;

/*
 * �ɱ�����βεķ���
 * 1��jdk 5.0 �����ķ���
 * 2�������ʹ��
 *   2.1�� �ɱ�����βεĸ�ʽ: ��������...������
 *   2.2�������ÿɱ�����βεķ���ʱ������Ĳ���������0����1����2�� ......
 *   2.3 �ɱ�����βεķ����뱾���з�������ͬ���ββ�ͬ����֮�乹���˷���������
 *   2.4 �ɱ�����βεķ����뱾�෽������ͬ���β�����Ҳ��ͬ������֮�䲻�ܹ��������أ������Թ��档
 *   2.5 �ɱ�������β��ڷ������β��У�����������ĩβ��
 *   2.6 �ɱ�������β��ڷ������β��У�ֻ������һ������2.5�������
 * 3�� ʹ�ó�������Ϊ�����ݿ�ѡ������ʱ����֪���û���Ҫ���ҵ�������һ�����Ƕ��ʱ�����õ���
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest text = new MethodArgsTest();
        text.show(8);
        text.show("hello");
        text.show("hello", "world");
        text.show("hello", "world", "yes");
        text.show();
        text.show("���","����","����");
    }

    public void show(int i) {

    }

    public void show(String i) {

    }
    // ���Ҳ����ȥ����һ�����飬forѭ�����������һ���ġ�
    public void show(String... strs) {
        System.out.println("show(String ... str)");
        for (int i =0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
    //���������벻���Թ��棬��ע��2.4
//    public void show(String [] arr){
//
//    }
    //�ɱ�������β���������ʱ��Ҫ��������������򱨴�ԭ��������Ϊ�ڱ���ʱ����ֲ���ɱ�����ͱ���������ȥ���䡣��
    // String��ǰ�棬�����˺ܶ����ֵ��������һ���Ǳ�������ǣ� ���Ȳ�ȷ�� ɵɵ�ֲ����    ��2.5
    public void show (int i , String ... strs){

    }
    //������� ����ԭ���ϱ�
//    public void show ( String ... strs, int i){
//
//    }
}
