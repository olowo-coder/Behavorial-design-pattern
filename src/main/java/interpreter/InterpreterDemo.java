package interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterDemo {
    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alternation1 = new AndExpression(terminal2, terminal3);

        Expression alternation2 = new OrExpression(terminal1, alternation1);


        return new AndExpression(terminal3, alternation2);
    }
    public static void main(String[] args) {

//        String context = "Lions";
//        String context = "Lions Bears";
        String context = "Lions Tigers";
//        String context = "Bears";
//        String context = "Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));

    }



    static void test(){
        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|tiger|liger)");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println("Found a " + matcher.group() + ".");
        }
    }
}
