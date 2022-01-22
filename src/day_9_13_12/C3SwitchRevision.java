package day_9_13_12;

public class C3SwitchRevision {
    public static void main(String[]arg){
        String option ="fourth";

        switch (option) {

            case " first":
                System.out.println("hello");

            case "second":
                System.out.println("slav");

            case "third":
                System.out.println("Chao"); break;

            case "fourth":
                int op = 2;
                switch (op) {

                    case 1:
                        System.out.println("play");

                    case 2:
                        System.out.println("study");


                    case 3:
                        System.out.println("sleep");
                }
        }
    }}
