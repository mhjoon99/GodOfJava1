public class ArrayTwoDimension {
    public static void main(String[] args) {
        ArrayTwoDimension array = new ArrayTwoDimension();
        array.twoDimensionArray();
        array.twoDimFor();
    }
    
    public void twoDimensionArray() {
        int [][]twoDim = new int[2][3];
    }
    
    public void twoDimFor() {
        int [][]twoDim = {{1,2,3,}, {4,5,6}};
        int oneCounter=0;
        for (int[] dimArray:twoDim) {
            int twoCounter=0;
            for(int data:dimArray) {
                System.out.println(data);
                twoCounter++;
            }
            oneCounter++;
        }
    }
}
