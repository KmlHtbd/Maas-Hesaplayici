public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int raiseSalary;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        this.tax=tax();
        this.bonus=bonus();
        this.raiseSalary=raiseSalary();
    }
    public String toString() {//overriding the toString() method
        return "Adı: "+name
                + "\nTaban Maaş: " + salary
                + "\nÇalışma Saati: " + workHours
                + "\nBaşlangıç Yılı: " + hireYear
                + "\nVergi: " + tax
                + "\nBonus: " + bonus
                + "\nMaaş Artışı: " + raiseSalary
                + "\nNet Maaş: " + (salary+raiseSalary+bonus-tax);
    }
    public int tax() {
        if (salary > 1000) {
            return tax = salary * 3 / 100;
        }else{
           return tax=0;
        }
    }

    public int bonus(){
        if (workHours>40){
            return bonus= (workHours-40)*30;
        }else{
            return bonus=0;
        }
    }
    public int raiseSalary(){
        if (hireYear>2011){
            return raiseSalary=salary*5/100;
        }
        if (hireYear>2001 && hireYear<2011 ){
            return raiseSalary=salary*10/100;
        }
        if (hireYear<2001){
            return raiseSalary=salary*15/100;
        }
        return 0;
    }
}
