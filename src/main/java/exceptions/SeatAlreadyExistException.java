package exceptions;

public class SeatAlreadyExistException extends RuntimeException{

    public SeatAlreadyExistException(String message) {
        super(message);
    }
}
