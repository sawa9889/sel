package output;

public class mainOutput {
    private static Output out;
    public static void main(String[] args) {
        out=new Output();
    }

    public static Output getOut() {
        return out;
    }
}
