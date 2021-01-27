public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Иванов Иван Иванович","Менеджер","ivanov@mail.ru","+79999994991",40000, 25);
        staff[1] = new Employee("Александров Александр Александрович","Тестировщик","aleksandrov@mail.ru","+79999994992",50000, 35);
        staff[2] = new Employee("Семенов Семен Семенович","Программист","semenov@mail.ru","+79999994993",100000, 41);
        staff[3] = new Employee("Антонов Антон Антонович","Бизнес-аналитик","antonov@mail.ru","+79999994995",80000, 45);
        staff[4] = new Employee("Сергеев Сергей Сергеевич","Системный аналитик","sergeev@mail.ru","+79999994994",90000, 39);

        for (int i=0; i< staff.length;i++) {
            if(staff[i].getAge()>40) {
                staff[i].getInfo();
            }
        }
    }
}
