package ProblemSet_6c;

public class Palette {
	private P_COLOUR[] primaryColours;
	
	public Palette(P_COLOUR[] colours) {
		if( colours.length <= 3 ) {
			this.primaryColours = new P_COLOUR[3];
			for (int i = 0; i<colours.length; i++) {
				this.primaryColours[i] = colours[i];
			}
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public Palette() {
		this.primaryColours = new P_COLOUR[3];
	}
	
	// Returns number of non-null elements in array
	public int getLength(P_COLOUR[] arr){
	    int count = 0;
	    for(int i = 0; i < arr.length; i++) {
	        if (this.primaryColours[i] != null) {
	            ++count;
	    	}
	    }
	    return count;
	}

	public void addColour(P_COLOUR colour) {
		// Ensure there is space to put colour
		if( getLength(this.primaryColours) < 3 ) {
			boolean red = false;
			boolean blue = false;
			boolean yellow = false;
			
			// Find colours in array
			for (int i = 0; i <= 2; i++) {
				if(this.primaryColours[i] == P_COLOUR.RED) {
					red = true;
				}
				else if(this.primaryColours[i] == P_COLOUR.BLUE) {
					blue = true;
				}
				else if(this.primaryColours[i] == P_COLOUR.YELLOW) {
					yellow = true;
				}
			}
			
			// Insert colour at next available space if its not already there
			for (int i = 0; i <= 2; i++) {
				if(this.primaryColours[i] == null && ((colour == P_COLOUR.RED && !red) || (colour == P_COLOUR.BLUE && !blue) || (colour == P_COLOUR.YELLOW && !yellow))) {		// else if the position is null and the other colours aren't in the array
					this.primaryColours[i] = colour;
					break;
				}
			}
		}
		else {
			// Trying to add colour to a full array
			throw new IllegalArgumentException();
		}
	}
	
	public String getColours() {
		int counter = 0;
		String result = "";
		
		// Using a counter to ensure there is more than one element, add each colour into a string list
		for (int i = 0; i <= 2; i++) {
			if (this.primaryColours[i] != null) {
				result += this.primaryColours[i] + ", ";
				counter++;
			}
		}
		
		if (counter > 0) {
			// Return list without trailing comma
			return result.substring(0, result.length()-2);
		}
		else {
			// Otherwise no colours in list
			return "No colours added";
		}
	}
	
	// Return colour in string format
	public String getColourString(P_COLOUR col) {
		if (col == P_COLOUR.BLUE) {
			return "BLUE";
		}
		else if (col == P_COLOUR.RED) {
			return "RED";
		}
		else {
			return "YELLOW";
		}
	}
	
	// A method to strip down an array like {red, null, yellow} to {red, yellow}
	public P_COLOUR[] stripArrayTo2() {
		P_COLOUR[] twoCols = new P_COLOUR[2];
		boolean firstCol = true;
		for (int i = 0; i < 3; i++) {
			if (this.primaryColours[i] != null) {
				if (firstCol) {
					twoCols[0] = this.primaryColours[i];
					firstCol = false;
				}
				else {
					twoCols[1] = this.primaryColours[i];
				}
			}
		}
		return twoCols;
	}
	
	public String mixColours() {
		int len = getLength(this.primaryColours);
		
		// If there's only one colour in the palette then find and return that one colour
		if (len == 0) {
			return "";
		}
		else if( len == 1 ) {
			// Find which element the colour is in
			for (int i = 0; i < 3; i++) {
				if(this.primaryColours[i] != null) {
					return getColourString(this.primaryColours[i]);
				}
			}
		}
		// if two colours, return secondary colour depending on combo
		else if( len == 2) {
			P_COLOUR[] twoCols = new P_COLOUR[2];
			twoCols = stripArrayTo2();
			// If the colours to mix include blue
			if ((twoCols[0] == P_COLOUR.BLUE)||(twoCols[1] == P_COLOUR.BLUE)){
				if ((twoCols[0] == P_COLOUR.RED)||(twoCols[1] == P_COLOUR.RED)) {
					return "PURPLE";
				}
				else {
					return "GREEN";
				}
			}
			// Otherwise we are mixing red and yellow
			else {
				return "ORANGE";
			}
			
		}
		// Otherwise we are mixing all 3, so return black
		return "BLACK";
	}
	
	public String display() {
		StringBuffer sb = new StringBuffer();
		String mixedCol = mixColours();
		
		// If mixed colour is a primary colour, then it has been mixed to get itself
		if( mixedCol == "RED" || mixedCol == "BLUE" || mixedCol == "YELLOW") {
			sb.append(mixedCol);
			sb.append(" = ");
			sb.append(mixedCol);
		}
		// If the mixed colour is a secondary colour, then use stripArrayTo2 function
		else if( mixedCol == "PURPLE" || mixedCol == "GREEN" || mixedCol == "ORANGE" ) {
			P_COLOUR[] twoCols = new P_COLOUR[2];
			twoCols = stripArrayTo2();
			sb.append(twoCols[0]);
			sb.append(", ");
			sb.append(twoCols[1]);
			sb.append(" = ");
			sb.append(mixedCol);
		}
		else if( mixedCol == "" ){
			// Otherwise mixing all 3 colours, so return them in order using this.primaryColours
			sb.append(this.primaryColours[0]);
			sb.append(", ");
			sb.append(this.primaryColours[1]);
			sb.append(", ");
			sb.append(this.primaryColours[2]);
			sb.append(" = BLACK");
		}
		return sb.toString();
	}
}
