package second.demo10;
/*
        *��νjavaBean����ָ�������±�׼��Java�ࣺ
        *���ǹ�����
        *��һ���޲εĹ����Ĺ�����
        *�����ԣ����ж�Ӧ��get��set����

 */
public class Customer {
    private int id;
    private String name;
    public Customer(){

    }
    public void setId(int i){
        id = i;
    }
    public int getId (){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String  getNam(){
        return name;
    }
}
