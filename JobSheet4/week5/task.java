package week5;

public class task {
    public double findMaxConquer(student[] arr, int l, int r){
        if (l == r){
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        double maxl = findMaxConquer(arr, l, mid);
        double maxr = findMaxConquer(arr, mid + 1, r);
        return Math.max(maxl, maxr);
    }

    public double findMinConquer(student[] arr, int l, int r){
        if (l == r){
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        double minl = findMinConquer(arr, l, mid);
        double minr = findMinConquer(arr, mid + 1, r);
        return Math.min(minl, minr);
    }

    public double AvgBrute(student[] arr){
        double total = 0;
        for (student s : arr){
            total += s.uas;
        }
        return total / arr.length;
    }
}