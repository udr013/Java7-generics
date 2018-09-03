package generics;

public class DuoUtilityX
{
	public static void printUpper(Duo<String> d)
	{ System.out.println(d.getFirst().toUpperCase() + "," + 
		                       d.getSecond().toUpperCase());
	}

    public static void printDuo(Duo<?> d) 
    { System.out.println(d.getFirst() +"," +d.getSecond());
    }  
   
	public static void printSum(Duo<? extends Number> d) 
	{ Number n1 = d.getFirst();
	  Number n2 = d.getSecond();
	  System.out.println(n1 + "+" + n2 + "=" + (n1.doubleValue()+n2.doubleValue()));
	}
	
	public static void printSum(Duo<? extends Number> d1, Duo<? extends Number> d2) 
	{ Number n1 = d1.getFirst();
	  Number n2 = d1.getSecond();
	  Number n3 = d2.getFirst();
	  Number n4 = d2.getSecond();
	  System.out.print("Som " + n1 +classShortName(n1)
					  + " + " + n2 +classShortName(n2)
					  + " + " + n3 +classShortName(n3)
					  + " + " + n4 +classShortName(n4) 					   
					  + " = ");
	  System.out.println(n1.doubleValue()+n2.doubleValue()+
						 n3.doubleValue()+n4.doubleValue());
	}
	
	public static <T extends Number> void printSumSame(Duo<T> d1, Duo<T> d2) 
	{ Number n1 = d1.getFirst();
	  Number n2 = d1.getSecond();
	  Number n3 = d2.getFirst();
	  Number n4 = d2.getSecond();
	  System.out.print("Som (" +classShortName(n1)+") "+n1 + "+" +n2 + "+" + n3 + "+" +n4+ " = ");
	  System.out.println(n1.doubleValue()+n2.doubleValue()+
		  			     n3.doubleValue()+n4.doubleValue());
	}
	
	public static <T1 extends Number, T2 extends Number> 
				void printSumMixed(Duo<T1> d1, Duo<T1> d2, Duo<T2> d3, Duo<T2> d4)
	{ Number n1 = d1.getFirst();
	  Number n2 = d1.getSecond();
	  Number n3 = d2.getFirst();
	  Number n4 = d2.getSecond();
	  Number n5 = d3.getFirst();
	  Number n6 = d3.getSecond();
	  Number n7 = d4.getFirst();
	  Number n8 = d4.getSecond();
	  System.out.print("Som " + n1 +classShortName(n1)
					  + " + " + n2 +classShortName(n2)
					  + " + " + n3 +classShortName(n3)
					  + " + " + n4 +classShortName(n4)
					  + " + " + n5 +classShortName(n5)		
					  + " + " + n6 +classShortName(n6)		
					  + " + " + n7 +classShortName(n7)
					  + " + " + n8 +classShortName(n8)						  
					  + " = ");
	  System.out.println(n1.doubleValue() + n2.doubleValue() + n3.doubleValue() 
					   + n4.doubleValue() + n5.doubleValue() + n6.doubleValue()
					   + n7.doubleValue() + n8.doubleValue());
	}

	public static <T> void swapFirst(Duo<T> d1, Duo<T> d2) 
	{ T temp = d1.getFirst();
	  d1.setFirst(d2.getFirst());
	  d2.setFirst(temp);
	}
	
	public static String classShortName(Object o)
	{	// returns the class (without the package if any
		String FQClassName = o.getClass().getName();
		int firstChar;
		firstChar = FQClassName.lastIndexOf ('.') + 1;
		if ( firstChar > 0 ) {
		FQClassName = FQClassName.substring ( firstChar );
		}
		return FQClassName.substring(0,1).toLowerCase();
	}

}