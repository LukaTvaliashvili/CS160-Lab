package ge.sdsu.session20240305;

import ge.sdsu.session20240305.exceptions.UserAlreadyExistsException;

public class Example4 {

    public static void main(String[] args){

//        System.out.println(addUser("1"));
        try {
            System.out.println(addUser1("1"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(addUser3("1"));

    }

    public static boolean addUser(String id){
        // attempt to add user to DB
        // if user with given Id already exists
        throw new RuntimeException("User Already exists");
//        return false; -> unreachable statement
    }


    public static boolean addUser1(String id) throws Exception{
        // attempt to add user to DB
        // if user with given Id already exists
        throw new Exception("User Already exists");
//        return false; -> unreachable statement
    }

    public static boolean addUser3(String id){
        // attempt to add user to DB
        // if user with given Id already exists
        throw new UserAlreadyExistsException(id);
//        return false; -> unreachable statement
    }
}
