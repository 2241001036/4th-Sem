public class bankacc
{
    String name;
    int acc_no;
    String acc_type;
    int bal;
    void getvalue(String name, int acc_no, String acc_type, int bal)
    {
        this.name = name;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.bal = bal;
    }
    public String name(){
        return name;
    }
    public int acc_no(){
        return acc_no;
    }
    public String acc_type(){
        return acc_type;
    }
    public int bal(){
        return bal;
    }
}
