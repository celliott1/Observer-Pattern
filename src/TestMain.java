
public class TestMain {
	public static void main(String[] args){
		
		//Creating the subscribers
		Subscriber subscriber1 = new Subscriber();
		subscriber1.setSubscriberName("Chris");
		
		Subscriber subscriber2 = new Subscriber();
		subscriber2.setSubscriberName("Neil");
		
		Subscriber subscriber3 = new Subscriber();
		subscriber3.setSubscriberName("Siv");
		
		//Creating the newspaper
		Newspaper chicago = new Newspaper();
		chicago.setNewspaperName("The Chicago Times");
		chicago.setSubscriptionPrice(20);
		
		//New edition of The Chicago Times is unavailable at the moment
		chicago.setAvailable(false);

		
		chicago.register(subscriber1);
		chicago.register(subscriber2);
		chicago.register(subscriber3);
		//New edition of The Chicago Times has just been released
		chicago.setAvailable(true);
		System.out.println();

		
		//Subscriber1 wishes to unsubscribe to The Chicago Times
		chicago.unregister(subscriber1);
		
		chicago.setSubscriptionPrice(10);
		chicago.setAvailable(true);
		System.out.println();
	}
}
