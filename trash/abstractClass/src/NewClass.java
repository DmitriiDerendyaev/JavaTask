public class NewClass {
    public static void main(String[] args) {
        Emploee firstEmploee = new Emploee("John", 50, "KazanExpress", 100500);
        firstEmploee.display();
    }

    abstract class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void display(){
            System.out.printf("Name: %s, Age: %d", name, age);
        }

    }

    class Emploee extends Person{
        private String jobName;
        private int salary;

        public Emploee(String name, int age, String jobName, int salary) {
            super(name, age);
            this.jobName = jobName;
            this.salary = salary;
        }
        
        @Override
        public void display() {
            System.out.printf("Name: %s, Age: %d, Name of Job: %s, Salary: %d",
                    super.getName(), super.getAge(), jobName, salary);
        }
    }
}

//public class NewClass{
//
//    public static void main(String[] args) {
//
//        Employee sam = new Employee("Sam", "Leman Brothers");
//        sam.display();
//        Client bob = new Client("Bob", "Leman Brothers");
//        bob.display();
//    }
//}
//abstract class Person {
//
//    private String name;
//
//    public String getName() { return name; }
//
//    public Person(String name){
//
//        this.name=name;
//    }
//
//    public abstract void display();
//}
//
//class Employee extends Person{
//
//    private String bank;
//
//    public Employee(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}
//
//class Client extends Person
//{
//    private String bank;
//
//    public Client(String name, String company) {
//
//        super(name);
//        this.bank = company;
//    }
//
//    public void display(){
//
//        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
//    }
//}