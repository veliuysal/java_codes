package oop.interfaces;

interface MarkerInterface{

    void markerMethod();
}
interface MarkerInterface2 {

}

abstract class  NoBody{

}

abstract class NoBody2 extends NoBody implements MarkerInterface{

}

public class AbstractClassAndInterface extends NoBody2 implements MarkerInterface2 {
    @Override
    public void markerMethod() {

    }
}
