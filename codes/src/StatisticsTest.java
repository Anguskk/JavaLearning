import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class StatisticsTest {
    public  static void statisticsTest(){
        int i;
    }



    public  static  void main(String[] args){
        StdRandom.setSeed(10);
        ArrayList<Double> listd = new ArrayList<>(100);
        for (int i=0;i<100;i++) {
            listd.add(StdRandom.uniform(0.0,1.0));
        }
        double[] arryDouble=new double[100];
        for (int i=0;i<100;i++){
            arryDouble[i]= listd.get(i);
            StdOut.println(arryDouble.hashCode());
        }

        StdStats.plotBars(arryDouble);
        StdRandom.shuffle(arryDouble);
        StdStats.plotBars(arryDouble);
        try{
            FileWriter fw = new FileWriter("data.txt",true);
            fw.write(valueOf(listd));
            fw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
