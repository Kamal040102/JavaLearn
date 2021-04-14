package Lecture;

class LearnConstructors{
    private int id;
    private String name;

    public void setId(int x){
        id = x;
    }
    public void setName(String x){
        name = x;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

public class constructors {
    public static void main(String[] args) {
        LearnConstructors gulabo = new LearnConstructors();
        
        System.out.println(gulabo.getId());
        System.out.println(gulabo.getName());
    }
}
