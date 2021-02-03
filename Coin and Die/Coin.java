public class Coin
{
    private int faceNum;
    private String faceString;

    public Coin()
    {
        flip();
    }

    public String flip()
    {
        faceNum = (int)(Math.random()*2)+0;

        if(faceNum == 0){
            faceString = "heads";
        } else if(faceNum == 1) {
            faceString = "tails";
        }
        return faceString;
    }

    public String toString(){
        String faceUp = "You got: " + faceString + "!";
        return faceUp;
    }
}