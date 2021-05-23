package shoppingMall.people;

public class SalesPerson extends Employee{

    public SalesPerson(String name, int age, String gender, boolean isEmployee, String workLocation, int employeeNo) {
        super(name, age, gender, isEmployee, workLocation, employeeNo);
    }

    public void working(){
        getDetails();
        if(getGender().equalsIgnoreCase("FEMALE")){
            System.out.println("She is selling.");
        }else{
            System.out.println("He is selling.");
        }
    }
}
