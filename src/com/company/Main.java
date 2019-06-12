package com.company;

public class Main {

    public static void main(String[] args) {
        String string1 = "D23W8MCCIZQOP9";
        String string2 = "D236862CEZQOPS";

        System.out.println("Total differences: "+compareStrings(string1, string2));
    }

    public static Integer compareStrings(String first, String second) {
        int counter = 0;

        if(first.isEmpty()){
            System.out.println("string1 is empty");
        }
        if (second.isEmpty()) {
            System.out.println("string2 is empty");
        }else{
            if(first.length() == second.length()){
                int stringLength = first.length();
                // Compare both strings element by element
                for(int i = 0 ; i < stringLength; i++){
                    // If elements are different add 1 to counter
                    if(first.charAt(i) != second.charAt(i)){
                        counter++;
                    }
                }
                return counter;
            }else{
                System.out.println("Strings are not equal length");
            }
        }
        return 0;
    }
}
