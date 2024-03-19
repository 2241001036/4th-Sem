abstract class LibraryResource
{
    private String Title;
    private String Author;
    LibraryResource(String Title, String Author)
    {
        this.Title = Title;
        this.Author = Author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public abstract void displayDetails();
}
