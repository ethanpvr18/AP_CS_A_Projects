public class Die
{
    private int side;
    private int numOfSides;
    private int weight1;
    private int weight2;
    
    public Die()
    {
        numOfSides = 6;        
        roll();
    }
    
    public Die(int Sides)
    {
        numOfSides = Sides;
        roll();
    }
    
    public Die(int Sides, int die1Weight, int die2Weight)
    {
        numOfSides = Sides;
        weight1 = die1Weight;
        weight2 = die2Weight;
        roll();
    }
    
    public int roll()
    {
        side = (int)(Math.random()*numOfSides)+1;
        return side;
    }
    
    public int getValue()
    {
        return side;
    }
    
    public String toString(){
        String sideRolled = "You rolled a: " + side + "!";
        return sideRolled;
    }
}
