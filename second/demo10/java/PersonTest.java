package second.demo10.java;

/*
 * this�ؼ��ֵ�ʹ��
 * 1��this���������������ԡ����á�������������
 * 2��this�������Ժͷ���
 *    this�������Ϊ��ǰ������ߵ�ǰ���ڴ����Ķ���
 *
 *2.1 ����ķ����У����ǿ���ʹ�� "this.����"����"this.�����ķ�ʽ"�����õ�ǰ��������Ի��߷�����
 *    ����ͨ������£����ǻ�ѡ��ʡ��"this"����������£�����������βκ��������ͬ����ʱ��
 *    ���Ǳ�����ʽ��ʹ��"this.����"�ķ�ʽ�����������˱��������ԣ������βΡ�
 *
 * 2.2 ����Ĺ������У����ǿ���ʹ�� "this.����"����"this.�����ķ�ʽ"�����õ�ǰ���ڴ����Ķ�������Ի��߷�����
 *    ����ͨ������£����ǻ�ѡ��ʡ��"this"����������£�����������βκ��������ͬ����ʱ��
 *    ���Ǳ�����ʽ��ʹ��"this.����"�ķ�ʽ�����������˱��������ԣ������βΡ�
 *
 * 3.this���ù�����
     * 3.1 ��������Ĺ������У�������ʽ��ʹ��"this�������б�"��ʽ�������ñ�����ָ��������������
     * 3.2 ����������ͨ��"this(�β��б�)"��ʽ�������Լ���
     * 3.3 ���һ��������n�����������������n-1��ʹ�õ���"this(�β��б�)"
     * 3.4 �涨��"this���β��б�"���������ڵ�ǰ������������
     * �������ڲ����ֻ������һ��"this(�β��б�)"��ʽ�������������Ĺ�������
 */
public class PersonTest {
    public static void main(String[] args) {
        person p = new person();
        p.setAge(18);
        p.setName("С��");
        System.out.println("����Ϊ��" + p.getAge() + "�������ǣ�" + p.getName());

        System.out.println("****this���ù�����****");
        person p1 = new person("this���ù�������"+"С��",18);
        System.out.println(p1.getName()+p1.getAge());
    }
}

class person {
    private String name;
    private int age;

    public person() {
        //�����this.eat���������õ�ǰ��ķ�����
        this.eat();
        // person��ʼ��ʱ�������Ҫ�������µ�1��2��3��4��......��һ��40�д��룩��ô����������
        String text = " person��ʼ��ʱ�������Ҫ�������µ�1��2��3��4��......��һ��40�д��룩��ô����������";
        System.out.println(text);
    }

    public person(int age) {
        //this���ù�������������õ��ǿղε�
        this();
        this.age = age;
    }

    public person(String name, int age) {
     //������õ��Ǵ��в�����age���ԵĹ�����
        this(age);
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        //����ߵ�this��ʾ��������ߴ������һ������
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("�˳Է�");
        //�����ʡ�Ե���this
        study();
    }

    public void study() {
        System.out.println("��ѧϰ");
    }
}
