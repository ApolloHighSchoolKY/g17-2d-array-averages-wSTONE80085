public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];


     ArrayAverages twoDee = new ArrayAverages(ray);

     System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
