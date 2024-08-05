package sem3;

public class Director extends Employee{
    
    public Director(String name, String lastname, Post post, Double salary){
        super(name, lastname, post, salary);
    }

    public static void SalaryUp(Employee employee, Double HowHight){
        if(employee.GetPost() != Post.Директор){
            employee.SetSalary(employee.GetSalary() + HowHight);
        }
    }
}
