package BehavorialClass.StatePattern;

public interface State {
    void doAction(Context context);

    String toString();
}
