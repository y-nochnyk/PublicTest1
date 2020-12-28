package utils;

public class StringReverser {
    private static final String message = "You're not allowed to type an empty input";
    public String stringReverseLooped(String string) {
        StringBuilder result = new StringBuilder();

        for (int i = string.length()-1; i>= 0; i--){
            result.append(string.charAt(i));
        }

        return result.toString();
    }

    public String stringReverseLazy(String string){
        StringBuilder result = new StringBuilder();
        result.append(string);

        return result.reverse().toString();
    }

    public boolean validateInput(String str){
        if (str.replace(" ", "").equals(""))
            throw new IllegalArgumentException(message);
        return true;
    }
}
