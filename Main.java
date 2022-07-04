//Q1.Write a Java program to return true if a given string contain the string 'pop', but the middle 'o' also may other character.
class Main{
    public static boolean checkPopInString(String str){
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)=='p' && str.charAt(i+2)=='p'){
                return true;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        System.out.println("Compile by Shubham Singh Rawat");
        String exampleString1 ="axdpopaw";
        String exampleString2 ="axdp@paw";
        String exampleString3 ="axdppqaw";
        System.out.println("\nString : " + exampleString1 +"\nString is in the format[p_p]: "+ checkPopInString(exampleString1));
        System.out.println("\nString : " + exampleString2 +"\nString is in the format[p_p]: "+ checkPopInString(exampleString2));
        System.out.println("\nString : " + exampleString3 +"\nString is in the format[p_p]: "+ checkPopInString(exampleString3));
    }
}
