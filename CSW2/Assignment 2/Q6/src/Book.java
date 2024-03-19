public class Book extends LibraryResource
{
    int PageCount;
    Book(String Title, String Author, int PageCount)
    {
        super(Title, Author);
        this.PageCount = PageCount;
    }
    public int getPageCount() {
        return PageCount;
    }
    public void setPageCount(int pageCount) {
        PageCount = pageCount;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("------BOOK------");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Page Count: " + getPageCount());
    }
}
