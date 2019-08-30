package p09_facade;

public class Facade {
    public void call(String phoneNumber){
        Communication communication = new Communication();
        communication.start();
        communication.connect(phoneNumber);
        communication.deJam();
        communication.end();
    }
}
