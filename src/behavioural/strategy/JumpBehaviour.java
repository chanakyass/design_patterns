package behavioural.strategy;

public interface JumpBehaviour {
    public void jump();
}

class NoJump implements JumpBehaviour {
    @Override
    public void jump() {
        System.out.println("no jump");
    }
}

// Robot does high jump when it is fighting flying villains.

class HighJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("High jump");
    }
}

//Robot does long jump when it has to reach farther places.

class LongJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("Long jump. It is flat.");
    }
}

//Robot does krish jump in ultimate cases

class KrishJump implements JumpBehaviour{
    @Override
    public void jump() {
        System.out.println("This is an ultimate superhero jump. It is high and long");
    }
}