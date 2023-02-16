package Polymorphism;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }
    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}
class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    @Override
    public String plot(){
        return "Imperial Forces try to take over the universe";
    }
}
class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }
    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    //No plot methods
}
public class Main {
    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("MOvie #"+i+" : "+ movie.getName()+"\n"+
                                "Plot: "+ movie.plot()+ "\n");
        }
        
    }
    public static Movie randomMovie(){
        int randomMovie = (int) (Math.random()*5)+1;
        System.out.println("Random number generated was: "+ randomMovie);
        switch (randomMovie){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
