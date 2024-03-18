import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class ArrayListUser
{
    private ArrayList<User> users;
    public ArrayListUser()
    {
        this.users = new ArrayList<>();
    }
    public void addUser(User user)
    {
        users.add(user);
    }
    public void printUsers()
    {
        System.out.println("Users:");
        for (User user : users)
        {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public void sortByAge()
    {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }
}
