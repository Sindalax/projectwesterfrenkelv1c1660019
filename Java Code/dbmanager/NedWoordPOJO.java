package dbmanager;

public class NedWoordPOJO 
{
	
	private int id;
	private String woord;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWoord() {
		return woord;
	}

	public void setWoord(String woord) {
		this.woord = woord;
	}

	public NedWoordPOJO(int id, String woord)
	{
		this.id = id;
		this.woord = woord;
	}

}
