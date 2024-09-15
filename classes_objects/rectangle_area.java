public class rectangle_area {
    int length , breadth ;
    rectangle_area(){
        length = 10;
        breadth = 20;
    }
    rectangle_area(int x,int y){
        length = x;
        breadth = y;
    }
    int area(){
        return length * breadth;
    }
}
