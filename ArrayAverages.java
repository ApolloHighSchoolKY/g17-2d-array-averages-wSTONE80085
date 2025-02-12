import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int avg = 0;
    int sum = 0;
    for(int row = 0; row<ray.length; row++)
    {
      avg = 0;
      sum = 0;
      for(int col = 0; col<ray[row].length; col++)
        {
          sum += ray[row][col];
          avg++;
        }
          avg = sum/avg;
    }
    System.out.println("The average of the row " + row + " is: " + avg);
  }

  public void columnAverages(){
    int avg = 0;
    int sum = 0;
    for(int col = 0; col<ray[0].length; col++)
    {
      avg = 0;
      sum = 0;
      for(int row = 0; row<ray.length; row++)
        {
          sum += ray[row][col];
          avg++;
        }
          avg = sum/avg;
    }
    System.out.println("The average of the column " +  col + " is: " + avg);
  }

  public void arrayAverage(){
    int avg = 0;
    int sum = 0;
    for(int col =0; col<ray[0].length; col++)
      {
        for(int row=0; row<ray.length; row++)
          {
            sum+= ray[row][col];
            avg++;
          }
      }
            avg=sum/avg;
        System.out.println("the average of the entire array is: " + avg);
  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return "";
  }
}
