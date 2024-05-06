class Data{
    protected String Name = "Byeee";
}

public class main {

    public static void main(String[] args) {
        Data d = new Data();

        // Protected class cannot be accesed outside of class
        System.out.println(d.Name);
    }
    
}