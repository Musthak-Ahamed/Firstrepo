public class PalindromeNum{
  public static void main(String[] args){
    int temp,rem,sum;
    int num = 454;
    temp = num;
    sum = 0;
    while(temp>0){
      rem = temp%10;
      sum = (sum*10)+rem;
      temp = temp/10;
    }
    if(num == sum){
      System.out.println("palindrome Number");
  }else{
      System.out.println("Not palindrome Number");
    }
}
}
