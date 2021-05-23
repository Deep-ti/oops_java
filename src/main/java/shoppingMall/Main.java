package shoppingMall;

import shoppingMall.people.CleaningStaff;
import shoppingMall.people.Customer;
import shoppingMall.people.Person;
import shoppingMall.people.SalesPerson;
import shoppingMall.shops.ClothingStore;
import shoppingMall.shops.GroceryStore;
import shoppingMall.shops.Store;
import shoppingMall.shops.TakeAways;

public class Main {
    public static void main(String[] args) {
        System.out.println("################# Mall is Open #################");
        System.out.println("## First Store is opening ##");
        Store storeFirst = new GroceryStore("FoodBazar", "1st Floor",  2000843.8, 15);
        System.out.println("## Second Store is opening ##");
        Store storeSecond = new ClothingStore("LifeStyle", "3rd Floor", 437262000.8, 25);
        System.out.println("## Third Store is opening ##");
        Store storeThird = new TakeAways("Pizzeria", "4th Floor", 637262000.8, 5);
        System.out.println("## Fourth Store is opening ##");
        Store storeFourth = new TakeAways("BurgerKing", "4th Floor",  737262000.29, 6);

        System.out.println("-----------------------------------------");
        System.out.println("Lets Check the gate");
        System.out.println("Girl with Id enter");
        Person salesGirl = new SalesPerson("July", 19, "FEMALE", true, "3rd Floor", 9039211);
        System.out.println("----Entry----");
        System.out.println("Woman with Id enter");
        Person cleaningLady = new CleaningStaff("May", 38, "FEMALE", false, "2nd Floor", 488392);
        System.out.println("----Entry----");
        System.out.println("Man with Id enter");
        Person cleaningMan = new CleaningStaff("June", 28, "MALE", true, "2nd Floor", 488432);
        System.out.println("----Entry----");
        System.out.println("Girl without Id enter");
        Person customer = new Customer("Jan", 16, "FEMALE");
        System.out.println("----Entry----");

        System.out.println("-----------------------------------------");
        System.out.println("Lets Check inside mall");
        System.out.println("What Shop is this?");
        scan(storeFirst);
        System.out.println("Who is this?? What are they Doing???");
        scan(salesGirl);
        System.out.println("What Shop is this?");
        scan(storeSecond);
        System.out.println("Who is this?? What are they Doing???");
        scan(cleaningLady);
        System.out.println("What Shop is this?");
        scan(storeThird);
        System.out.println("Who is this?? What are they Doing???");
        scan(cleaningMan);
        System.out.println("What Shop is this?");
        scan(storeFourth);
        System.out.println("Who is this?? What are they Doing???");
        scan(customer);
    }

    private static void scan(Store store) {
        if(store instanceof GroceryStore){
            ((GroceryStore)store).selling();
        }else if(store instanceof ClothingStore){
            ((ClothingStore)store).selling();
        }else if(store instanceof TakeAways){
            ((TakeAways)store).selling();
        }else{
            System.out.println("ERROR DETECTING SHOP");
        }
    }

    private static void scan(Person person) {
        if(person instanceof SalesPerson){
            ((SalesPerson)person).working();
        }else if(person instanceof CleaningStaff){
            ((CleaningStaff)person).working();
        }else if(person instanceof Customer){
            ((Customer)person).setShoppingLocation("Now here");
            ((Customer)person).shopping();
        }else {
            System.out.println("ERROR DETECTING PERSON");
        }
    }
}
