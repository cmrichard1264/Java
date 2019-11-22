package practices;





public class PasswordValidation {
	
		
		public static boolean Validation(String password) {
		String lowercase = "(.*[a-z].*)";
		String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";  
        
        boolean  HasLower = password.matches(lowercase),

                 HasUpper = password.matches(uppercase),

                 HasDigits = password.matches(numbers),

                 HasSpecial = password.matches(specialchars),

                 Valid = false;

              

              if(password.length() >= 6 && !password.contains(" "))

              if( HasLower && HasUpper && HasDigits && HasSpecial)

              Valid = true;      

              return Valid;
	}
		
		public static void main(String[] args) {
			Validation("masafrasa");
		}
		
	

}
