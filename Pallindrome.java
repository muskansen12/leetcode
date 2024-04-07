package strings;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        int i=0;
        int j = str.length();
        boolean flag = true;
        while(i<j) {
            if (str.charAt(i) != str.charAt(i)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true)
            System.out.println("pallindrome");
        else
            System.out.println("Not pallindrome");
            }
}
