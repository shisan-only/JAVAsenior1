package second.demo10;

/*
 * ��Ľṹ֮���������������߽������췽����constructor��
 * constructor�������ߡ�������
 *
 * һ�������������ã�
 * 1.��������
 * 2.���Գ�ʼ�����������
 * ���� ˵��
 * 1.���û����ʾ�Ķ�����Ĺ������Ļ�����ϵͳĬ���ṩһ���ղεĹ�����
 * 2.���幹�����ĸ�ʽ��Ȩ�����η� �������β��б�{}
 * 3.һ�����ж��������������˴˹�������
 * 4.һ��������ʾ�Ķ�������Ĺ�������ϵͳ�㲻�ٸ������ṩ�ղι�������
 * 5.һ���������ٻ���һ��������
 */
public class PersonText {
    public static void main(String[] args) {
        //������Ķ��� new + ������
        Person p = new Person();
        p.eat();
        System.out.println("����Ϊ"+p.age);
        Person p1 = new Person("Tom");
        System.out.println(p1.name);
        Person p2 = new Person("Tom", 17);
        System.out.println(p2.age + p2.name);
//
//        Person p3 = new Person(18);
//        System.out.println(p3.age);
    }
}

class Person {
    //����
    String name;
    int age;

    //������
    public Person(int a) {
        age = a;
    }

    public Person() {
     age = 18;
    }

    public Person(String n) {
        name = n;
    }

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    //����
    public void eat() {
        System.out.println("�˳Է�");
    }

    public void study() {
        System.out.println("��ѧϰ");
    }
}