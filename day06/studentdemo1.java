package day06;

/*
192.21
score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
解题思路：
在面对此题时需要对类的设计和数组的理解有所认识

 */
class studentdemo1 {
    public static void main(String[] args) {
//      public static void main(Student[] args) {
//        Student one = new Student();
        Student1[] man = new Student1[20];//这是一个"数组",数组的类型不仅仅局限于数值还可以为别的类型分组
        for (int i = 0; i < man.length; i++) {
            man[i] = new Student1();
            man[i].number = (i + 1);
            man[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            man[i].score = (int) (Math.random() * (100 - 1 + 1) + 1);//这里面有一个强制转换
        }
        //遍历信息
        studentdemo1 test = new studentdemo1();
        test.print(man);
        System.out.println("***********");
        //遍历查找学生的信息
      test.statedemo(man,3);
        System.out.println("********");
        //按照学生的信息给学生遍历
        test.testOne(man);
        test.print(man);
    }


//        System.out.println("***********");
//        //冒泡排序
//

    //遍历数组的操作
    public void print(Student1[] man) {
        for (int i = 0; i < man.length; i++) {
            System.out.println(man[i].info());
        }
    }
    //查找符合条件的信息值

    /**
     *查找指定的学生年级的信息
     * @param man 要查找的数组
     * @param state 要查找的年级
     */
        public void statedemo(Student1[] man,int state) {
            for (int i = 0; i < man.length; i++) {
                if (man[i].state == state) {
                    System.out.println(man[i].info());
                }
            }
        }

    /**
     * 按照学生的成绩给学生的信息排序
     * @param man 要查找的数组
     *            这段代码有问题  在排序中存在了对于数值排序不正确的问题
     */
    public void  testOne(Student1[]man){
            for (int i =0;i<man.length;i++) {
            for(int j =0;j<man.length-1-i;j++){
                if(man[j].score>man[j+1].score){
//                    int temp = 此时再排序时应该交换的是数组的元素而不是数组的成绩（这是一个重点）
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
            return "成绩为" + score + "," + "学号为" + number + "," + "班级为" + state;
        }
    }