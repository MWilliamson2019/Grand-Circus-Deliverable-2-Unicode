
public class Time {

	private long hour;
	private long minute;
	private long second;
	
	public void setTime (long h, long m, long s){
		
		
		hour = ( (h>=0 && h < 24) ? h : 0);
		minute = ((m >=0 && m <60) ? m :0);
		second = ((s >=0 && s <60) ? s :0);

	}
	
	public String toMilitary(){
		
		return String.format("%d:%02d:%02d", hour, minute,second);
	}
	
	
	//Ignore this for now, this might be used in the future
	/*public String toNormal(){
		return String.format("%d:%02d:%02d: %s", ((hour == 0||hour == 12) ? 12 : hour % 12),minute,second, (hour< 12 ? "AM" : "PM"));
	} */
}
