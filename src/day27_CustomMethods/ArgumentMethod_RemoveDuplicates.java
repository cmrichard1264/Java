package day27_CustomMethods;

public class ArgumentMethod_RemoveDuplicates {
public static void main(String[] args) {
        
        RemoveDuplicates("MadinaAdrienAva");
        
    }
    public static void RemoveDuplicates(String letters) {
        String result="";
        for (int i=0; i<letters.length();i++) {
            if(!result.contains(letters.substring(i,i+1)))
                result += letters.substring(i,i+1);
        }
            System.out.println(result);
        }
    
}
