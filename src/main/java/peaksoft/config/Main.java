package peaksoft.config;

public class Main {
    public static void main(String[] args) {
        double res = test();
        if(res != -1.0)
            System.out.println(res);

        double res2 = test();
           if(res != -1.0)
            System.out.println(res2);
    }
    public static double test(){
        double random = Math.random();
        return random > 0.5 ? random : -1.0;
    }
}
