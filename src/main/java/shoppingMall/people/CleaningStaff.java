package shoppingMall.people;

public class CleaningStaff extends Employee{

    public CleaningStaff(String name, int age, String gender, boolean isEmployee, String workLocation, int employeeNo) {
        super(name, age, gender, isEmployee, workLocation, employeeNo);
    }

    public void working(){
        getDetails();
        if(getGender().equalsIgnoreCase("FEMALE")){
            System.out.println("She is cleaning.");
        }else{
            System.out.println("He is cleaning.");
        }
    }
}
