public class Pound {
    private int pound;
    Pound(){
        pound=0;
    }
    Pound(int x){
        pound=x;
    }
    public void setPound(int x){
        pound=x;
    }
    public int getPound(){
        return pound;
    }
    public int toRupees(){
        return getPound()*100;
    }
}