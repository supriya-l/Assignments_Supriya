class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle5";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line5";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube5";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
 class Assignment2Q5{
    public static void main(String[] args) {
    	Shape5 r= new Rectangle5 ();
    	Shape5 l= new Line5 ();
    	Shape5 c= new Cube5 ();
    	System.out.println(c.draw());
    	System.out.println(l.draw());
    	System.out.println(r.draw());
    }
}