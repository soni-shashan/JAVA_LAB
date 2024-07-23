interface P1 {
    int constant1=1;
    void methodP1();
}
interface P2 {
    int constant2=1;
    void methodP2();
    
}
interface P12 extends P1,P2 {
    void methodP12();

}

public class Q implements P12 {
    @Override
    public void methodP1(){
        System.out.println("methodP1 -> CONSTANT 1 : "+constant1);
    }
    @Override
    public void methodP2(){
        System.out.println("methodP2 -> CONSTANT 2 : "+constant2);
    }
    @Override
    public void methodP12(){
        System.out.println("methodP12 -> (CONSTANT 1 + CONSTANT 2) : "+(constant1+constant2));
    }
}

