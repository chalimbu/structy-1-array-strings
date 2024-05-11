package org.example.uncompress;

public class Uncompres {

    public static String uncompress(String s) {
        int pointer1=0;
        int pointer2=0;
        StringBuilder sb=new StringBuilder();
        while(pointer1<s.length()){
            while(isNumber(s.charAt(pointer1))){
                pointer1++;
            }
            int repetitions=Integer.parseInt(s.substring(pointer2,pointer1));
            for(int i=0;i<repetitions;i++){
                sb.append(s.charAt(pointer1));
            }

            pointer2=pointer1+1;
            pointer1=pointer2;
        }
        // todo
        return sb.toString();
    }

    public static boolean isNumber(char a){
        int number=a-48;
        if(number>=0 && number<10){
            return true;
        }
        return false;
    }


    public static void main(String args[]) {

        uncompress("2c3a1t");
    }
}
