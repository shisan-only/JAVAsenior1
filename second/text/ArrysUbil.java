package second.text;
/*
* �Զ�������Ĺ�����
* ��Ҫ���������װΪһ������
 */
public class ArrysUbil {
    //����������ֵ
    public int getMax(int[] arr) {//��������Ҫ������һ������������������������Ҫ����˭�����ֵ����Сֵ
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //���������Сֵ
    public int getMin (int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    //��������ܺ�
    public int getSum (int [] arr){

        return 0;
    }
    //�������ƽ��ֵ
    public int getAvg (int [] arr){
        return 0;
    }
    //��ת����
    public void reverse(int [] arr){

    }
    //��������
    public int[] copy(int [] arr){
        return null;
    }
    //��������
    public void sort(int [] arr){

    }
    //��������
    public void print (int [] arr){

    }
    //����ָ��Ԫ��
    public int getIndex(int [] arr,int dest){
        return 0;
    }
}

