class Data{
    private String Name = "Hii";
}


public class main{
    public static void main(String[] args) {
        Data d = new Data();

        // Public class cannot be accessed outside of class
        System.out.println(d.Name);
    }
}