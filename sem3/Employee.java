package sem3;

public class Employee {

    private String Name;
    private String Lastname;
    private Post Post;
    private Double Salary;
    private int year;
    private int month;
    private int day;

    public Employee(){}

    public Employee(String name){
        this.Name = name;
    }

    public Employee(String name, String lastname){
        this.Name = name;
        this.Lastname = lastname;
    }

    public Employee(String name, String lastname, Post post){
        this.Name = name;
        this.Lastname = lastname;
        this.Post = post;
    }

    public Employee(String name, String lastname, Post post, Double salary){
        this.Name = name;
        this.Lastname = lastname;
        this.Post = post;
        this.Salary = salary;
    }

    public Employee(String name, String lastname, Post post, Double salary, int year, int month, int day) {
        this.Name = name;
        this.Lastname = lastname;
        this.Post = post;
        this.Salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String GetName(){
        return this.Name;
    }

    public void SetName(String name){
        this.Name = name;
    }

    public String GetLastname(){
        return this.Lastname;
    }

    public void SetLastname(String lastname){
        this.Lastname = lastname;
    }

    public Post GetPost(){
        return this.Post;
    }

    public void SetPost(Post post){
        this.Post = post;
    }

    public Double GetSalary(){
        return this.Salary;
    }

    public void SetSalary(Double salary){
        this.Salary = salary;
    }

    public StringBuilder GetAllInfo(){
        StringBuilder all_Info = new StringBuilder();
        all_Info.append(this.Name + "\n");
        all_Info.append(this.Lastname + "\n");
        all_Info.append(this.Post + "\n");
        all_Info.append(this.Salary + "\n");
        return all_Info;
    }

    //Медод сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
    public int compareDates(Employee other) {
        int yearDiff = Integer.compare(this.year, other.year);
        if (yearDiff != 0) {
            return yearDiff;
        }

        int monthDiff = Integer.compare(this.month, other.month);
        if (monthDiff != 0) {
            return monthDiff;
        }

        return Integer.compare(this.day, other.day);
    }
}
