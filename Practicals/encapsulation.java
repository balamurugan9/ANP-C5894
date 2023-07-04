package encapsulation;

class Employee {
    private int empId;
    private String name;
    private int age;
    private String address;

    // Constructor
    public Employee(int empId, String name, int age, String address) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Example usage
        Employee employee = new Employee(12345, "John Doe", 30, "123 Main Street");
        System.out.println(employee.getName());  // Output: John Doe

        employee.setAge(31);
        System.out.println(employee.getAge());  // Output: 31
    }
}
