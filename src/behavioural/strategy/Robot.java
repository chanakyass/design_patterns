package behavioural.strategy;

public class Robot {
    private MoveBehaviour moveBehaviour;
    private SpeakBehaviour speakBehaviour;
    private JumpBehaviour jumpBehaviour;

    public Robot() {
    }

    public Robot(MoveBehaviour moveBehaviour, SpeakBehaviour speakBehaviour, JumpBehaviour jumpBehaviour) {
        this.moveBehaviour = moveBehaviour;
        this.speakBehaviour = speakBehaviour;
        this.jumpBehaviour = jumpBehaviour;
    }

    public void move(){
        moveBehaviour.move();
    }

    public void speak(){
        speakBehaviour.speak();
    }

    public void jump(){
        jumpBehaviour.jump();
    }

    public MoveBehaviour getMoveBehaviour() {
        return moveBehaviour;
    }

    public void setMoveBehaviour(MoveBehaviour moveBehaviour) {
        this.moveBehaviour = moveBehaviour;
    }

    public SpeakBehaviour getSpeakBehaviour() {
        return speakBehaviour;
    }

    public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
        this.speakBehaviour = speakBehaviour;
    }

    public JumpBehaviour getJumpBehaviour() {
        return jumpBehaviour;
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public static RobotBuilder robotBuilder(){
        return new RobotBuilder();
    }

    public static class RobotBuilder {
        private final Robot robot;

        public RobotBuilder(){
            robot = new Robot();
        }

        public RobotBuilder speakBehaviour(SpeakBehaviour speakBehaviour){
            robot.setSpeakBehaviour(speakBehaviour);
            return this;
        }

        public RobotBuilder jumpBehaviour(JumpBehaviour jumpBehaviour){
            robot.setJumpBehaviour(jumpBehaviour);
            return this;
        }

        public RobotBuilder moveBehaviour(MoveBehaviour moveBehaviour){
            robot.setMoveBehaviour(moveBehaviour);
            return this;
        }

        public Robot build(){
            return robot;
        }
    }
}
