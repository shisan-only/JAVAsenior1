package text;
/*
�����ð������
 */
public class BubbleStort {
    public static void main(String[] args) {
        int[] arr = new int[]{43, 15, 22, 68, 79, 55, 43, 99};  //������������ֵ������ʱ����󣬵ڶ���43������ֵ����ʱ����ִ���
//  ð������
        for (int i = 0; i < arr.length; i++) {  //������ѭ��
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(arr[i] + "\t");
        }
    }


//        int[] number = new int[]{12, 15, 55, 44, 87, 645};
//        for (int i=0;i<number.length;i++){
//            main(number, i);
//            System.out.println(number[i]+"\t");
//        }
//    }
//
//    public static void main(int[] number, int i) {
//        for(int j=0;j<number.length-1-i;j++){
//            if (number[j]>number[j+1]){
//                int temp = number[j];
//                number[j]=number[j+1];
//                number[j+1]=temp;
//            }
//        }
//    }
}