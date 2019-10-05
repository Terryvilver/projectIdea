class Student extends Person{
    private String college;
    private String classe;

    /* CONSTRUCTEUR */
    Student(){
        super();
        college = "";
        classe = "";
    }
    
    Student(String name, String email, int phone, String college, String classe){
        super(name, email, phone);
        this.college = college;
        this.classe = classe;
    }

    /* Getters */
    public String getCollege(){
        return this.college;
    }

    public String getClasse(){
        return this.classe;
    }

    /* Setters */
    public void setCollege(String college){
        this.college = college;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }
}

class Employee extends Person{
    private String title;
    private String employer;
    private String employeeGrade;
    private int salary;

    Employee(){
        super();
        title = "";
        employer = "";
        employeeGrade = "";
        salary = 0;
    }

    Employee(String name, String email, int phone, String title, String employer, String employeeGrade, int salary){
        super(name, email, phone);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    /* Getters */
    public String getTitle(){
        return this.title;
    }

    public String getEmployer(){
        return this.employer;
    }

    public String getEmployeeGrade(){
        return this.employeeGrade;
    }

    public int getSalary(){
        return this.salary;
    }

    /* Setters */
    public void setTitle(String title){
        this.title = title;
    }

    public void setEmployer(String employer){
        this.employer = employer;
    }

    public void setEmployeeGrade(String employeeGrade){
        this.employeeGrade = employeeGrade;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + " " + this.title + " " + this.employer + " " + this.employeeGrade + " " + this.salary;
    }

}

public class Person{
    protected String name;
    protected String email;
    protected int phone;

    /* CONSTRUCTEUR */
    protected Person(){
        name = "";
        email = "";
        phone = 0;
    }

    protected Person(String name, String email, int phone){
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    /* Getters */
    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhone(){
        return this.phone;
    }

    /* Setters */
    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public String toString(){
        return this.name + " " + this.email + " " + this.phone;
    }

    public static void main(String []args){
        Employee a1 = new Employee("Terry", "abc@gmail.com", 123456789, "Professeur", "Mr Paul", "Grade:A", 15000);
        System.out.println(a1);
    }
}

