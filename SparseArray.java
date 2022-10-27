package sparse;

public class SparseArray {
    public static void main(String[] args) {
        int sum = 0;//记录有效数字的个数
        int[][] a = new int[11][11];
        // 1代表黑子 2代表白子
        a[1][2] = 1;
        a[2][3] = 2;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != 0) {
                    sum++;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //新建稀疏数组
        int[][] sparse = new int[sum + 1][3];
        sparse[0][0] = 11;
        sparse[0][1] = 11;
        sparse[0][2] = sum;
        System.out.println("二维数组转化为稀疏数组");
        int cnt = 0;//第n个有效数据
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != 0) {
                    cnt++;
                    sparse[cnt][0] = i;
                    sparse[cnt][1] = j;
                    sparse[cnt][2] = a[i][j];
                }
            }
        }
        for (int i = 0; i < sparse.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparse[i][0], sparse[i][1], sparse[i][2]);
        }
        int[][] a2 = new int[sparse[0][0]][sparse[0][1]];
        for (int i = 1; i < sparse.length; i++) {
            a2[sparse[i][0]][sparse[i][1]] = sparse[i][2];
        }
        System.out.println("稀疏数组还原二维数组");
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                System.out.print(a2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
