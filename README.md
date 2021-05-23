<h1>Object Oriented Programming</h1>
This repository is used to implement object oriented programming concepts. This is mall surveillance system which 
has details about every shop in the mall and 
logs people at their entry and can provide that details when necessary.
<h2>Concepts:</h2>

* <h3>Inheritance</h3>
  Inheritance makes it possible to create a child class that inherits the fields and methods of the parent class. Inheritance in Java can be achieved using classes or interfaces. The child class can override the values and methods of the parent class, however it’s not necessary. It can also add new data and functionality to its parent. Parent classes are also called superclasses or base classes, while child classes are known as subclasses or derived classes as well. Java uses the 'extends'(for classes) and 'implements'(for interface) keyword to implement the principle of inheritance in code. <br/>
  
  In this case, we have [Person](src/main/java/shoppingMall/shops/Person.java) and [Store](src/main/java/shoppingMall/shops/Store.java) as base classes and other classes implement these.
  
    * [Person](src/main/java/shoppingMall/people/Person.java) 


      * [Customer](src/main/java/shoppingMall/people/Customer.java)


      * [Employee](src/main/java/shoppingMall/people/Employee.java) 


        * [CleaningStaff](src/main/java/shoppingMall/people/CleaningStaff.java) 


        * [SalesPerson](src/main/java/shoppingMall/people/SalesPerson.java) 


    * [Store](src/main/java/shoppingMall/shops/Store.java) 


      * [Clothing](src/main/java/shoppingMall/shops/ClothingStore.java) 


      * [GroceryStore](src/main/java/shoppingMall/shops/GroceryStore.java)


      * [TakeAways](src/main/java/shoppingMall/shops/TakeAways.java) 




* <h3>Abstraction</h3>
  Abstraction hides the underlying complexity of data. It avoids repetitive code and gives flexibility to programmers to change the implementation of the abstract behaviour. Only the signature of internal functionality is to be mentioned which can be implemented as required. Partial abstraction (0-100%) can be achieved with abstract classes. Total abstraction (100%) can be achieved with interfaces. <br/>
  
   In this case, partial abstraction is used in [Employee](src/main/java/shoppingMall/people/Employee.java) class. Here we mentioned signature of working() function which is later implemented in [CleaningStaff](src/main/java/shoppingMall/people/CleaningStaff.java) and [SalesPerson](src/main/java/shoppingMall/people/SalesPerson.java) classes. 

* <h3>Encapsulation</h3>
   Encapsulation restricts direct access to data members (fields) of a class. Fields are set to private and each field has a getter and setter method. Getter methods return the field. Setter methods let us change the value of the field.<br/>
   
  In this case, encapsulation is used in almost every class. Here we declare each field as private and change its values using setter method. Like in [GroceryStore](src/main/java/shoppingMall/shops/GroceryStore.java) class 'category' field is set using setter method. <br/>
  
   Field values can be set using constructor as well. However, you should use the constructor approach, when you want to create a new instance of the object, with the values 
  already populated(a ready to use object with value populated). This way you need not explicitly call the setter methods for each field in the object to populate them. You set the value using a setter approach, when you want to change the value of a field, after the object has been created.
  
* <h3>Polymorphism</h3>
  In polymorphism same method name is used several times. Different methods of the same name can be called from the object. All Java objects can be considered polymorphic (at the minimum, they are of their own type and instances of the Object class).<br/>
  
  There are two types of polymorphism
    * Static Polymorphism: It is achieved by method overloading. Methods of same name but with different arguments. 
      Example in [Main](src/main/java/shoppingMall/Main.java) class we have two 'scan()' methods. Both have same name 
    but different arguments.
      
    * Dynamic Polymorphism: It is achieved by method overriding. Implementation of method is changed in inherited 
      class. Example in [GroceryStore](src/main/java/shoppingMall/shops/GroceryStore.java) and [ClothingStore](src/main/java/shoppingMall/shops/ClothingStore.java) classes the method 'selling()' is overridden. However, for 
      class [TakeAways](src/main/java/shoppingMall/shops/TakeAways.java) if 'selling()' method is called the inherited method is directly shown.
      
Apart from these four concepts there is **Association**, **Aggregation** and other related concepts that are not 
covered 
here.

Reference : https://raygun.com/blog/oop-concepts-java/#encapsulation
    
      
