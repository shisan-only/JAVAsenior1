package second.exer;

/*
        ��������,�����ж��������ࣺPerson��PersonTest�ࡣ�������£�
        ��setAge()�����˵ĺϷ�����(0~130)����getAge()�����˵����䡣
        �� PersonTest �� ��ʵ���� Person ��Ķ��� b�� �� �� setAge() ��
        getAge()���������Java�ķ�װ�ԡ�

 */
public class Person {
    public static void main(String[] args) {
        PersonText a = new PersonText();
        a.setAge(16);
        System.out.println("����Ϊ:" + a.getAge());
    }
}

class PersonText {
    private int age;

    public void setAge(int age) {
        if (age >= 0 && 130 >= age) {
            this.age = age;
        } else {
            //this.age = 0;
            System.out.println("��������ݷǷ�");
        }
    }

    public int getAge() {
        return age;
    }
}