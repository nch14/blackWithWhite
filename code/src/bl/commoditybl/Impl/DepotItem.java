package bl.commoditybl.Impl;

public class DepotItem {
	public String ID;
	public String[] date;
	public String destination;
	public String zoneID;
	public String rowID;
	public String frameID;
	public String positionID;
	
	public DepotItem(String ID,String[] date,String destination,String ZoneID,
			String rowID,String frameID,String positionID){
		this.ID=ID;
		this.date=date;
		this.destination=destination;
		this.zoneID=ZoneID;
		this.rowID=rowID;
		this.frameID=frameID;
		this.positionID=positionID;
	}
}
