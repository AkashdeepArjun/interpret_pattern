package home;
public class IntToBinary implements Expression {
    private int num;
    public IntToBinary(int num){this.num=num;}

    @Override
    public String interpret(InterpreterContext c) {
       
        return c.getBinaryFormat(this.num);
    }
}
