package generics;

public class DuoAppLegacy 
{ public static void main(String[] args)
  {
    DuoLegacy od5 = new DuoLegacy("Hello","Non Generic World");
    DuoUtilityLegacy.printDuo(od5);
	
	Duo<String> od = new Duo<String>("Hallo","Generieke Wereld");	
//	DuoUtilityLegacy.printDuo(od);
//src\generics\DuoAppLegacy.java:10: printDuo(generics.DuoLegacy) in generics.DuoUtilityLegacy 
//cannot be applied to (generics.Duo<java.lang.String>)
//        DuoUtilityLegacy.printDuo(od);
//                        ^
//1 error

	DuoUtilityLegacy.printDuo(new DuoLegacy(od.getFirst(), od.getSecond() ) );
  }
}
