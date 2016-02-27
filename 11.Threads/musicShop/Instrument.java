package musicShop;

public class Instrument implements Comparable<Instrument>{

	private InstrumentType type;
	private String name;
	private int price;

	public Instrument(InstrumentType type, String name, int price) {
		if (name != null && name.length() > 0 && price > 0) {
			this.type = type;
			this.name = name;
			this.price = price;
		}

	}

	public String getName() {
		return this.name;
	}

	public InstrumentType getType() {
		return this.type;
	}

	public int getPrice() {
		return this.price;
	}

	
	@Override
	public int compareTo(Instrument o2) {
		if(o2!=null){
			for(int index=0; index<o2.name.length(); index++){
				if(this.name.charAt(index)==o2.name.charAt(index)){
					continue;
				}
				if(this.name.charAt(index)>o2.name.charAt(index)){
					return 1;
				}
				if(this.name.charAt(index)<o2.name.charAt(index)){
					return -1;
				}
			}
		}
		return 0;
	}
	
	public boolean equals(Instrument obj) {
		if(obj.name.equals(this.name) && obj.price==this.price && obj.type.equals(this.type)){
			return true;
		}
		return false;
	}

}
