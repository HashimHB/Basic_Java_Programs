import java.util.*;
class MaxChar{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = scan.nextLine();

        s = s.replaceAll("\\s,"," ");

        int arr[] = new int[256];
        int len = s.length();
        for(int i=0;i<len;i++){
            arr[s.charAt(i)]++;
        }

        int max = -1;
        char c = 0;
        for(int i=0;i<len;i++){
            if(max<arr[s.charAt(i)]){
                max = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("The maximum occuring characters in a string are:"+c);
    }
}