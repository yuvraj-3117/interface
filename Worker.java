package INTERFACE;

public class Worker implements policy,Adharcard{//class implements more than one interface
	@Override
	public void checkpolicy()
	{
		System.out.println("policy checked");
	
	}
	@Override
	public void checkAdharcard() {
		System.out.println("ahdarcard is checked");
	}
}
