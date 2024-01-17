public class THIS {
    int x,y;
    void initial(int x,int y){
        this.x=x;
        this.y=y;
    }
    void dis(){
        if (x>y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is greater than x");
        }
    }
    public static void main(String arg[]){
        THIS a=new THIS();
        a.initial(2,5);
        a.dis();
    }
    
}
