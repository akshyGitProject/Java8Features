package UserDefinedStream;

public class Emp {
    private String name;
    private double salary;
    private int empId;
    private String city;
    private String dept;

    public Emp(String name,double salary, int empId, String city, String dept) {
        this.name = name;
        this.salary=salary;
        this.empId = empId;
        this.city = city;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", empId=" + empId +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

}
