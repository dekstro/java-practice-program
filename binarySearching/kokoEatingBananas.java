package binarySearching;

public class kokoEatingBananas {
    public static int TotalHours(int[] piles, int hours){
        int totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=Math.ceil((double)piles[i]/(double)hours);
        }
        return totalhours;
    }
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1, high=max;
        while(low<=high){
            int mid=(high-low)/2+low;
            int hours= TotalHours(piles, mid);
            if(hours<=h) high =mid-1;
            else low=mid+1;
        }
        System.out.println(low);
    }
}
