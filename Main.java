//Parameterized constructor
public class Main {
    String Name;
    int age;
    String Dept;

    public Main(String Name, int age, String Dept){
        this.Name = Name;
        this.age = age;
        this.Dept = Dept;
    }

    void Displayinfo(){
        System.out.println("Name:" + this.Name);
        System.out.println("age:" + this.age);
        System.out.println("dept:" + this.Dept);
    }

    public static void main(String[] args){
        Main m1 = new Main("harish", 20, "cse");
        m1.Displayinfo();

        Main m2 = new Main("john", 22, "ece");
        m2.Displayinfo();
    }
}

//Static example
class StudentUtil {
    static String Name = "harish";

    static void Display(String Name){
        System.out.println(Name);
        System.out.println(StudentUtil.Name);
    }

    public static void main(String[] args){
        Display(Name);
    }
}
//parameterized constructor 
public class Main {

    int bankaccount;
    String Accountname;
    int Accountnumber;
    double Balance;
    String Bankname;

    public Main(int bankaccount,String Accountname,int Accountnumber,double Balance,String Bankname){
        this.bankaccount = bankaccount;
        this.Accountname = Accountname;
        this.Accountnumber = Accountnumber;
        this.Balance = Balance;
        this.Bankname = Bankname;
    }
    void Displayinfo(){
       System.out.println("Bank Account: " + this.bankaccount);
       System.out.println("Account Name: " + this.Accountname);
       System.out.println("Account Number: " + this.Accountnumber);
       System.out.println("Balance: " + this.Balance);
       System.out.println("Bank Name: " + this.Bankname);
    }
    public static void main(String[]args){
        Main acc1=new Main(12345, "harish", 67890, 1000.0, "icci");
        Main acc2=new Main(54321, "john", 98765, 2000.0, "hdfc");
        Main acc3=new Main(0, "karitk", 5865669, 11111000, "sbi");
        Main acc4=new Main(0, "kavin", 58656449, 111000, "indian bank");
        acc1.Displayinfo();
        acc2.Displayinfo();
        acc3.Displayinfo();
        acc4.Displayinfo();
    }
}
//method overloading parameterized method
public class Main {

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
        Main m1= new Main();
        m1.add(5,10);
        m1.add(5.5,10.5);
        m1.add(5,10.5);
        
    }


    
}//
//