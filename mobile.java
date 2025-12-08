public class mobile {

    void add(int a,int b){
        System.out.println(a+b);

    }
    void add(double a,double b){
        System.out.println(a+b);
    }
    void  add(int a, double b){
        System.out.println(a+b);
    }
    public static void main(String[]args){
        mobile m1=new mobile();
         mobile m2=new mobile();
        m1.unlock(1234);
        m2.unlock(false);
        m1.unlock("---||");

    }

    
}//
//

