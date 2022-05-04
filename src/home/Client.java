package home;

public class Client {

    public InterpreterContext ic;

    public Client(InterpreterContext ic){
        this.ic=ic;
    }
    public String interpret(String c){
        Expression exp=null;

        if(c.contains("Hex")){exp = new IntToHex(Integer.parseInt(c.substring(0, c.indexOf(" ")))); }
        else if(c.contains("Binary")){exp=new IntToBinary(Integer.parseInt(c.substring(0,c.indexOf(" "))));}
        else {return c;}
        return exp.interpret(this.ic);
    }
    public static void main(String[] args){
        String str1="28 in Binary";
        String str2="28 in Hex";

        Client client= new Client(new InterpreterContext());
        MyUtils.log("BINARY FORMAT",client.interpret(str1));
        MyUtils.log("HEXA  FORMAT",client.interpret(str2));



    }
    
    
}
