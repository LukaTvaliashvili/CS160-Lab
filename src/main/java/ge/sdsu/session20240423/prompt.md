

**Student Enrollment System**

**Requirements:**

1.  Create an abstract class `Person` with attributes like `name`, `age`, `address`, and `contact`.
2.  Implement two subclasses of `Person`:
    -   `Student` with additional attributes like `studentId`, `major`, and `enrolledCourses`.
    -   `Faculty` with attributes like `facultyId`, `department`, and `teachingCourses`.
3.  Create an interface `EnrollmentOperations` with methods like `enrollCourse()`, `dropCourse()`, and `viewSchedule()`.
4.  Implement a `University` class that manages student and faculty information using lists and maps.
5.  Include methods in the `University` class to:
    -   Add new students and faculty members to the system.
    -   Remove students and faculty members.
    -   Enroll students in courses and assign faculty to courses.
    -   Display student and faculty information along with their courses.
6.  Handle exceptions such as student not found, course already enrolled, faculty not assigned to course, etc., using custom exception classes and exception handling.