class Room {
    double length , breadth , height , volume;
    Room(){
        length = 14;
        breadth = 12;
        height = 10;
    }

    double volComp(){
        volume = length*breadth*height;
        return volume;
    }
    public static void main(String[] args) {
        Room r1 = new Room();
        Room r2 = new Room();

        System.out.println("The volume of the room is "+r1.volComp());
        System.out.println("The volume of the room is "+r2.volComp());
    }
}
