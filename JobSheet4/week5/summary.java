package week5;

public class summary {
    public double profits[];

    public summary(int element){
        profits = new double[element];
    }

    public double totalBrute(){
        double total = 0;
        for (int i = 0; i < profits.length; i++){
            total = total + profits[i];
        }
        return total;
    }

    public double totalConquer(double arr[], int left, int right){
        if (left == right){
            return arr[left];
        } else {
            int mid = (left + right) / 2;
            double sumLeft = totalConquer(arr, left, mid);
            double sumRight = totalConquer(arr, mid + 1, right);
            return sumLeft + sumRight;
        }
    }
}
