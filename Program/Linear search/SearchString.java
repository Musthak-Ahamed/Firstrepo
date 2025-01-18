public class SearchString{
  public static void main(String[] args){
    String name = "musthak";
    char target = 's';
    boolean ans = search(name,target);
    if(ans == true){
      System.out.println(target + "is present");
    }
    else{
      System.out.println(target + "is not present");
    }
  }
  static boolean search(String name,char target){
   if(name.length() == 0){ 
     return false;
   }

    for(int i=0;i<name.length;i++){
       if(target == name.charAt(i)){ 
         return true;
       }
}
    return false;
}


}
