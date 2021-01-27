public class Employee {
String FIO, position,email, phone;
int salary, age;


    Employee(String FIO, String position, String email, String phone, int salary, int age) {
        this.FIO =FIO;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }

    void getInfo() {
        System.out.println("ФИО: " + FIO + " Должность: " + position + " Электронная почта: " + email + " Зарплата: " + salary + " Возвраст: " + age );
    }

    int getAge() {
        return age;
    }
}


