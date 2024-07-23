public class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        length=0;
        breadth=0;
    }
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void Area(){
        System.out.println("Area Of "+getClass().getName()+" Is "+length*breadth);
    }
    public void Parameter(){
        System.out.println("Area Of "+getClass().getName()+" Is "+2*(length+breadth));
    }
}
