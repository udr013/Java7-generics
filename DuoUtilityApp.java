package generics;

public class DuoUtilityApp 
{ public static void main(String[] args)
  { Duo<Integer> id = new Duo<Integer>(7,5);
	Duo<Long>    ld = new Duo<Long>   (746987L,546358L);
	Duo<Float>   fd = new Duo<Float>  (5.7F,8.9F);
	DuoUtility.printSum(id);
	DuoUtility.printSum(ld);
	DuoUtility.printSum(fd);
	
	Duo<String> d1 = new Duo<String>("Hello", "World");
	Duo<String> d2 = new Duo<String>("Goodbye", "Mars");
	DuoUtility.swapFirst(d1, d2);
	DuoUtility.printDuo(d1);
	DuoUtility.printDuo(d2);
	
	Duo<Number>  nd1 = new Duo<Number>(3.2, 5);
	Duo<Number>  nd2 = new Duo<Number>(6, 4.1);
	DuoUtility.printSum(nd1, nd2);
	DuoUtility.printSum(nd1, fd);
	DuoUtility.printSum(id, ld);
	
	DuoUtility.printSumSame(nd1, nd2);
	DuoUtility.printSumSame(fd, fd);
//	DuoUtility.printSumSame(nd1, fd); //fout
//	DuoUtility.printSumSame(id, ld);  //fout

	DuoUtility.printSumMixed(nd1, nd2, id, id);
	DuoUtility.printSumMixed(fd, fd, ld, ld);



  }
}
