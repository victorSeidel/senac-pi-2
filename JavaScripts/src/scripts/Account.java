package scripts;

public class Account
{
    private int userId;
    private int gameId;
    private int coins;

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId) 
    {
        this.userId = userId;
    }

    public int getGameId() 
    {
        return gameId;
    }

    public void setGameId(int gameId)
    {
        this.gameId = gameId;
    }

    public int getCoins() 
    {
        return coins;
    }

    public void getCoins(int coins) 
    {
        this.coins += coins;
    }
    
    public void loseCoins(int coins) 
    {
        this.coins -= coins;
    }
}
