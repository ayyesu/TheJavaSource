package src.sandbox.objecttype;

public class Addition implements Operation {
    @Override
    public float execute(int a, int b){
        return a+b;
    }
}
