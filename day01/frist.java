package day01;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class frist {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("������һ����λ��");
//        int sz = number.nextInt();
//        int g,s,b;
//         g = sz%100%10;
//         s = sz%100/10;
//         b = sz/100;
//        System.out.println("��λ��Ϊ"+g+"\n"+"ʮλ��Ϊ"+s+"\n"+"��λ��Ϊ"+b);
//    }
       /*
       ����2
        */
//        Scanner number = new Scanner(System.in);
//        System.out.println("С���ĳɼ�Ϊ");
//        int fz = number.nextInt();
//        if (fz==100){
//            System.out.println("���׽���һ̨BWM");
//        }else if (80<fz&&fz<=99){
//            System.out.println("���׽���һ̨ƻ���ֻ�");
//        }else if (60<=fz&&fz<=80){
//            System.out.println("���׽���һ̨ipad");
//        }else  if(fz<60){
//            System.out.println("��ƨû��");
//        }else
//            System.out.println("����һ���ٵķ���");
//        }
        /*
        ������
        �ɼ����������������ֱ�������num1��num2��num3�������ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������
         */

//        Scanner number = new Scanner(System.in);
//        System.out.println("�������һ������");
//        int num1 = number.nextInt();
//        Scanner number1 = new Scanner(System.in);
//        System.out.println("������ڶ�������");
//        int num2 = number1.nextInt();
//        Scanner number2 = new Scanner(System.in);
//        System.out.println("���������������");
//        int num3 = number2.nextInt();
////        int arr =new int[] {num1,num2,num3};   ˼������ΰ��������������Ϊһ������
//        if (num1 > num2)
//            if (num2 > num3) {
//                System.out.println("��С���������Ϊ" + num3 + "<" + num2 + "<" + num1);
//            } else if (num3 > num2) {
//                System.out.println("��С���������Ϊ" + num2 + "<" + num3 + "<" + num1);
//            }
//            if (num2 > num1)
//                if (num1 > num3) {
//                    System.out.println("��С���������Ϊ" + num3 + "<" + num1 + "<" + num2);
//                } else if (num3 > num1) {
//                    System.out.println("��С���������Ϊ" + num1 + "<" + num3 + "<" + num2);
//                }
//            if (num3 > num1)
//                if (num1 > num2) {
//                    System.out.println("��С���������Ϊ" + num2 + "<" + num1 + "<" + num3);
//                } else if (num2 > num1) {
//                    System.out.println("��С���������Ϊ" + num1 + "<" + num2 + "<" + num3);
//                }
//            }
//
//        }
//            Scanner number = new Scanner(System.in);
//            System.out.println("�������һ������");
//            int num1 = number.nextInt();
//            Scanner number1 = new Scanner(System.in);
//            System.out.println("������ڶ�������");
//            int num2 = number1.nextInt();
//            Scanner number2 = new Scanner(System.in);
//            System.out.println("���������������");
//            int num3 = number2.nextInt();
//            int[] arr = {num1, num2, num3};
//            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));


//        /*
//        �����ģ��������뿪��һ�����Ʊ����Ϸ����������ز���һ����λ���Ĳ�Ʊ����ʾ�û�����һ����λ����Ȼ��������Ĺ����ж��û��Ƿ���Ӯ��
//                         1)����û��������ƥ���Ʊ��ʵ��˳�򣬽���10 000��Ԫ��
//                         2)����û��������������ƥ���Ʊ���������֣���˳��һ�£����� 3 000��Ԫ��
//                         3)����û������һ�����ֽ�����˳�������ƥ���Ʊ��һ�����֣�����1 000��Ԫ��
//                         4)����û������һ�����ֽ������˳�������ƥ���Ʊ��һ�����֣�����500��Ԫ��
//                         5)����û����������û��ƥ���κ�һ�����֣����Ʊ���ϡ�

//            Scanner number  = new Scanner(System.in);
//            System.out.println("������һ����λ��");
//            int num1 = number.nextInt();
//            int a,g,s;
//            int ng,ns;
//            a= (int)Math.random()*90+10;
//            System.out.println("��Ʊ���н�����Ϊ"+a);
//            g = a % 10;
//            s = a / 10;
//            ng = num1 % 10;
//            ns = num1 / 10 ;
//            if (num1==a){
//                  System.out.println("��ϲ�н���10000��Ԫ");
//            }else if(s==ng && g==ns){
//                  System.out.println("��ϲ�н���3000��Ԫ");
//            }else if (s==ns|| g==ng){
//                  System.out.println("��ϲ�н���1000��Ԫ");
//            }else if (s==ng||g==ns){
//                  System.out.println("��ϲ�н���500��Ԫ");
//            }else{
//                  System.out.println("��Ʊ����");
//            }
            /*
            ʹ�� switch ��Сд���͵� char��תΪ��д��ֻת�� a, b, c, d, e. ��������� ��other����
            ��ʾ��String word = scan.next(); char c = word.charAt(0); switch(c){}
             */
//            Scanner number = new Scanner(System.in);
//            System.out.println("������һ����ĸ");
//            String word = number.next();
//            char scan = word.charAt(0);
//            switch (word){
//                  case "a":
//                        System.out.println("A");
//                        break;
//                  case "b":
//                        System.out.println("B");
//                        break;
//                  case "c":
//                        System.out.println("C");
//                        break;
//                  case "d":
//                        System.out.println("D");
//                        break;
//                  case "e":
//                        System.out.println("E");
//                        break;
//                  default:
//                        System.out.println("other");
//            }
//            Scanner number = new Scanner(System.in);
//            System.out.println("��������ķ���");
//            int fs = number.nextInt();
//           if (fs>60){
//                 System.out.println("���ĳɼ�Ϊ�ϸ�");
//            }else
//                 System.out.println("���ĳɼ����ϸ�");


          /*
          �Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
          ע���ж�һ���Ƿ�������ı�׼��
          1�����Ա�4�����������ɱ�100��������Ա�400��
           */
//            Scanner year = new Scanner(System.in);
//            System.out.println("���������");
//            int year1 = year.nextInt();
//            Scanner month = new Scanner(System.in);
//            System.out.println("�������·�");
//            int month1 = year.nextInt();
//            Scanner day = new Scanner(System.in);
//            System.out.println("����������");
//            int day1 = year.nextInt();
//            int y = year1/400;
//            switch (month1){
//                  case 1:
//                        System.out.println("����"+year1+"��ĵ�"+day1+"��");
//                        break;
//                  case 2:
//                        day1=31+day1;
//                        System.out.println("����"+year1+"��ĵ�"+day1+"��");
//                        break;
//                  case 3:
//                        if (y==0){
//                              day1=31+29+day1;
//                              System.out.println("����"+year1+"��ĵ�"+day1+"��");
//                        }else {
//                              day1=31+28+day1;
//                              System.out.println("����"+year1+"��ĵ�"+day1+"��");
//                        }
//            }
          /*
          ��д���򣺴Ӽ����϶���һ��ѧ���ɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���
           */
//          Scanner number = new Scanner(System.in);
//          System.out.println("������һ��ѧ���ĳɼ�");
//          int score = number.nextInt();
//          if (score>=90){
//              System.out.println("�ȼ�ΪA");
//          }else if (70<=score&&score<=90){
//              System.out.println("�ȼ�ΪB");
//          }else if (60<=score&&score<=70){
//              System.out.println("�ȼ�ΪC");
//          }else {
//              System.out.println("�ȼ�ΪD");
//          }
//          Scanner number = new Scanner(System.in);
//          System.out.println("������һ��ѧ���ĳɼ�");
//          int score = number.nextInt();
//          int s = score/10;
//          switch (s){
//              case 9:
//                  System.out.println("�ȼ�ΪA");
//                  break;
//              case 8:
//                  System.out.println("�ȼ�ΪB");
//                  break;
//              case 7:
//                  System.out.println("�ȼ�ΪB");
//                  break;
//              case 6:
//                  System.out.println("�ȼ�ΪC");
//                  break;
//              default:
//                  System.out.println("�ȼ�ΪD");
//              }
          /*
          ��д�����1ѭ����150������ÿ�д�ӡһ��ֵ��
          ������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz
           */
//          int number = 0;
//          for (int i = 0; i <= 150; i++) {
//              if (i % 5 == 0 && i % 3 == 0) {
//                  System.out.println(i + "good");
//              } else if (i % 3 == 0) {
//                  System.out.println(i + "foo");
//              } else if (i % 5 == 0) {
//                  System.out.println(i + "biz");
//              }else if (i%7==0){
//                  System.out.println(i+"baz");
//              }
//              System.out.println(i);
//          }
            /*
            99�˷���
            */

//        for (int j = 1; j <= 9; j++) {
//            for (int i = 1; i<= j; i++) {
//                System.out.println(i + "*" + j + "=" + i * j +"\t");
//            }
//            System.out.println();
//    }
        /*
        2. �Ӽ��̶���ѧ���ɼ����ҳ���߷֣�
        �����ѧ���ɼ��ȼ���
        �ɼ�>=��߷�-10 �ȼ�Ϊ��A��
        �ɼ�>=��߷�-20 �ȼ�Ϊ��B��
        �ɼ�>=��߷�-30 �ȼ�Ϊ��C��
        ���� �ȼ�Ϊ��D��
        ��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���
        */
//
//        int [][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
//        //��¼�ܺ�
//        int sum =0;
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
////                int sum =0;
//                sum+=arr[i][j];
//                System.out.println(sum);
//            }
//        }
//        System.out.println("�ܺ�Ϊ"+sum);
        /*
        ʹ�ö�ά�����ӡһ�� 10 ��������ǡ�
        ����ʾ��
        1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
        2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
        3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ء�����yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]

        int[][] arr = new int[10][]; //��ӡһ��10�е��������
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];         �뷨û��  Ϲд
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][0]=1;
                arr[i][i]=1;
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
         */
        int [][] arr = new int[10][];
        for (int i=0;i<arr.length;i++){
              arr[i]=new int[i+1]; //ÿ�еĸ���
              arr[i][0] =1;
              arr[i][i] =1;
              if (i>1){
                  for (int j=1;j<arr[i].length-1;j++){
                      arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                  }
              }
//            arr[i][i]=1;
        }
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");//�������һ��
            }
            System.out.println(); //����ÿ������һ�к���
        }

//        int [][] yanghui = new int[10][];
//        for (int i=0;i<yanghui.length;i++){
//            yanghui[i] = new int[i+1];
//            yanghui[i][0]=1;
//            for (int j=0;j<yanghui[i].length;j++){
//                if (i==j){
//                    yanghui[i][j]=1;
//                }else if (j>0){
//                    yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
//                }
//            }
//        }
//        for (int i=0;i<yanghui.length;i++){
//            for (int j=0;j<yanghui[i].length;j++){
//                System.out.print(yanghui[i][j]+" ");
//            }
//            System.out.println();
        }
    }
