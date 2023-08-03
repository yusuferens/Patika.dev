public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(){
        if (salary <= 1000) {
            return 0;
        }else{
            return salary * 0.03;
        }
    }

    public int bonus(){
       if (workHours > 40) {
           int extraHours = workHours - 40;
           return extraHours * 30;
       }else{
           return 0;



       }
    }
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked >= 20) {
            return salary * 0.15;
        } else if (yearsWorked >= 10) {  
            return salary * 0.1;
        } else {
            return salary * 0.05;
        }
    }

    public String toString(){
        double tax = tax();
        double bonus = bonus();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raiseSalary();

        return "Adı: " + name +
                "\nMaaşı:" + salary+
                "\nÇalışma Saati:" + workHours+
                "\nBaşlangıç Yılı:" + hireYear+
                "\nVergi:" + tax+
                "\nBonus:" + bonus+
                "\nMaaş Artışı:" + raiseSalary()+
                "\nVergi ve Bonuslar ile birlikte Maaş:" + salaryWithTaxAndBonus+
                "\nToplam Maaş:" + totalSalary;
    }



}

