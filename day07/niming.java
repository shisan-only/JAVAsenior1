package day07;

public class niming {
    public static void main(String[] args) {
    phone p = new phone();
    p.price=1999;
        System.out.println("手机的价格为"+p.price);
    phoneMall mall = new phoneMall();
    //匿名对象的使用
    mall.show(new phone());   //调用的下面的show方法
    }
}
    class phoneMall {
        public void show(phone phone) {    //在show方法第一个调用的参数为类，而第二个参数调用的为方法
            phone.sendEmail();
            phone.playGame();
        }
    }
    class phone {
        double price;

        public void sendEmail() {
            System.out.println("手机可以发送一个邮件");
        }

        public void playGame() {
            System.out.println("手机可以玩游戏");
        }
    }