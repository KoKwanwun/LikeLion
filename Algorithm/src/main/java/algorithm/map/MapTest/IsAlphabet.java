package algorithm.map.MapTest;

public class IsAlphabet {
    boolean checkIsAlphabet(char c){
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
            return true;
        } else{
            return false;
        }
    }
}
