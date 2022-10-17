package week3_221004_221007.day_221006.MapTest;

public class IsAlphabet {
    boolean checkIsAlphabet(char c){
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
            return true;
        } else{
            return false;
        }
    }
}
