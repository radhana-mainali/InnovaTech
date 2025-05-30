//package ClientProject;
import java.util.*;
public class group {
	private List<String> students;
	private List<Electronic> items;
	private List<Electronic> tray;
	private int team;
	public group(int team){
		students=new ArrayList<String>();
		this.team=team;
		//tray = new ArrayList<>();
		//items = new ArrayList<>();
	}
	public group(List<String> members, int team) {
		students=List.copyOf(members);
		this.team=team;
	}
	public void addMember(String student) {
		students.add(student);
	}
	public List<Electronic> getTray() {
		return tray;
	}
	public String toString() {
		return team+"";
	}
	public int getTeamNum() {
		return team;
	}
	public void borrow(Electronic e){
		items.add(e);
		tray.remove(e);
		e.borrow(this);
	}
	public void add(Electronic e){
		tray.add(e);
		e.borrow(this);
	}
}
