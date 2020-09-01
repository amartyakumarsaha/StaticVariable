 class Employee{
     String name;
     int age;
     static String company="TCS";           // Memory will be allocated only once for each employee
     public Employee(String name,int age)
     {
         this.name=name;
         this.age=age;
     }
     public void display(){
         System.out.println("Name="+name+" "+"Age="+age+" "+"Company="+company);
       }
}
public class StaticvariableExample {
    public static void main(String args[])
    {
        Employee e1=new Employee("Amartya",23);
        e1.display();
        Employee e2=new Employee("Kunal",24);
        e2.display();
        Employee e3=new Employee("Rajesh",22);
        e3.display();
    }
}
