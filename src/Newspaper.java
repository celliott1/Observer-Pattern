import java.util.ArrayList;

public class Newspaper implements Subject {

	private String newspaperName;
	private boolean available;
	private int subscriptionPrice;
	
	public int getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(int subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
		System.out.println("The monthly subscription price for " + newspaperName + " has been set to " +subscriptionPrice+ " dollars.");
		System.out.println();
	}

	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available == true){
			notifyObserver();
		}else if(available == false) System.out.println("The lastest edition of " +newspaperName+ " is not ready at this time.\n");
		
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public ArrayList<Observer> getObserverList() {
		return observerList;
	}

	public void setObserverList(ArrayList<Observer> observerList) {
		this.observerList = observerList;
	}

	@Override
	public void register(Observer newObserver) {
		observerList.add(newObserver);
	}

	@Override
	public void unregister(Observer delObserver) {
		observerList.remove(delObserver);
	}

	@Override
	public void notifyObserver() {
		System.out.println("Notifying all subscribers that the latest edition of their newspaper is out.");
		
		for(Observer observer: observerList){
			observer.update(newspaperName);
		}
	}

}
