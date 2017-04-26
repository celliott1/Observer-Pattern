
public interface Subject {

	public void register(Observer newObserver);
	public void unregister(Observer delObserver);
	public void notifyObserver();
}
