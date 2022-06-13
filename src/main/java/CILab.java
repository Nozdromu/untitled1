public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        int length=myString.length();
        if(Character.isUpperCase(myString.charAt(0))){
            if(Character.isUpperCase(myString.charAt(1))){
                for(int i=2;i<length;i++){
                    if(Character.isLowerCase(myString.charAt(i))){
                        return false;
                    }
                }
            }else{
                for(int i=2;i<length;i++){
                    if(Character.isUpperCase(myString.charAt(i))){
                        return false;
                    }
                }
            }
        }else{
            for(int i=1;i<length;i++){
                if(Character.isUpperCase(myString.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }

}

