package shoppingMall.people;

public class Customer extends Person{

    private String shoppingLocation;

    public Customer(String name, int age, String gender) {
        super(name, age, gender);
        super.setIsEmployee(false);
        this.shoppingLocation = shoppingLocation;
    }

    public String getShoppingLocation() {
        return shoppingLocation;
    }

    public void setShoppingLocation(String shoppingLocation) {
        this.shoppingLocation = shoppingLocation;
    }

    public void setIsEmployee(boolean employee) {
        super.setIsEmployee(false);
    }
    public void shopping(){
        System.out.println("LOCATION ::::: " + shoppingLocation);
        System.out.println("CUSTOMER ::::: " + getName());
        System.out.println("AGE ::::: " + getAge());
        if(getGender().equalsIgnoreCase("FEMALE")){
            System.out.println("She is shopping.");
        }else{
            System.out.println("He is shopping.");
        }
    }
}
