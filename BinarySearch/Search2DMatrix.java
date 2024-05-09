package BinarySearch;

//Intuition behind the problem - The intuition behind the problem is binary search we find the mid(matrix[mid/n][mid%n]) element of the matrix and check if it matches with the target
// if it does return true otherwise move the row to mid+1 or col to mid.

class Solution1{
    public boolean Search2DMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = m*n;
        while(row<col){
            int mid = (row+col)/2;
            if(matrix[mid/n][mid%n] == target){
                return true;
            } else if (matrix[mid/n][mid%n] < target) {
                row = mid+1;
            }
            else {
                col = mid;
            }
        }
        return false;
    }

}
class matrix{
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.Search2DMatrix( new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 7));
    }
}