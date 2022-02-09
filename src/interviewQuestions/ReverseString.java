package interviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str="Welcome! home kadir";
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reverse Split with String Builder");
        System.out.print(sb.reverse().toString());


        char[] ch=str.toCharArray();
        System.out.println("Reverse Split with to CharArray");
        for (int i= ch.length-1; i>=0 ;i--){
            System.out.print(ch[i] );
        }

        String sentence="Java is fun";
        String[] s=sentence.split(" ");//between double quotes shows you how would like to split.

        // String reverse="";
        for (int i=s.length-1 ; i>=0 ;i--){
            System.out.print(s[i] +" ");
        }
        System.out.println("Reverse Split with Split");
        //System.out.println(reverse);

        String str1="Hello";
        System.out.println("Reverse split with using charAt");
        System.out.println(reverse1(str1));
    }
    public static String reverse1(String str){
        String reverse="";
        for (int i=str.length()-1 ;i>=0 ;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    }

