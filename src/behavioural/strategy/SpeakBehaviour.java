package behavioural.strategy;

public interface SpeakBehaviour {
    public void speak();
}

//Robot will talk in sign language when in stealth.

class SignLanguage implements SpeakBehaviour{
    @Override
    public void speak() {
        System.out.println("communicate in sign");
    }
}

//Robot will talk in native language when not in stealth.

class NativeLanguage implements SpeakBehaviour{
    @Override
    public void speak() {
        System.out.println("communicate in users' native language");
    }
}
