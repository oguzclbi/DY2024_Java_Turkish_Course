package day00_homeworks.hw14_day51;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        String expression="([{}])";

        boolean result=areBracketsBalanced(expression);

        System.out.println("result = " + result);


    }

    private static boolean areBracketsBalanced(String expression) {

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current=expression.charAt(i);

            if (current=='('||current=='['||current=='{'){
                stack.push(current);

            } else if (current==')'||current==']'||current=='}') {
                if (stack.isEmpty()){
                    return false;
                }
                System.out.println("stack = " + stack);
                Character lastOpenedBracket=stack.pop();
                System.out.print("lastOpenedBracket = " + lastOpenedBracket+" ");
                System.out.println(current+" = current");

                if (lastOpenedBracket=='('&& current!=')'||
                    lastOpenedBracket=='['&& current!=']'||
                    lastOpenedBracket=='{'&& current!='}'
                ){
                    System.err.println("EŞLEŞME BAŞARISIZ");
                    return false;
                }else System.out.println("EŞLESME BAŞARILI \""+lastOpenedBracket+"\" KARAKTERİ STACK'DEN ÇIKARILIYOR");


            }


        }

        return stack.isEmpty();




    }


}
