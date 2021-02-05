public class Main {

    public static void main(String[] args) {
	int num = 10;
	int result = increment(num);
        System.out.println(result);

        result = decrease(num);
        System.out.println(result);



	    }
	    public static int increment(int n) {
            return ++n;
        }

        public static int decrease(int n) {
            return --n;
        }

}
