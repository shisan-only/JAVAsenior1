package day07;

public class niming {
    public static void main(String[] args) {
    phone p = new phone();
    p.price=1999;
        System.out.println("�ֻ��ļ۸�Ϊ"+p.price);
    phoneMall mall = new phoneMall();
    //���������ʹ��
    mall.show(new phone());   //���õ������show����
    }
}
    class phoneMall {
        public void show(phone phone) {    //��show������һ�����õĲ���Ϊ�࣬���ڶ����������õ�Ϊ����
            phone.sendEmail();
            phone.playGame();
        }
    }
    class phone {
        double price;

        public void sendEmail() {
            System.out.println("�ֻ����Է���һ���ʼ�");
        }

        public void playGame() {
            System.out.println("�ֻ���������Ϸ");
        }
    }