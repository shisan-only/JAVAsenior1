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
class studentdemo1 {
    public static void main(String[] args) {
//      public static void main(Student[] args) {
//        Student one = new Student();
        Student1[] man = new Student1[20];//����һ��"����",��������Ͳ�������������ֵ������Ϊ������ͷ���
        for (int i = 0; i < man.length; i++) {
            man[i] = new Student1();
            man[i].number = (i + 1);
            man[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            man[i].score = (int) (Math.random() * (100 - 1 + 1) + 1);//��������һ��ǿ��ת��
        }
        //������Ϣ
        studentdemo1 test = new studentdemo1();
        test.print(man);
        System.out.println("***********");
        //��������ѧ������Ϣ
      test.statedemo(man,3);
        System.out.println("********");
        //����ѧ������Ϣ��ѧ������
        test.testOne(man);
        test.print(man);
    }


//        System.out.println("***********");
//        //ð������
//

    //��������Ĳ���
    public void print(Student1[] man) {
        for (int i = 0; i < man.length; i++) {
            System.out.println(man[i].info());
        }
    }
    //���ҷ�����������Ϣֵ

    /**
     *����ָ����ѧ���꼶����Ϣ
     * @param man Ҫ���ҵ�����
     * @param state Ҫ���ҵ��꼶
     */
        public void statedemo(Student1[] man,int state) {
            for (int i = 0; i < man.length; i++) {
                if (man[i].state == state) {
                    System.out.println(man[i].info());
                }
            }
        }

    /**
     * ����ѧ���ĳɼ���ѧ������Ϣ����
     * @param man Ҫ���ҵ�����
     *            ��δ���������  �������д����˶�����ֵ������ȷ������
     */
    public void  testOne(Student1[]man){
            for (int i =0;i<man.length;i++) {
            for(int j =0;j<man.length-1-i;j++){
                if(man[j].score>man[j+1].score){
//                    int temp = ��ʱ������ʱӦ�ý������������Ԫ�ض���������ĳɼ�������һ���ص㣩
                    Student1 temp = man[j];
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

}
        class Student1 {
        int number;
        int state;
        int score;

        public String info() {
            return "�ɼ�Ϊ" + score + "," + "ѧ��Ϊ" + number + "," + "�༶Ϊ" + state;
        }
    }