package Lecture;

class Employee{
    public String name;
    public int Salary;

    void setName(String x){
        name = x;
    }

    String getName(){
        return name;
    }

    void setSalary(int x){
        Salary = x;
    }

    int getSalary(){
        return Salary;
    }

}

public class PS8_Q1{
    public static void main(String[] args) {
        Employee gulabo = new Employee();
        gulabo.setName("Gulabo Sharma");
        gulabo.setSalary(10);
        System.out.println(gulabo.getName());
        System.out.println(gulabo.getSalary());

        gulabo.setName("Kamal Sharma");
        gulabo.setSalary(8);
        System.out.println(gulabo.getName());
        System.out.println(gulabo.getSalary());

        Employee simran = new Employee();
        simran.setName("Simran Omprakash Joshua Singh Lekhadiya Patel KAdam Mishra Rawal");
        simran.setSalary(9);
        System.out.println(simran.getName());
        System.out.println(simran.getSalary());
    }
}