
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt=false;
    private String comment;
    
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.print("title: "+title+"   ");

		System.out.print("playingTime: "+playingTime+"   ");

		System.out.print("gotIt: "+gotIt+"   ");

		System.out.print("comment: "+comment+"   ");
	}

}
