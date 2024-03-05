package ge.sdsu.session20240305.exceptions;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String message){
        super("User Already exists " + message);
    }
}
