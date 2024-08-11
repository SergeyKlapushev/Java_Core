package sem3;

public class Employee {

    private String Name;
    private String Lastname;
    private Post Post;
    private Double Salary;
    private Gender Gender;
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

    public Employee(String name, String lastname, Post post, Double salary, Gender gender){
        this.Name = name;
        this.Lastname = lastname;
        this.Post = post;
        this.Salary = salary;
        this.Gender = gender;
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

    public String getName(){
        return this.Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public String getLastname(){
        return this.Lastname;
    }

    public void setLastname(String lastname){
        this.Lastname = lastname;
    }

    public Post getPost(){
        return this.Post;
    }

    public void setPost(Post post){
        this.Post = post;
    }

    public Double getSalary(){
        return this.Salary;
    }
    
    public void setSalary(Double salary){
        this.Salary = salary;
    }

    public Gender getGender(){
        return this.Gender;
    }

    public void setGender(Gender gender){
        this.Gender = gender;
    }
    

    public StringBuilder getAllInfo(){
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
