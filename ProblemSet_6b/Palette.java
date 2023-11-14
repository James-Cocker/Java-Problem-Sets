package ProblemSet_6b;

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
}
