package sem3;

import java.util.ArrayList;
import java.util.List;

public class MyProgram {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        List<Employee> staff = new ArrayList<>();

        Employee slesar = new Employee("Сергей", "Клапышев", Post.Кассир, 1228954.21);
        Director terem = new Director("Сергей", "Терентьев", Post.Директор, 3228954.21);

        
        
        staff.add(terem);
        staff.add(slesar);

        terem.SalaryUp(terem, 1000000.00);
        
        System.err.println("\n"+terem.GetAllInfo());
    }
}
