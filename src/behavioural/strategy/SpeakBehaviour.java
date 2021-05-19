package behavioural.strategy;

public interface SpeakBehaviour {
    public void speak();
}

class SignLanguage implements SpeakBehaviour{
    @Override
    public void speak() {
        System.out.println("communicate in sign");
    }
}

class NativeLanguage implements SpeakBehaviour{
    @Override
    public void speak() {
        System.out.println("communicate in users' native language");
    }
}
