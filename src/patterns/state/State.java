package patterns.state;

interface LampState {
    public void onOpen();

    public void onClose();
}

class LampOpenState implements LampState {

    @Override
    public void onOpen() {
        System.out.println("Lamba acmaya calisiyorsunuz fakat lamba zaten acik");
    }

    @Override
    public void onClose() {
        System.out.println("Lamba acik fakat kapaniyor...");
    }
}

class LampClosedState implements LampState {

    @Override
    public void onOpen() {
        System.out.println("Lamba kapali fakat suan aciliyor..");
    }

    @Override
    public void onClose() {
        System.out.println("Lambayi kapatmaya calisiyorsunuz fakat zaten kapali..");
    }
}

class Context {
    private LampState lampState;

    public Context(){
        setLampState(new LampClosedState());
    }

    public void onOpen(){
        lampState.onOpen();
        if(lampState instanceof LampClosedState){
            setLampState(new LampOpenState());
            System.out.println("Lambanin icsel durumu su oldu : " + lampState.getClass().getName());
        }
    }

    public void onClose() {
        lampState.onClose();
        if(lampState instanceof LampOpenState){
            setLampState(new LampOpenState());
            System.out.println("Lambanin icsel durumu su oldu : " + lampState.getClass().getName());
        }
    }

    public LampState getLampState() {
        return lampState;
    }

    public void setLampState(LampState lampState){
        this.lampState = lampState;
    }
}

public class State {
    public static void main(String[] args) {
        Context context=new Context();
        System.out.println("Lambanin baslangic durumu : " + context.getLampState().getClass().getName());
        context.onClose();
        context.onOpen();
        System.out.println("***************************");

        System.out.println("Lambanin suanki durumu : " + context.getLampState().getClass().getName());
        context.onOpen();
        context.onClose();
        System.out.println("Lambanin son durumu : " + context.getLampState().getClass().getName());
    }
}
