public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayCounter arr=new ArrayCounter(1,2,3,3,4,5,6,2);
        int[] counter= arr.arrCounter();
        System.out.println(readCounter(counter));
    }

    public static String readCounter(int[] counter) {
        String result="";
        for (int i = 0; i < counter.length; i++) {
            result+="num "+i+" called "+counter[i]+" time(s)"+"\n";
        }
        return result;
    }
}