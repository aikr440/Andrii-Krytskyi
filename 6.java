public class Test6 {
    public static void main(String[] args) {
        int n=9;
        System.out.println("Enter n: "+n);
        int a=0, b=1;
        System.out.print("Fibonachi numbers: "+a+" "+b);
        int c;
        for(int i=1; i<=n; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}