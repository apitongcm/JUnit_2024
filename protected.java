class Player {
    protected String name = "Carl is awesome";

    public void newMsg()
    {
        System.out.println("This is Carl's message!");
    }
}


class NewPlayer extends Player
{
    private String playerName = "Marwin wa sugoi desu";

    public static void main(String[] args)
    {
        NewPlayer newSkilledPlayer = new NewPlayer();
        newSkilledPlayer.newMsg();
        System.out.println(newSkilledPlayer.name + " " +  newSkilledPlayer.playerName);
    }
}