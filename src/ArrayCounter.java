public class ArrayCounter {
    int[] arr;
    public ArrayCounter(int... nums){
        arr=nums;
    }
    public int getMax(){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>max)max=arr[i];
        }
        return max;
    }
    public int[] arrCounter() {
        int []counter=new int[getMax()+1];
        for (int num:arr){
            counter[num]++;
        }
        return counter;
    }
}
