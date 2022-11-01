public class Employee {
    private String firstName;
    private String secondName;
    private final String lastName;
    private int department;
    private double salary;
    public static int counter;
    private final int id;

    public Employee(String secondName, String firstName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;


    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName() {
        return this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String setSecondName() {
        return this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return secondName + " " + firstName + " " + lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int setDepartment(int department) {
        return this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public double setSalary(double salary) {
        return this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return String.format("Отдел номер: %d. Фамилия: %s. Имя: %s. Отчество:  %s. Зарплата: %s. ID: %d", department, secondName, firstName, lastName, salary, id);
    }

    //Вывод всего списка в массиве
    public static void printAllEmplyees(Employee[] employees) {
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                System.out.println(employees1.toString());
            }
        }
    }

    //Сумма всей зарплаты
    public static void allSummSalary(Employee[] employees) {
        double sum = 0;
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                sum = sum + employees1.getSalary();

            }
        }
        System.out.println("Сумма всех зарплат " + sum);
    }

    //Индексация зарплаты
    public static void indexSalary(Employee[] employees) {
        double percent = 10;
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                employees1.setSalary(employees1.getSalary() + employees1.getSalary() * percent / 100);
                System.out.println("Индексация зарплаты сотрудника " + employees1.getId() + " равна " + employees1.getSalary());
            }
        }
    }

    //Минимальная зарплата
    public static void minSalary(Employee[] employees) {
        double min = Integer.MAX_VALUE;
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                if (min > employees1.getSalary()) {
                    min = employees1.getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата состовляет " + min);
    }

    //Максимальная зарплата
    public static void maxSalary(Employee[] employees) {
        double max = Integer.MIN_VALUE;
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                if (max < employees1.getSalary()) {
                    max = employees1.getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата состовляет " + max);
    }

    //Средняя зарплата
    public static void averageSalary(Employee[] employees) {
        double average = 0;
        double sum = 0;
        double countId = 0;
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                sum += employees1.getSalary();
                countId++;

            }
        }
        average = sum / countId;
        System.out.println("Средняя зарплата состовляет " + average);
    }

    public static void allFio(Employee[] employees) {
        for (Employee employees1 : employees) {
            if (employees1 != null) {
                System.out.println("Ф.И.О " + employees1.getFullName());
            }
        }
    }
}