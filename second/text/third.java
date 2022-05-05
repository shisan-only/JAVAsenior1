package second.text;
/*
    匿名对象的使用
    1.理解：我们创建的对象没有显示的赋给一个变量名，即为匿名对象
    2.特征：匿名对象我们只可以调用一次
    3.开发中的使用如下
 */
public class third {
    public static void main(String[] args) {
        phone p = new phone();
        p.price=1999.99;
        System.out.println("手机的价格为"+p.price);
        p.playGame();
        p.sendEmail();
        System.out.println("*******");

        //匿名对象 和上面对比没有给他命名 这两个phone并不是一个  每一次new一个都会在堆中新创建一个地址
        new phone().sendEmail();
        new phone().playGame();
        System.out.println("********");
        //运用实例证明这两次的new并不是一个对象，而是两个。这也证明了匿名对象的一个特征。
        new phone().price=1999.99;
        new phone().setPrice(); //运行结果会是double的默认值 0.0
        //****
        System.out.println("***********");
        PhoneMall show = new PhoneMall();
        show.show(p);
        System.out.println("******");
        /*
        * 在这里的new phone 也是一个匿名的对象，但在内存中，堆空间新创建的phone会把自己的地址值赋给PhoneMall类里的方法，也就是局部变量，
        * 局部变量是在栈空间中的，进而可以让这个匿名对象调用多次。
        * ！！！注意！！！
        * 第一遍理解，不一定准确。
        * 因为我们调用的是一个带有形参的方法，所以我们要在调用时输入它的形参，而它的形参类型为phone。因为我们在上面给phone实例化l，便是上面的p
        * 所以我们在上面可以使用p。而在下面这个调用中，我们直接新创建了一个phone的类型。即匿名对象。   ！！！！这个也是开发中phone的使用方法
         */
        show.show(new phone());
    }
}
class PhoneMall{
    public void show(phone use){  //在这里边调用phone是因为方法的形参可以是任意的类型，所以可以调用phone。 use是给这个调用的形参命名
        use.sendEmail();
        use.playGame();
    }

}
class phone{
    double price; //价格
    public void sendEmail(){
        System.out.println("手机可以发送邮件");
    }
    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
    public void setPrice(){
        System.out.println("手机的价格为"+price);
    }
}