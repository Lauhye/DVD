import java.util.ArrayList;

public class Datebase {
	
	private ArrayList<Item>listItem=new ArrayList<Item>();

	public void add(Item item){
		listItem.add(item);
	}
	
     public void list(){
    	 for(Item item : listItem){
    		 item.print();
    	 }
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Datebase db=new Datebase();
        db.add(new CD("CD","Jay",8,24,"perfect"));
        db.add(new DVD("DVD","Jay",20,"wonderful"));
        db.add(new MP3("Mp3","Adele",10,true,"Beautiful","Hello,it's me."));
        db.list();
	}

}
