
**Problem: Designing a Car Rental System**

You're tasked with designing a system for a car rental company to manage their fleet of vehicles and rentals. The system should allow customers to rent cars, return them, and calculate rental fees based on various factors.

**Create a `Car` class**:   
-   Each car should have attributes such as make, model, year, license plate number, and rental status.
-   Include appropriate constructors and getter/setter methods.

**Create a `Rental` class**:    
-   This class should represent a rental transaction, containing information about the rented car, the customer, rental duration, and rental fee.
-   Include appropriate constructors and methods to calculate the rental fee based on factors like the type of car, rental duration, and any additional charges.

**Create a `Customer` class**:    
-   This class should represent a customer of the car rental company, containing information such as name, contact details, and rental history.
-   Include methods to rent a car, return a rented car, and view rental history.

**Create a `CarRentalSystem` class**:    
-   This class should use composition to contain collections of cars, customers, and rentals.
-   Include methods to add new cars to the fleet, register new customers, process rentals, and handle returns.

**In the `main` method**:    
-   Create an instance of the `CarRentalSystem` class.
-   Add cars to the fleet and register customers.
-   Demonstrate the process of renting and returning cars by customers.
-   Calculate rental fees and display rental history for customers.
