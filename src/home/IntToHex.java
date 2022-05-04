package home;

public class IntToHex implements Expression{
    private int num;
    public IntToHex(int num){this.num=num;}
    @Override
    public String interpret(InterpreterContext c) {
    
        return c.getHexaFormat(this.num);
    }
}
