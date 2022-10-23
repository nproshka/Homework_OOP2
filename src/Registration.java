public class Registration {

    public static final String RIGHT_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTYVWXYZ0123456789_";


    public static boolean register(String login, String password, String confirmPassword) {

        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static void checkLogin(String login) throws WrongLoginException {
        if (!checkSymbols(login)) {
            throw new WrongLoginException("Логин неверный!");
        }
    }
    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!checkSymbols(password)) {
            throw new WrongPasswordException("Пароль неверный!");
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongPasswordException("Пароли должны совпадать!!");
        }
    }

    public static boolean checkSymbols(String cs) {
        if (cs.length() > 20) {
            return false;
        }
        for (int i = 0; i < cs.length(); i++) {
            if (!RIGHT_SYMBOLS.contains(String.valueOf(cs.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


}
