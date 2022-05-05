package second.text1;
/*
* 方法的重载
* 1、定义：在同一个类中，允许一个以上的同名的方法，只要他们的参数类型不同即可。
*     两同一不同   同一个类、相同的方法名
*          参数列表不同，参数个数不同，参数类型不同
* 2、举例
*    Arrys类中的sort（）/binary Search（）
* 3、判断是否重载：
*      跟方法的权限修饰符，返回值类型以及形参变量名，方法体都没有关系。
* 4、在通过对象调用方法的时候,如何确定一个指定的方法：
*    方法名----> 参数列表
 */
public class OverLoad {
    public static void main(String[] args) {
        OverLoad test = new OverLoad();
        test.getSum(1,2); //在调用方法的时候，如果有合适的类型则会优先的去使用相同的方法，如果没有则数字类型会进行转换
    }
    //如下的四个方法都构成了方法的重载
    public void getSum(int i,int j){
        System.out.println(i+j);
    }
    public void getSum (double d1,double d2){
        System.out.println("2");
    }
    public void getSum (String s ,int i){

    }
    public void getSum (int i ,String s){

    }
}
