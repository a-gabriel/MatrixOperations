public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		double[][] productMatrix = new double [matrix1.length][matrix2[0].length];
		
		if (matrix1[0].length != matrix2.length){
			System.out.println("Matrices are not compatible to compute dot product.");
			return null;
		}
		else{
			for (int r = 0; r < matrix1.length; r++){
		           for (int j = 0; j < matrix2[0].length; j++) {
		               for (int k = 0; k < matrix1[0].length; k++) {
		                   productMatrix[r][j] += matrix1[r][k] * matrix2[k][j];
		                   
					}
				}
			continue;}
		}
		return productMatrix;}
}