package second.demo10;

/*
 * �ܽ����Ը�ֵ���Ⱥ�˳��
 *  1��Ĭ�ϳ�ʼ��ֵ
 *  2����ʾ��ʼ��
 *  3����������ʼ��
 * ���涼�Ƕ���û��new�������еĸ�ֵ����new����������ִ����϶�ֻ��ִ��һ��
 *
 *  4��ͨ��"����.����"����"����.����"�ķ�ʽ����ֵ
 * �������ִ�ж��
 *
 *  ˳��Ϊ 1-2-3-4   ��Ҫ��ȡ�������
 *   ���ϲ������Ⱥ�˳��
 */
public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        //������ı�Ļ�����ʾ��ʼ��ֵ
        System.out.println(u.age);
        User u1 = new User(2);
        u1.setAge(3);
        System.out.println(u1.age);
    }
}

class User {
    //ֱ�������︳ֵ�Ļ�����Ĭ�ϳ�ʼ��ֵ
    String name;
    int age = 1;

    public User() {

    }

    public User(int a) {
        age = a;
    }

    public void setAge(int a) {
        age = a;
    }
}