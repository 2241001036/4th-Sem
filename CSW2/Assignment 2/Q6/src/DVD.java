public class DVD extends LibraryResource
{
    int Duration;
    DVD(String Title, String Author, int Duration)
    {
        super(Title, Author);
        this.Duration = Duration;
    }
    public int getDuration() {
        return Duration;
    }
    public void setDuration(int duration) {
        Duration = duration;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("------DVD------");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: " + getDuration());
    }
}
