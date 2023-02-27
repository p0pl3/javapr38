package Practice6.Builder;

public class Keyboard {
    private Plate _plate;
    private Switch _switch;
    private final Keycap[] keycaps = new Keycap[4];


    public Plate get_body() {
        return _plate;
    }

    public void set_body(Plate _plate) {
        this._plate = _plate;
    }

    public Switch get_rudder() {
        return _switch;
    }

    public void set_rudder(Switch _switch) {
        this._switch = _switch;
    }

    public Keycap[] getWheels() {
        return keycaps;
    }
}
