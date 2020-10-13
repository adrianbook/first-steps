public class HelloGit {
    public static int fak(int x) {
            int result;
            if (x==1) {
                return 1;
            }
            result = fak(x-1)*x;
            return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello Git! "+fak(4));
    }
}