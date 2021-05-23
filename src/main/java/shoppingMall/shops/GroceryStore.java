package shoppingMall.shops;

public class GroceryStore extends Store{

    public GroceryStore(String storeName, String location, double annualIncome, int numberOfEmployees) {
        super(storeName, location, annualIncome, numberOfEmployees);
        super.setCategory("Grocery");
    }

    public void selling(){
        super.selling();
        System.out.println("It sells FOOD Requirements");
    }
}
