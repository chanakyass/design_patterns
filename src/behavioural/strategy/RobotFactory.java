package behavioural.strategy;

public class RobotFactory {
    public static Robot getRoboForRequirement(String requirement){
        Robot robot;
        switch(requirement){
            case "STEALTH":
                robot = Robot.robotBuilder().jumpBehaviour(new NoJump()).speakBehaviour(new SignLanguage()).moveBehaviour(new Walk()).build();
                break;
            case "NO_STEALTH":
                robot = Robot.robotBuilder().moveBehaviour(new Run()).speakBehaviour(new NativeLanguage()).jumpBehaviour(new KrishJump()).build();
            default:
                robot = null;
        }
        return robot;
    }
}
