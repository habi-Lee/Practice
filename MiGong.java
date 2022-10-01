public class MiGong {
	public static void main(String[] agrs){
		//1代表障碍物
		int[][] map = new int[8][7];
		for (int i = 0;i<7 ;i++ ) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for(int i = 0;i<7;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[2][3] = 1;
		map[3][2] = 1;
		map[1][2] = 1;
		map[5][1] = 1;
  		A a = new A();
  		a.findway(map,1,1);
		for(int i=0;i<8;i++){
			for(int j=0;j<7;j++){
				System.out.print(map[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
class A{
//策略 下 右 上 左
public boolean findway(int[][] map,int i,int j){
	if(map[6][5]==2){
		return true;
	}
	else{
		if(map[i][j]==0){
			map[i][j]=2;
			if (findway(map,i+1,j)) {
				return true;
			}
			else if(findway(map,i,j+1)){
				return true;
			}
			else if(findway(map,i-1,j)){
				return true;
			}
			else if(findway(map,i,j-1)){
				return true;
			}
			else{
				map[i][j] = 3;
				return false;
				}
			}
			else{
				return false;
				}
		}
	}
}