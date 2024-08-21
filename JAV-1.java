
class kl{
    int x = 10; //not static
    public static void main(String[] args) {
        System.out.println(x);
    }
    static {
        System.out.println(x);
    }
}

class dpoo{
    static void add(int a, double b){
        System.out.println("1");
    }
    static void add(int a, float b){
        System.out.println("2");
    }
    static void add(float a, float b){
        System.out.println("3");
    }

    public static void main(String[] args) {
        int a=10;
        int b = 20;
        add(a,b);
    }
}