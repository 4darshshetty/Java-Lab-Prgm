import java.util.Scanner; 
class MyPoint { 
private int x, y; 
MyPoint() { 
this.x = 0; 
this.y = 0; 
} 
MyPoint(int x, int y) { 
this.x = x; 
this.y = y; 
} 
void setXY() { 
Scanner s = new Scanner(System.in); 
x = s.nextInt(); 
y = s.nextInt(); 
} 
int[] getXY() { 
int[] coordinates={x,y}; 
return coordinates; 
} 
public String toString() { 
return "(" + x + "," + y + ")"; 
} 
double distance(int x, int y) { 
int diffx=this.x-x; 
int diffy=this.y-y; 
return(Math.sqrt(diffx*diffx+diffy*diffy)); 
}
double distance(MyPoint another) { 
return distance(another.x, another.y);   
} 
double distance() { 
return distance(0,0);   
} 
} 
class Program4 { 
public static void main(String[] args) { 
MyPoint point1 = new MyPoint(); 
MyPoint point2 = new MyPoint(1, 2); 
System.out.print("Enter the coordinates for point1 :"); 
point1.setXY(); 
System.out.println("Point1: "+point1.toString()); 
System.out.println("Point2: "+point2.getXY()[0]+","+point2.getXY()[1]); 
System.out.println("Distance between point1 and point2 is:"+point1.distance(point2)); 
System.out.println("Distance between point1 and Origin(0,0) is:"+point1.distance()); 
} 
} 
