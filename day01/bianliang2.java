package day01;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiTypeLoader;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bianliang2 {
    public static void main(String[] args) {
//        int b1 = 2;
//        int b2 = 3;
//        long b3 = b1 + b2;
//        System.out.println(b3);
//        int a1 = 3;
//        short a2 = 4;
//        long a3 = a1 + a2;
//        System.out.println(a3);
//        //练习
//        char c = 'a';
//        int num = 10;
//        String str = "hello";//看String的位置 是先计算String还是计算int
//        System.out.println(str + c + num);
//        System.out.println(c + num + str);
//        //
//        Scanner numm = new Scanner(System.in);
//        System.out.println("请输入你的成绩");
//        int cj = numm.nextInt();
//        if (cj > 100 || cj < 0) {
//            System.out.println("您输入的数据有误");
//        } else if (cj > 90) {
//            System.out.println("您的奖励为笔记本电脑");
//        } else if (cj > 80) {
//            System.out.println("您的奖励为ps4一台");
//        } else if (cj > 70) {
//            System.out.println("您的奖励为🍗");
//        } else if (cj > 60) {
//            System.out.println("奖励为双人混打");
//        } else {
//            System.out.println("啥也没有 挨打要吗？？？");
//        }
//        //成绩奖励
//        Scanner mm = new Scanner(System.in);
//        System.out.println("请输入第一个数字");
//        int szOne = mm.nextInt();
//        System.out.println("请输入第二个数字");
//        int szTwo = mm.nextInt();
//        System.out.println("请输入第三个数字");
//        int szThree = mm.nextInt();
//        if (szOne > szTwo && szOne > szThree) {
//            if (szTwo > szThree) {
//                System.out.println(szOne + ">" + szTwo + ">" + szThree);
//            }else if (szThree > szTwo) {
//                    System.out.println(szOne + ">" + szThree + ">" + szTwo);
//                }
//            } else if (szTwo > szOne && szTwo > szThree) {
//                if (szOne > szThree) {
//                    System.out.println(szTwo + ">" + szOne + ">" + szThree);
//                }else if (szThree > szOne) {
//                        System.out.println(szTwo + ">" + szThree + ">" + szOne);
//                    }
//                }
//                if (szThree > szOne && szThree > szTwo) {
//                if (szOne > szTwo) {
//                    System.out.println(szThree + ">" + szOne + ">" + szTwo);
//                }else if (szTwo > szOne) {
//                        System.out.println(szThree + ">" + szTwo + ">" + szOne);
//
//                }
//                //比较三个数字的大小15
//            }
//            Scanner dog = new Scanner(System.in);
//            System.out.println("请输入狗的年龄");
//            int dAge = dog.nextInt();
//            if (dAge<0){
//                System.out.println("您输入的年龄有误/请您重新输入");
//            }else if (dAge>1 && dAge<2){
//                double pAge = dAge*10;
//                System.out.println("狗的年龄相当与人的年龄为"+pAge);
//            }else if (dAge>2){
//                double pAge =(dAge-2)*4+2*10.5;
//                System.out.println("狗的年龄相当于人的年龄为"+pAge);
//            }
//            Scanner word = new Scanner(System.in);
//            System.out.println("请输入一个小写的字母");
//         char  C = word.next().charAt(0);//大写的C
//            switch (C){
//            case "a" : case "b" : case "c" :
//                break;
//        }
//
//
// switch ();
//             System.out.println(C);
//        Scanner word = new Scanner(System.in);
//        System.out.println("请输入一个小写的字母");
//        char C = word.next().charAt(0);
//        switch (C) {
//            case 'a'://截取第一个的字符（''） case 应该表示的是截取
//                System.out.println("A");
//            break;
//            case 'b':
//                System.out.print("B");
//            break;
//            case 'c':
//                System.out.print("B");
//            break;
//            case 'd':
//                System.out.print("D");
//            break;
//            default:
//                System.out.println("other");
//                break;
//        }//用switch来写出大小写转换，中间用的是单引号，需要注意。
//        Scanner number = new Scanner(System.in);
//        System.out.println("请输入你的分数");
//        int fs = number.nextInt();
//        switch (fs){
//            case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73:
//                System.out.println("您的成绩没有任何问题");
//                break;
//            case 59:
//                System.out.println("你的成绩要准备挨打了");
//                break;
//            default:
//                System.out.println("您输入的成绩有误");

//        }
//        Scanner je = new Scanner(System.in);
//        System.out.println("请输入月份");
//        int yf = je.nextInt();
//        switch (yf) {
//            case 3: case 4: case 5:
//                System.out.println("您输入的月份是春季");
//                break;
//            case 6: case 7: case 8:
//                System.out.println("您输入的月份是夏季");
//                break;
//            case 9: case 10: case 11:
//                System.out.println("您输入的月份是秋季");
//                break;
//            case 12: case 1: case 2:
//                System.out.println("您输入的月份是冬季");
//                break;
//            default:
//                System.out.println("你输入的月份有误");
//        }

        }
        //此题是一个比较典型的题目，题目中的变量来呢西的比较多。对于逻辑的考察比较好，既可以考察到了switch 也考察到了if和 if   Scanner yf =  new Scanner(System.in);
        //        System.out.println("请输入年份");
        //        int yer = yf.nextInt();
        //        System.out.println("请输入月份");
        //        int mother = yf.nextInt();
        //        System.out.println("请输入第几天");
        //        int day = yf.nextInt();
        //        int days = 0;
        //        switch (mother) {
        //            case 1:
        //                days = 0;
        //                break;
        //            case 2:
        //                days = 31;
        //                break;
        //            case 3:
        //                days = 59;
        //                break;
        //            case 4:
        //                days = 90;
        //                break;
        //            case 5:
        //                days = 120;
        //                break;
        //            case 6:
        //                days = 151;
        //                break;
        //            case 7:
        //                days = 181;
        //                break;
        //            case 8:
        //                days = 212;
        //                break;
        //            case 9:
        //                days = 243;
        //                break;
        //            case 10:
        //                days = 273;
        //                break;
        //            case 11:
        //                days = 304;
        //                break;
        //            case 12:
        //                days = 334;
        //                break;
        //            default:
        //                System.out.println("你输入的月份有误");
        //        }
        //        int sum =day+days;
        //        if (yer%4 !=0){
        //            System.out.println("这是"+yer+"的第"+sum+"天");
        //
        //        }
        //            else if  (yer%4 == 0){
        //                sum++;
        //            System.out.println("这是"+yer+"的第"+sum+"天");else。可以当作是一个典型的例子来学习！！


















        }


