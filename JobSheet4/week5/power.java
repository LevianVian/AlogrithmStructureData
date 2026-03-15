package week5;

public class power {
    public int baseNumber, exponent;

    public power(int n, int e){
        baseNumber = n;
        exponent = e;
    }

    public int powerBrute (int n, int e){
        int result = 1;
        for (int i = 0; i < e; i++){
            result = result * n;
        }
        return result;
    }

    public int powerConquer (int n, int e){
        if (e == 1){
            return n;
        } else {
            if (e % 2 == 1){
                return (powerConquer(n, e / 2) * powerConquer(n, e / 2) * n);
            }
            else {
                return (powerConquer(n, e / 2) * powerConquer(n, e / 2));
            }
        }
    }

}
