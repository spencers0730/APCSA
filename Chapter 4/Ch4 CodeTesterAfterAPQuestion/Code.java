public class Code{
    private String myCode;
    private String realCode;
    private final char fill = 'X';

    public Code(String code){
        myCode = code;
        realCode = code;
    }

    public String getCode(){
        return myCode;
    }

    public void hide(int p1, int p2){
        // replace(p1, p2, true);
        if(p1 >= 0 && p2 > p1 && p2 <= myCode.length() - 1){
            char[] myCodeChars = myCode.toCharArray();
            for(int i = p1; i < p2; i++){
                myCodeChars[i] = fill;
            }
            myCode = String.valueOf(myCodeChars);
        }
    }

    public void recover(int p1, int p2){
        // replace(p1, p2, false);
        if(p1 >= 0 && p2 > p1 && p2 <= myCode.length() - 1){
            char[] myCodeChars = myCode.toCharArray();
            for(int i = p1; i < p2; i++){
                myCodeChars[i] = realCode.charAt(i);
            }
            myCode = String.valueOf(myCodeChars);
        }
    }

    // public void replace(int p1, int p2, boolean hide){
    // if(p1 >= 0 && p2 > p1 && p2 <= myCode.length() - 1){
    // char[] myCodeChars = myCode.toCharArray();
    // for(int i = p1; i < p2; i++){
    // if(hide)
    // myCodeChars[i] = fill;
    // else
    // myCodeChars[i] = realCode.charAt(i);
    // }
    // myCode = String.valueOf(myCodeChars);
    // }
    // }
}