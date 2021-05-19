package behavioural.strategy;

public interface JumpBehaviour {
    public void jump();
}

class HighJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("High jump");
    }
}

class LongJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("Long jump. It is flat.");
    }
}

class KrishJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("This is an ultimate superhero jump. It is high and long");
    }
}