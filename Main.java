//paramterized constructor
public class Main {
    String Name;
    int age;
    String Dept;
    public Main(String Name,int age ,String Dept){
        this.Name=Name;
        this.age=age;
        this.Dept=Dept;
    }
    void Displayinfo(){
        System.out.println("Name:"+this.Name);
        System.out.println("age:"+this.age);
        System.out.println("dept:"+this.Dept);


    }
    public static void main(String[]args){
        Main m1=new Main("harish",20,"cse");
        m1.Displayinfo();
        Main m2=new Main("john",22,"ece");
        m2.Displayinfo();

    }

    
}