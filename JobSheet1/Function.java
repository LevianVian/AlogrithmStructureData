public class Function {
    public static void main(String[] args) {int[][] stock = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        int[] prices = {75000, 50000, 60000, 10000};

        printBranchIncome(stock, prices);
    }


    static void printBranchIncome(int[][] stockArray, int[] priceArray) {
        System.out.println("-----------------------------------------");
        System.out.println("   INCOME RECAP - ROYAL GARDEN");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < stockArray.length; i++) {
            
            int totalIncome = 0;
            
            for (int j = 0; j < stockArray[i].length; j++) {
                totalIncome += (stockArray[i][j] * priceArray[j]);
            }

            System.out.println("Branch RoyalGarden " + (i + 1));
            System.out.println("Total Income: Rp " + totalIncome);

            if (totalIncome > 1500000) {
                System.out.println("Status: Very Good");
            } else {
                System.out.println("Status: Need Evaluation");
            }
            
            System.out.println("-----------------------------------------");
        }
    }
}