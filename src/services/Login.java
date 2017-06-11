package services;
import main.Main;

public class Login {

	private Main main = new Main();
	
	public Login(){	
		
	}
	
	public String getUserInfos(){
		return main.retriveUserInfos().toString();
	}
	
	public void setUserInfos(){
		
	}
}