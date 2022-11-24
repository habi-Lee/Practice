package TankGame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//记录数据
public class Recorder {
    private static int allEnemyTankNum = 0;
    private static FileWriter fw = null;
    private static BufferedWriter bw = null;
    private static String recordFile = "e\\java code\\myRecord.txt";

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static void addNum() {
        Recorder.allEnemyTankNum++;
    }

    public static void keep() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(recordFile));
        bw.write(Recorder.getAllEnemyTankNum());
        if (bw != null) {
            bw.close();
        }
    }


}
