public class Rate {
    int amount;
    double rate;
    double time;
   
    Rate(int a, double r,double t){
        amount=a;
        rate=r;
        time=t;
    }
    void Displayinfo(){
        System.out.println(amount*rate*time/100);
    }


public static void main(String[ ]args){
    new Rate(1000,5.5,2).Displayinfo();

}}
