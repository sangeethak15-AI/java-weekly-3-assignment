public abstract class books{
    String title;
    public abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends books
{
    @Override
    public void setTitle(String s) {
        this.title=s;
    }
}
