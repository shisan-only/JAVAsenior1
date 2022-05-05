package day01;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;
import java.util.Scanner;

public class frist {
    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("请输入一个百位数");
//        int sz = number.nextInt();
//        int g,s,b;
//         g = sz%100%10;
//         s = sz%100/10;
//         b = sz/100;
//        System.out.println("个位数为"+g+"\n"+"十位数为"+s+"\n"+"百位数为"+b);
//    }
       /*
       例题2
        */
//        Scanner number = new Scanner(System.in);
//        System.out.println("小明的成绩为");
//        int fz = number.nextInt();
//        if (fz==100){
//            System.out.println("父亲奖励一台BWM");
//        }else if (80<fz&&fz<=99){
//            System.out.println("父亲奖励一台苹果手机");
//        }else if (60<=fz&&fz<=80){
//            System.out.println("父亲奖励一台ipad");
//        }else  if(fz<60){
//            System.out.println("狗屁没有");
//        }else
//            System.out.println("这是一个假的分数");
//        }
        /*
        例题三
        由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else),并且从小到大输出。
         */

//        Scanner number = new Scanner(System.in);
//        System.out.println("请输入第一个数字");
//        int num1 = number.nextInt();
//        Scanner number1 = new Scanner(System.in);
//        System.out.println("请输入第二个数字");
//        int num2 = number1.nextInt();
//        Scanner number2 = new Scanner(System.in);
//        System.out.println("请输入第三个数字");
//        int num3 = number2.nextInt();
////        int arr =new int[] {num1,num2,num3};   思考：如何把这个三个数整合为一个数组
//        if (num1 > num2)
//            if (num2 > num3) {
//                System.out.println("从小到大的排序为" + num3 + "<" + num2 + "<" + num1);
//            } else if (num3 > num2) {
//                System.out.println("从小到大的排序为" + num2 + "<" + num3 + "<" + num1);
//            }
//            if (num2 > num1)
//                if (num1 > num3) {
//                    System.out.println("从小到大的排序为" + num3 + "<" + num1 + "<" + num2);
//                } else if (num3 > num1) {
//                    System.out.println("从小到大的排序为" + num1 + "<" + num3 + "<" + num2);
//                }
//            if (num3 > num1)
//                if (num1 > num2) {
//                    System.out.println("从小到大的排序为" + num2 + "<" + num1 + "<" + num3);
//                } else if (num2 > num1) {
//                    System.out.println("从小到大的排序为" + num1 + "<" + num2 + "<" + num3);
//                }
//            }
//
//        }
//            Scanner number = new Scanner(System.in);
//            System.out.println("请输入第一个数字");
//            int num1 = number.nextInt();
//            Scanner number1 = new Scanner(System.in);
//            System.out.println("请输入第二个数字");
//            int num2 = number1.nextInt();
//            Scanner number2 = new Scanner(System.in);
//            System.out.println("请输入第三个数字");
//            int num3 = number2.nextInt();
//            int[] arr = {num1, num2, num3};
//            Arrays.sort(arr);
//            System.out.println(Arrays.toString(arr));


//        /*
//        例题四：假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
//                         1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//                         2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//                         3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//                         4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//                         5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。

//            Scanner number  = new Scanner(System.in);
//            System.out.println("请输入一个两位数");
//            int num1 = number.nextInt();
//            int a,g,s;
//            int ng,ns;
//            a= (int)Math.random()*90+10;
//            System.out.println("彩票的中奖号码为"+a);
//            g = a % 10;
//            s = a / 10;
//            ng = num1 % 10;
//            ns = num1 / 10 ;
//            if (num1==a){
//                  System.out.println("恭喜中奖金10000美元");
//            }else if(s==ng && g==ns){
//                  System.out.println("恭喜中奖金3000美元");
//            }else if (s==ns|| g==ng){
//                  System.out.println("恭喜中奖金1000美元");
//            }else if (s==ng||g==ns){
//                  System.out.println("恭喜中奖金500美元");
//            }else{
//                  System.out.println("彩票作废");
//            }
            /*
            使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
            提示：String word = scan.next(); char c = word.charAt(0); switch(c){}
             */
//            Scanner number = new Scanner(System.in);
//            System.out.println("请输入一个字母");
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
//            System.out.println("请输入你的分数");
//            int fs = number.nextInt();
//           if (fs>60){
//                 System.out.println("您的成绩为合格");
//            }else
//                 System.out.println("您的成绩不合格");


          /*
          从键盘分别输入年、月、日，判断这一天是当年的第几天
          注：判断一年是否是闰年的标准：
          1）可以被4整除，但不可被100整除或可以被400整
           */
//            Scanner year = new Scanner(System.in);
//            System.out.println("请输入年份");
//            int year1 = year.nextInt();
//            Scanner month = new Scanner(System.in);
//            System.out.println("请输入月份");
//            int month1 = year.nextInt();
//            Scanner day = new Scanner(System.in);
//            System.out.println("请输入日数");
//            int day1 = year.nextInt();
//            int y = year1/400;
//            switch (month1){
//                  case 1:
//                        System.out.println("这是"+year1+"年的第"+day1+"天");
//                        break;
//                  case 2:
//                        day1=31+day1;
//                        System.out.println("这是"+year1+"年的第"+day1+"天");
//                        break;
//                  case 3:
//                        if (y==0){
//                              day1=31+29+day1;
//                              System.out.println("这是"+year1+"年的第"+day1+"天");
//                        }else {
//                              day1=31+28+day1;
//                              System.out.println("这是"+year1+"年的第"+day1+"天");
//                        }
//            }
          /*
          编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的值输出其对应的成绩等级：
           */
//          Scanner number = new Scanner(System.in);
//          System.out.println("请输入一个学生的成绩");
//          int score = number.nextInt();
//          if (score>=90){
//              System.out.println("等级为A");
//          }else if (70<=score&&score<=90){
//              System.out.println("等级为B");
//          }else if (60<=score&&score<=70){
//              System.out.println("等级为C");
//          }else {
//              System.out.println("等级为D");
//          }
//          Scanner number = new Scanner(System.in);
//          System.out.println("请输入一个学生的成绩");
//          int score = number.nextInt();
//          int s = score/10;
//          switch (s){
//              case 9:
//                  System.out.println("等级为A");
//                  break;
//              case 8:
//                  System.out.println("等级为B");
//                  break;
//              case 7:
//                  System.out.println("等级为B");
//                  break;
//              case 6:
//                  System.out.println("等级为C");
//                  break;
//              default:
//                  System.out.println("等级为D");
//              }
          /*
          编写程序从1循环到150，并在每行打印一个值，
          另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz
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
            99乘法表
            */

//        for (int j = 1; j <= 9; j++) {
//            for (int i = 1; i<= j; i++) {
//                System.out.println(i + "*" + j + "=" + i * j +"\t");
//            }
//            System.out.println();
//    }
        /*
        2. 从键盘读入学生成绩，找出最高分，
        并输出学生成绩等级。
        成绩>=最高分-10 等级为’A’
        成绩>=最高分-20 等级为’B’
        成绩>=最高分-30 等级为’C’
        其余 等级为’D’
        提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
        */
//
//        int [][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
//        //记录总和
//        int sum =0;
//        for(int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
////                int sum =0;
//                sum+=arr[i][j];
//                System.out.println(sum);
//            }
//        }
//        System.out.println("总和为"+sum);
        /*
        使用二维数组打印一个 10 行杨辉三角。
        【提示】
        1. 第一行有 1 个元素, 第 n 行有 n 个元素
        2. 每一行的第一个元素和最后一个元素都是 1
        3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]

        int[][] arr = new int[10][]; //打印一个10行的杨辉三角
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];         想法没有  瞎写
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
              arr[i]=new int[i+1]; //每行的个数
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
                System.out.print(arr[i][j]+" ");//输出的是一行
            }
            System.out.println(); //上面每输出完成一行后换行
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
