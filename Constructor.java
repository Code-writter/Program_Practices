class Example{
    int num;

    Example(){
        num = 10;
    }
}

public class Constructor {

    public static void main(String[] args) {

        Example e = new Example();

        System.out.println(e.num);
    }
}