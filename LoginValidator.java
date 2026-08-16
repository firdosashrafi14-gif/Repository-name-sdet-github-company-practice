public class LoginValidator {

    public boolean validateLogin(String username, String password) {

        if (username != null && password != null) {
            return true;
        }

        return false;
    }
}
