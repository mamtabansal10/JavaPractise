
public final class ImmutableObj {
	
	public final int i;
	
	public ImmutableObj(int i) {
		this.i = i;
	}
    
	public int getValue() {
		return i;
	}
	
	public ImmutableObj modify(int i) {
		if (i==this.i) {
			return this;
		}
		else {
		return new ImmutableObj(i);}
		
	}
	
	
}


