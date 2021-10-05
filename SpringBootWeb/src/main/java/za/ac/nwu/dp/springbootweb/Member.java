package za.ac.nwu.dp.springbootweb;

public class Member
{
    private String username;
    private String userID;
    private String name;
    private String surname;
    private int userPoints;

    public Member(String joy, String s)
    {

    }

    public Member(String username,String userID,String name,String surname, int userPoints){
        this.username = username;
        this.userID = userID;
        this.name = name;
        this.surname = surname;
        this.userPoints = userPoints;

}
    public String getUsername(){
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUserID(){
        return userID;
    }

    public void setUserID(String userID)
    {
        this.userID = userID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.username = username;
    }

    public int getUserPoints()
    {
        return userPoints;
    }

    public void setUserPoints(int userPoints)
    {
        this.userPoints = userPoints;
    }

}
