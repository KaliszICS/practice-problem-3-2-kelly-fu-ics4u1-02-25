public class PracticeProblem {

	
 public static int towerOfHanoi(int num){

  if (num<3){
   return -1;
  }
  if (num==3){
   return 7;
  }
  else{
   
   return 2 * towerOfHanoi(num - 1) +1;
   
  }
 }
	
}


