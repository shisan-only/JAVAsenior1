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
class studentdemo {
    public static void main(String[] args) {
//      public static void main(Student[] args) {
//        Student one = new Student();
        Student[] man = new Student[20];
        for (int i = 0; i < man.length; i++) {
            man[i] = new Student();
            man[i].number = (i + 1);
            man[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            man[i].score = (int) (Math.random() * (100 - 1 + 1) + 1);//这里面有一个强制转换
        }
        for (int i = 0; i < man.length; i++) {
            System.out.println(man[i].info());
//            System.out.println("************");
        }
        System.out.println("************");
        for (int i = 0; i < man.length; i++) {
            if (man[i].state == 3) {
//                System.out.println("学生的年级为" + man[i].state);
//                System.out.println("分隔符*******************");
                System.out.println(man[i].info());
            }

        }
        System.out.println("***********");
        //冒泡排序
        /*
        下面这一段代码再冒泡排序中存在问题，在排序上对于数值的大小排序会出错  但是一直解决不了
         */
        for (int i =0;i < man.length;i++) {
            for(int j =0;j< man.length - 1- i;j++){
                if(man[j].score>man[j+1].score){
//                    int temp = 此时再排序时应该交换的是数组的元素而不是数组的成绩（这是一个重点）
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
            return "成绩为" + score + "," + "学号为" + number + "," + "班级为" + state;
        }
    }
}
