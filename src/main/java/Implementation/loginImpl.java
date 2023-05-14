package Implementation;

import java.util.HashMap;

import Encryption.PasswordEncryption;
import Service.loginService;
public class loginImpl implements loginService {
    @Override
    public  String loginMap(String userName) {
        HashMap<String,String> user = new HashMap<>();
        user.put("Vishnu","Vishnu@123");
        user.put("Charan","Charan@123");
        user.put("Ramu","Ramu@123");
        user.put("","");
        String encryptedPassword;

        if(user.containsKey(userName)) {
            PasswordEncryption passwordEncryption = new PasswordEncryption();
            encryptedPassword = passwordEncryption.encrypt(user.get(userName), "Salt");
            passwordEncryption.generateSalt();
        }else{
            return "No user with that user name";
        }
        return encryptedPassword;
    }
}
