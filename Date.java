/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;

    
    public int compareTo( Object otherObj) {
        Date other = ( Date) otherObj;

        if( other.y < y) return 1;
        else if (other.y > y) return -1;
	
        else if (other.m < m) return 1;
        else if (other.m > m) return -1;
	
        else if (other.d < d) return 1;
        else if (other.d > d) return -1;
	
        else return 0;
    }
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}
