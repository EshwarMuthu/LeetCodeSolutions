
public class RotateImage {
	public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n-1;i++){
            int depth=i;
            for(int j=i;j<n;j++){
                if(i==j) continue;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[depth+1][i];
                matrix[depth+1][i]=temp;
                depth++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
	public static void main(String[] args) {
		int[][] matrix=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
