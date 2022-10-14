import java.util.Scanner;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    public static double tax;
    public static double bonus;
    public static double raise;

    public Employee(String name, double salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        Tax(salary);
        Bonus(workHours);
        raiseSalary(hireYear, salary);
        raise = raiseSalary(hireYear, salary);
        toString(name, salary, workHours, hireYear, tax, bonus, raise);

    }

    public static double Tax(double salary) {

        if (salary >= 1000) {
            tax = salary * 3 / 100;
        } else {
            tax = 0;
        }
        return tax;
    }

    public static double Bonus(int workHours) {

        if (workHours > 40) {
            int extraHours = workHours - 40;
            bonus = extraHours * 30;
        }
        return bonus;
    }

    public static double raiseSalary(int hireYearInput, double salaryInput) {
        int workYear = 2021 - hireYearInput;
        double raise = 0;
        if (workYear < 10) {
            raise = salaryInput * 5 / 100;
        } else if (20 > workYear && workYear > 9) {
            raise = salaryInput * 10 / 100;
        } else if (workYear > 19) {
            raise = salaryInput * 15 / 100;
        }
        return raise;
    }

    public static void toString(String name, double salary, int workHours, int hireYear, double tax, double bonus, double raise) {
        System.out.println("Adı Soyadı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Çalıştığı Saat: " + workHours);
        System.out.println("İşe Giriş Yılı: " + hireYear);
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + (salary + bonus - tax));
        System.out.println("Toplam Maaş: " + (raise + salary));
    }
}