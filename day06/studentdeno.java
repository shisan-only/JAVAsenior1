package day06;

/*
192.21
score(int)�� ����20��ѧ������ѧ��Ϊ1��20���꼶�ͳɼ����������ȷ����
����һ����ӡ��3�꼶(stateֵΪ3����ѧ����Ϣ��
�������ʹ��ð������ѧ���ɼ����򣬲���������ѧ����Ϣ
������Student�������������ԣ�ѧ��number(int)���꼶state(int)���ɼ�
����˼·��
����Դ���ʱ��Ҫ�������ƺ���������������ʶ

 */
class studentdemo {
    public static void main(String[] args) {
//      public static void main(Student[] args) {
//        Student one = new Student();
        Student[] man = new Student[20];
        for (int i = 0; i < man.length; i++) {
            man[i] = new Student();
            man[i].number = (i + 1);
            man[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            man[i].score = (int) (Math.random() * (100 - 1 + 1) + 1);//��������һ��ǿ��ת��
        }
        for (int i = 0; i < man.length; i++) {
            System.out.println(man[i].info());
//            System.out.println("************");
        }
        System.out.println("************");
        for (int i = 0; i < man.length; i++) {
            if (man[i].state == 3) {
//                System.out.println("ѧ�����꼶Ϊ" + man[i].state);
//                System.out.println("�ָ���*******************");
                System.out.println(man[i].info());
            }

        }
        System.out.println("***********");
        //ð������
        /*
        ������һ�δ�����ð�������д������⣬�������϶�����ֵ�Ĵ�С��������  ����һֱ�������
         */
        for (int i =0;i < man.length;i++) {
            for(int j =0;j< man.length - 1- i;j++){
                if(man[j].score>man[j+1].score){
//                    int temp = ��ʱ������ʱӦ�ý������������Ԫ�ض���������ĳɼ�������һ���ص㣩
                    Student temp = man[j];
                    man[j]=man[j+1];
                    man[j+1]=temp;
//                    man[j].score=man[j+1].score;
//                    man[j+1].score=temp;
                }
//            if (man[i].score>man[i-1]){
            }
            System.out.println(man[i].info());
        }

    }
    static class Student {
        int number;
        int state;
        int score;

        public String info() {
            return "�ɼ�Ϊ" + score + "," + "ѧ��Ϊ" + number + "," + "�༶Ϊ" + state;
        }
    }
}
