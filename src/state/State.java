package state;

/**
 * @author coderyong
 */
public interface State {
    void on(Switch s);

    void off(Switch s);
}