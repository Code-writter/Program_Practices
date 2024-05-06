class Global{
    int x  =  10;

    void show(){
        System.out.println(x);
    }
    
    void local(){
        int y = 7;

        System.out.println(y);
    }
}