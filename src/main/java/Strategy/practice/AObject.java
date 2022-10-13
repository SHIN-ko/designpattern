package Strategy.practice;

public class AObject {

    Ainterface ainterface;

    public AObject() {
        this.ainterface = new AinterfaceImpl();
    }

    public void funcAA() {
        //delegate
        ainterface.funcA();
        ainterface.funcA();
    }
}
