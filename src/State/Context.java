package State;

public class Context {
	State state;
	public Context() {
		state = null;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
