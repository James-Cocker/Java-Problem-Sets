package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	private String name;
	private List<IGuest> guests;

	public Hotel(String name) {
		this.name = name;
		guests = new ArrayList<IGuest>();
	}

	public String getName() {
		return name;
	}

	public List<IGuest> getGuests() {
		return guests;
	}

	public void addGuest(IGuest guest) {
		if (guest != null && !guests.contains(guest)) {
			guests.add(guest);
		}
	}

	public String printGuestList() {
		String guestList = "";
		for (IGuest g: guests) {
			guestList += g + "\n";
		}
		return name + " Hotel\nGuest List\n" + guestList;
	}
}
