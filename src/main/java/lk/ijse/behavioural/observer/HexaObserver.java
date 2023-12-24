package lk.ijse.behavioural.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("hexa value"+Integer.toHexString(subject.getState()));
    }

}
