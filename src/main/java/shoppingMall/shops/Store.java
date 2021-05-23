package shoppingMall.shops;

public class Store {
    private String storeName;
    private String location;
    private double annualIncome;
    private String category;
    private int numberOfEmployees;

    public Store(String storeName, String location, double annualIncome, int numberOfEmployees) {
        this.storeName = storeName;
        this.location = location;
        this.annualIncome = annualIncome;
        this.numberOfEmployees = numberOfEmployees;
    }

    public void selling(){
        System.out.println("STORE ::::: " + storeName);
        System.out.println("LOCATION ::::: " + location);
        System.out.println("NUMBER OF EMPLOYEE ::::: " + numberOfEmployees);
        System.out.println("ANNUAL INCOME ::::: Rs." + String.format("%,.2f", annualIncome));
        System.out.println("It just sells....   " + category);
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
