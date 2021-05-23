package shoppingMall.people;

public abstract class Employee extends Person{
    private int employeeNo;
    private String workLocation;

    public Employee(String name, int age, String gender, boolean isEmployee, String workLocation, int employeeNo) {
        super(name, age, gender);
        super.setIsEmployee(true);
        this.workLocation = workLocation;
        this.employeeNo = employeeNo;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public void getDetails(){
        System.out.println("LOCATION ::::: " + workLocation);
        System.out.println("Is Employe ::::: " + getIsEmployee());
        System.out.println("EMPLOYEE ::::: " + getName());
        System.out.println("EMPLOYEE NUMBER ::::: " + employeeNo);
        System.out.println("AGE ::::: " + getAge());
        if(getGender().equalsIgnoreCase("FEMALE")){
            System.out.println("She is working.");
        }else{
            System.out.println("He is working.");
        }
    }
    public abstract void working();
}
