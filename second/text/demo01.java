package second.text;
//代码错误 需要更改 P189.18
public class demo01 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="小明";
        s1.grade="三年级";
        s1.interests="打篮球";
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
            System.out.println("学生的姓名是"+name+"\n"+"学生的年龄"+age+"\n"+"学生的年级"+grade+"\n"+"学生的兴趣"+interests);
        }
        class teacher{
           public void name(String name){
               System.out.println("教师的姓名为"+name);
           }
            public void age(){
                System.out.println("教师的年龄为25岁");
            }
            public void teachAge(int teachAge){
                System.out.println("教师的教职年龄为"+teachAge);
            }
            public void course(){
                System.out.println("老师教授的科目为数学");
            }
        }
    }