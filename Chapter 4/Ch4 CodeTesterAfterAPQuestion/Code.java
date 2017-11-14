public class Code{
    private String myCode;
    private String realCode;

    public Code(String code){
        myCode = code;
        realCode = code;
    }

    public String getCode(){
        return myCode;
    }

    public void hide(int p1, int p2){
        if(p1 >= 0 && p2 > p1 && p2 <= myCode.length() - 1){
            String add = "";
            for(int i = p1; i < p2; i++){
                add+= "X";
            }
            myCode = myCode.substring(0, p1) + add + myCode.substring(p2);
        }
    }

    public void recover(int p1, int p2){
        if(p1 >= 0 && p2 > p1 && p2 <= myCode.length() - 1){
            myCode = myCode.substring(0, p1) + realCode.substring(p1, p2) + myCode.substring(p2);
        }
    }
}
