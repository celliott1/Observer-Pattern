
public class Subscriber implements Observer {

	private String subscriberName;
	private Subject subject;
	
	
	
	public String getSubscriberName() {
		return subscriberName;
	}



	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}



	public Subject getSubject() {
		return subject;
	}



	public void setSubject(Subject subject) {
		this.subject = subject;
	}



	@Override
	public void update(String newspaper) {
		System.out.println("Dear " + subscriberName + ", your latest edition of " + newspaper + " has just been released.");
	}

}
