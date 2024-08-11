package sem5.Game;

public class Player {
    private String Name;
    private boolean Move;
    private int Marker;

    public Player(String name, boolean move, int marker){
        this.Name = name;
        this.Move = move;
        this.Marker = marker;
    }

    public String getName(){
        return this.Name;
    }

    public boolean getMove(){
        return this.Move;
    }

    public int getMarket(){
        return this.Marker;
    }
}
