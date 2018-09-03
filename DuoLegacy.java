package generics;

public class DuoLegacy
{ private Object first;
  private Object second;
  
  public DuoLegacy(Object first, Object second) 
  { this.first = first;
	this.second = second;
  }

  public void setFirst(Object first)
  { this.first = first;     }

  public void setSecond(Object second)
  { this.second = second;   }

  public Object getFirst() 
  { return first;           }

  public Object getSecond() 
  { return second;          }

  public void swap() 
  { Object temp = second;
	second = first;
	first = temp;
  }

}
