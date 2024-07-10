public class Area {
    int length;
    int breadth;
    int area;
    Area(){
        length=0;
        breadth=0;
        area=0;
    }
    Area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        area=length*breadth;
    }
    public int returnArea(){
        return area;
    }
}
