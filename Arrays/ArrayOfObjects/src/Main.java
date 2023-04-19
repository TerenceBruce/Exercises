public class Main {
    public static void main(String[] args) {

        
        Account obj[] = new Account[2];
        obj[0] = new Account();
        obj[1] = new Account();

        obj[0].setData(0,1);
        obj[1].setData(3,4);
        System.out.println(" For Array Element 0 ");
        obj[0].showData();
        System.out.println(" For Array Element 1 ");
        obj[1].showData();
    }
}
class Account{
    int a;
    int b;
    public void  setData(int c, int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println(", value of a= "+a);
        System.out.println(", value of b= "+b);
    }
}