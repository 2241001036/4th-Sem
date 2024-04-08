import java.util.Iterator;
import java.util.TreeMap;
class Address
{
    private String plotNo;
    private String at;
    private String post;
    public Address(String plotNo, String at, String post)
    {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    @Override
    public String toString() {
        return "Plot No: " + plotNo + ", At: " + at + ", Post: " + post;
    }
}
