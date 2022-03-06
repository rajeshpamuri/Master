package EmailIDsValidation;
import java.util.regex.Pattern;
public class EmailValidation {
 public static boolean isValid(String email)
 {
 String emailidRegex = "^[a-zA-Z0-8_+&*-]+(?:\\.[a-zA-Z0-8_+&*-]+)*@" +
 "(?:[a-zA-Z0-8-]+\\.)+[a-zA-Z]{2,5}$";
 Pattern pat = Pattern.compile(emailidRegex);
 if (email == null)
 return false;
 return pat.matcher(email).matches();
 }
 public static void main(String[] args) {
 String email1 = "Rajesh@gmail.com";
String email2 = "Bharth.com";
String email3 = "Sanjay@gmail.com";
 String[] emails= {email1,email2,email3};
 for (int i = 0; i < emails.length; i++) {
 String email=emails[i];
if (isValid(email))
 System.out.print(email+" is valid email");
 else
 System.out.print(email+" is invalid email");
 System.out.println();
 }
 }
}

