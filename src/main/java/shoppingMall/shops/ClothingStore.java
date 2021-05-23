package shoppingMall.shops;

public class ClothingStore extends Store{

    public ClothingStore(String storeName, String location, double annualIncome, int numberOfEmployees) {
        super(storeName, location, annualIncome, numberOfEmployees);
    }
    public void selling(){
        super.selling();
        System.out.println("It sells Clothing Requirements");
    }
}
