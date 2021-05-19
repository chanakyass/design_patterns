package behavioural.strategy;

/*
Strategy pattern is nothing but extracting common behaviours of objects as separate classes and
being able to modify the behaviour at run time with changing anything in existing classes.
Strategy pattern mainly can be used in cases when algorithm logic has to be separated from classes that use these algorithms.
It is also useful when you want to switch behaviour from one to another during run time.
And also when lot of switch case statements are present for different implementation of logics for particular behaviour
 */

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Run(), new SignLanguage(), new HighJump());
        robot.move();
        robot.jump();
        robot.speak();
        Robot robot2 = Robot.robotBuilder().jumpBehaviour(new LongJump()).moveBehaviour(new Walk()).speakBehaviour(new NativeLanguage()).build();
        robot2.move();
        robot2.jump();
        robot2.speak();
    }
}
