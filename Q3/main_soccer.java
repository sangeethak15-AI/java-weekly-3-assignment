public class main_soccer {
    public static void main(String[] args)
    {
        sports obj;
        obj=new sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
        obj=new soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}
