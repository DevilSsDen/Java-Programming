package inheritance;

abstract class abstractclass {

    String name;
    String species;

    abstractclass(String n, String s){
        name = n;
        species = s;
    }
    void eat(String fooditem){
        System.out.println(species + " "+name + "likes to have"+fooditem);
    }
    abstract void sound();

    
}
