public class Main {
    public static void main(String[] args) {
        System.out.println("Hello курсовая работа!");
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Мартин", "Роберт", "Сесил", 1, 250000);
        employees[1] = new Employee("Мартин", "Джордж Реймонд", "Ричард", 2, 750000);
        //Вывод результатов:
        System.out.println(employees[0].toString()); //Выводит результат в конкретном элементе массива в toString.
        Employee.printAllEmplyees(employees);//Выводит результат всего массива в toString.
        Employee.allSummSalary(employees);//Выводит результат суммы всех зарплат
        Employee.indexSalary(employees);//Выводит результат индексации зарплаты всех сотрудников
        Employee.minSalary(employees);//Выводит результат минимальной зарплаты
        Employee.maxSalary(employees);//Выводит результат максимальной зарплаты
        Employee.averageSalary(employees);//Выводит результат средней зарплаты
        Employee.allFio(employees);//Выводит ФИО сотрудников






    }





}