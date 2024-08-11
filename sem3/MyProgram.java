package sem3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MyProgram {
    @SuppressWarnings("static-access")
    public static void main(String[] args) 
    {
        
        List<Employee> staff = new ArrayList<>();

        Employee slesar2 = new Employee("Сергей", "Клапышев", Post.Кассир, 1228954.21, Gender.Men);
        Employee slesar3 = new Employee("Мария", "Краблёва", Post.Кассир, 1228954.21, Gender.Female);
        Director terem = new Director("Сергей", "Терентьев", Post.Директор, 3228954.21);
        
        staff.add(terem);
        staff.add(slesar2);
        staff.add(slesar3);

        terem.SalaryUp(terem, 1000000.00);
        
        System.err.println("\n"+terem.getAllInfo());
    }

    public static void сongratulationscongradelationByGollyday(Employee[] employees){
        LocalDate today = LocalDate.now();
        Holidays currentHoliday = getCurrentHoliday(today);

          for (Employee employee : employees) 
          {
            switch (currentHoliday) 
            {
                case NEW_YEAR:
                    System.out.println("Поздравляем с новым годом " + employee.getName() + "!");
                    break;

                case WOMEN_DAY:
                    if (employee.getGender() == Gender.Female) {
                        System.out.println("Поздравляем с 8-ым марта " + employee.getName() + "!");
                    }
                    break;

                case MEN_DAY:
                    if (employee.getGender() == Gender.Men) {
                        System.out.println("Поздравляем с 23-им февраля " + employee.getName() + "!");
                    }
                    break;

                case NO_HOLIDAY:
                    break;
            }
        }
    }

    private static Holidays getCurrentHoliday(LocalDate date) {
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        if (month == 1 && day == 1) {
            return Holidays.NEW_YEAR;
        } else if (month == 3 && day == 8) {
            return Holidays.WOMEN_DAY;
        } else if (month == 2 && day == 23) {
            return Holidays.MEN_DAY;
        } else {
            return Holidays.NO_HOLIDAY;
        }
    } 
}
