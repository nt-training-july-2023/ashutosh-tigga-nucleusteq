
public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPasswordException {
        boolean isNumber = false;
        boolean isAlphabet = false;
        boolean isOther = false;
        if (password.length() < 8) {
            throw new InvalidPasswordException(" Password must have at least 8 in length");
        } else {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                    isAlphabet = true;
                } else if ((ch >= 0 && ch <= 9)) {
                    isNumber = true;
                } else {
                    isOther = true;
                }
            }
            if(isAlphabet==true && isNumber==true && isOther==false){
                this.password = password;
            }else{
                 throw new InvalidPasswordException(" Password must not contain rather than number and alpahbets ");
            }
        }
        
    }

}
