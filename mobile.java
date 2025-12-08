public class mobile {
    void unlock(){
        System.out.println("swipe to unlock the mobile");
    }
    void unlock(int pin){
        System.out.println("eneter the pin to unlock the mobile ");

    }
    void unlock(boolean fingerprint){
        System.out.println("use fingerprint to unlock the mobile ");
    }
    void  unlock(String patterns){
        System.out.println("draw the pattern");
    }
    public static void main(String[]args){
        mobile m1=new mobile();
         mobile m2=new mobile();
        m1.unlock(1234);
        m2.unlock(false);
        m1.unlock("---||");

    }

    
}
