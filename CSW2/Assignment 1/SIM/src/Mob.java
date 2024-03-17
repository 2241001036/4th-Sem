public class Mob
{
    private String MobName;
    private String SIMName;
    private String SIMNo;

    public Mob(String MobName, String SIMName, String SIMNo)
    {
        this.MobName = MobName;
        this.SIMName = SIMName;
        this.SIMNo = SIMNo;
    }
    public String getMobileName()
    {
        return MobName;
    }
    public void setMobName(String MobName)
    {
        this.MobName = MobName;
    }
    public String getSIMName()
    {
        return SIMName;
    }

    public void setSIMName(String SIMName)
    {
        this.SIMName = SIMName;
    }
    public String getSIMNo()
    {
        return SIMNo;
    }
    public void setSIMNo(String SIMNo)
    {
        this.SIMNo = SIMNo;
    }
    public void displaySimDetails()
    {
        System.out.println("SIM Name: "+ SIMName);
        System.out.println("SIM Number: "+ SIMNo);
    }
    public void didplayMobileDetails()
    {
        System.out.println("Mobile Name: "+ MobName);
        displaySimDetails();
    }
}
