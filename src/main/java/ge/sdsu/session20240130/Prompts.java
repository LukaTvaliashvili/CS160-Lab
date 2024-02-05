package ge.sdsu.session20240130;

public class Prompts {

    /*

You are tasked with designing a simple application to simulate a university's faculty structure. The faculty comprises
various types of employees, each with unique roles and responsibilities. To efficiently organize the faculty, you decide
to implement a Java program using inheritance.

Design a Java program that models the university faculty's structure using inheritance. Create a base class called
Employee with common attributes and behaviors shared by all employees, such as name, employeeId, and calculateSalary().
Then, create subclasses for different types of employees, such as Professor, Staff, and Administrator, each with specific
attributes and methods relevant to their role. Additionally, demonstrate method overriding by implementing specialized
versions of the calculateSalary() method in the subclasses.

Finally, create a University class to manage the collection of employees. Implement methods to add employees to the
university, display information about all employees, and calculate the total salary expenditure of the university.

*/





    /*
You are tasked with designing a software system to model a residential house. The system should be able to represent various components of a house such as rooms, kitchen, and bathroom, each with specific attributes.

Room Class:
    Create a Room class with the following attributes:
    - area: Represents the area of the room in square feet.
    - flooringType: Represents the type of flooring in the room.
    Implement a constructor to initialize the area and flooringType of the room.

Kitchen Class:
    Design a Kitchen class with the following properties:
       - hasOven: Indicates whether the kitchen has an oven.
       - hasSink: Indicates whether the kitchen has a sink.
    Implement a constructor to set the values of hasOven and hasSink.

Bathroom Class:
    Define a Bathroom class with the following characteristics:
        - hasShower: Specifies whether the bathroom has a shower.
        - hasBathtub: Specifies whether the bathroom has a bathtub.
    Create a constructor to initialize the hasShower and hasBathtub attributes.

House Class:
    Develop a House class to represent a residential house.
        It should contain the following attributes:
            - rooms (array of Room objects): Represents the rooms in the house.
            - kitchen (Kitchen object): Represents the kitchen in the house.
            - bathroom (Bathroom object): Represents the bathroom in the house.
    Implement a constructor to initialize the House object with rooms, kitchen, and bathroom.
    Include methods to:
        - Calculate the total area of the house.
        - Check if the kitchen has an oven.
        - Check if the bathroom has a shower.

Main Program:
    Write a main program to demonstrate the functionality of the house modeling system.
    Create instances of rooms, kitchen, and bathroom.
    Create a house object using these components.
    Display information about the house such as total area, kitchen appliances, and bathroom facilities.

Ensure that your implementation demonstrates the concept of composition in Java, where complex objects (e.g., House)
are built by combining simpler objects (e.g., Room, Kitchen, Bathroom).

     */



    /*
You are developing an examination room monitoring system that ensures students sitting side-by-side won't be able to cheat.
Each examination room is represented by the ExamRoom class, and each student in the room is represented by the Student class.
The ExamRoom class has the following properties:
    - roomId: Unique identifier for the examination room.
    - capacity: Maximum number of students the room can accommodate.
    - students: List of students currently in the room. (at least 5 students)
The Student class has the following properties:
- studentId: unique identifier for the student.
- name: name of the student.
- subject: the subject for which the student is taking the exam.

To prevent cheating, implement the following methods:
- addStudent: A method in the ExamRoom class to add a student to the room. Ensure that the room does not exceed its capacity,
              and that the subject of the added student is different from the subjects of the students sitting directly
              to their left. (Refer to checkForCheating method below)
- checkForCheating: A method in the ExamRoom class that checks for potential cheating by comparing the names of students
                    sitting side-by-side and their exam subjects. If two students have similar names or have
                    the same exam subject, consider it a potential cheating situation.
- displayRoom: A method in the ExamRoom class that displays the details of the examination room, including the list of students.
     */

}
