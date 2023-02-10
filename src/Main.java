public class Main {
    public static void main(String[] args) {
        // get Singleton instance
        Singleton singleton = Singleton.getInstance();
        // create another singleton instance
        Singleton singleton2 = Singleton.getInstance();
        // and another
        Singleton singleton3 = Singleton.getInstance();
        // and one more
        Singleton singleton4 = Singleton.getInstance();
    }
}