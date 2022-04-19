public class Solution {
    public int threeSumClosest(int[] A, int B) {
Arrays.sort(A);
int res= 100000000;
for(int i=0;i<A.length;i++){
int left=i+1;
int j=A.length-1;
while(j>left){

    if(Math.abs( A[i]+A[left]+A[j] - B ) < Math.abs(res-B)){
res=A[i]+A[left]+A[j];
}
    if( (A[i]+A[left]+A[j]) > B){
        j--;
    }
   else if( (A[i]+A[left]+A[j]) < B){
        left++;
    }
   else if( (A[i]+A[left]+A[j])==B) {
    return B;
    }
}



}
return res;
    }
}
