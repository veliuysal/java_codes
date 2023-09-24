package generics;

public class GenericsInheritance<T extends Number> extends SuperGenericsClass<T> {
    private T variable;
    public void setVariable(T variable){
        this.variable = variable;
    }
}

class SuperGenericsClass<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }
}
