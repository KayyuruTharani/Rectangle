class Rectangle{
    double length;
    double breadth;
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    double calculateArea(){
        return length * breadth;
    }
    double calculateCircumference(){
        return 2*(length + breadth);

    }
}
class Main{
    public static void main(String args[]){
        Rectangle rectangle5x6=new Rectangle(5,6);
        Rectangle rectangle7x9=new Rectangle(7,9);
        System.out.println("Area1 is "+rectangle5x6.calculateArea());
        System.out.println("Circumference1 is"+rectangle5x6.calculateCircumference());
        System.out.println("Area2 is "+rectangle7x9.calculateArea());
        System.out.println("Circumference2 is "+rectangle7x9.calculateCircumference());


    }
}