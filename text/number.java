package text;
//从键盘输入一个整数（1~20）
//        则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，
//        则程序输出：
//        1 2
//        4 3
//        输入数字3，则程序输出：
//        1 2 3
//        8 9 4
//        7 6 5
//        输入数字4， 则程序输出：
//        1   2   3   4
//        12  13  14  5
//        11  16  15  6
//        10  9   8   7

    import com.sun.deploy.security.SelectableSecurityManager;

    import java.util.Arrays;
import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = i.nextInt();
        int[][] arr = new int[number][number];//number直接就确定了这个数组的几行几列
        int s = number * number;
        int h = 0, l = 0;
        int a = 1;
//        System.out.println(arr[h][l]);
        for (int x = 0; x<=s; x++) {
            if (a == 1) {
                if (l < number && arr[h][l] == 0) {
                    arr[h][l++] = x;
                }else {
                    a=2;
                    h++;
                    l--;
                    x--;
                }
            }
        }
    }
}




      /*  System.out.println(arr[0][0]);//并没有在数组中现在但是这样可以解决输出时输出的是地址值
        System.out.println("arr"+Arrays.toString(arr));
        此语句中的输出数组是数组所指向的位置，需要添加一个语句
       if (number<0 && number>20){
           System.out.println("输入的数字有误");
      }*/

