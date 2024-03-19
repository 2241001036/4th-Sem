import java.time.LocalDate;

public class Magazine extends LibraryResource
{
    private LocalDate IssueDate;
    Magazine(String Title, String Author, LocalDate IssueDate)
    {
        super(Title, Author);
        this.IssueDate = IssueDate;
    }

    public LocalDate getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        IssueDate = issueDate;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("------MAGAZINE------");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("IssueDate: " + getIssueDate());
    }
}
