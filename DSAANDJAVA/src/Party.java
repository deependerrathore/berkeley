import java.awt.*;
public class Party {

	public void buildInvite(){
		Frame f = new Frame();
		Label l = new Label("Party at Deepak");
		Button b = new Button("You bet!");
		Button c = new Button("Shoot me");
		Panel p = new Panel();
		p.add(l);
	}
	public static void main(String[] args) {
		Party p = new Party();
		p.buildInvite();
	}
}
