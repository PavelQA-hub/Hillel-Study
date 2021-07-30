package homeTask15.rainbow.login;

public class WrongLoginException {
    private String detail;

    public WrongLoginException() {
        detail = "Incorrect login";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
