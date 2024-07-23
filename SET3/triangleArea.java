public class triangleArea {
    private double area;
    triangleArea(){
        area=42;
    }
    triangleArea(int r){
        area=Math.PI*r*r;
    }
    triangleArea(double l,double b){
        area=0.5*l*b;
    }
    public double getArea(){
        return area;
    }
}
