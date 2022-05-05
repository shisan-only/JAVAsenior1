package second.text1;

/*
 * 可变个数形参的方法
 * 1、jdk 5.0 新增的方法
 * 2、具体的使用
 *   2.1、 可变个数形参的格式: 数据类型...变量名
 *   2.2、当调用可变个数形参的方法时，传入的参数可以是0个，1个，2个 ......
 *   2.3 可变个数形参的方法与本类中方法名相同，形参不同方法之间构成了方法的重载
 *   2.4 可变个数形参的方法与本类方法名相同，形参类型也相同的数组之间不能够构成重载，不可以共存。
 *   2.5 可变个数的形参在方法的形参中，必须声明在末尾。
 *   2.6 可变个数的形参在方法的形参中，只能声明一个，与2.5相关联。
 * 3、 使用场景可能为在数据库选择数据时，不知道用户所要查找的条件是一个还是多个时，会用到。
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest text = new MethodArgsTest();
        text.show(8);
        text.show("hello");
        text.show("hello", "world");
        text.show("hello", "world", "yes");
        text.show();
        text.show("你好","世界","厉害");
    }

    public void show(int i) {

    }

    public void show(String i) {

    }
    // 这个也可以去看作一个数组，for循环和数组的是一样的。
    public void show(String... strs) {
        System.out.println("show(String ... str)");
        for (int i =0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }
    //这两个代码不可以共存，看注释2.4
//    public void show(String [] arr){
//
//    }
    //可变个数的形参在声明的时候，要在最后声明，否则报错。原因则是因为在编译时，会分不清可变个数和别的类型如何去分配。是
    // String在前面，涵盖了很多的数值，后面哪一个是别的类型那？ 长度不确定 傻傻分不清楚    看2.5
    public void show (int i , String ... strs){

    }
    //错误代码 错误原因看上边
//    public void show ( String ... strs, int i){
//
//    }
}
