package second.text;

public class ArrysUbliText {
    public static void main(String[] args) {
        ArrysUbil util = new ArrysUbil();
        int[] arr = new int[]{23, 58, 74, 26, 89, 44, 99};
        int max = util.getMax(arr);
        System.out.println("���ֵΪ" + max);
        int[] arr1 = new int[]{23, 58, 74, 26, 89, 44, 99};
        int min= util.getMin(arr);
        System.out.println("��СֵΪ" + min);

    }
}
