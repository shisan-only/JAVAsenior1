package second.text;
//������� ��Ҫ���� P189.18
public class demo01 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="С��";
        s1.grade="���꼶";
        s1.interests="������";
        s1.age=16;
        s1.say();
    }

    }
    class student {
        String name;
        int age;
        String grade;
        String interests;
        public void say(){
            System.out.println("ѧ����������"+name+"\n"+"ѧ��������"+age+"\n"+"ѧ�����꼶"+grade+"\n"+"ѧ������Ȥ"+interests);
        }
        class teacher{
           public void name(String name){
               System.out.println("��ʦ������Ϊ"+name);
           }
            public void age(){
                System.out.println("��ʦ������Ϊ25��");
            }
            public void teachAge(int teachAge){
                System.out.println("��ʦ�Ľ�ְ����Ϊ"+teachAge);
            }
            public void course(){
                System.out.println("��ʦ���ڵĿ�ĿΪ��ѧ");
            }
        }
    }