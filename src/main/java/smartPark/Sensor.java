package smartPark;

/**
 * Created by harvey on 29/04/17.
 */

import org.springframework.data.annotation.Id;

public class Sensor {

    @Id
    public int id;

    public int streetID;
    public double location_coord;
    public boolean vacant;

    public Sensor()
    {

    }

    public Sensor(int id, int streetID, double location_coord, boolean vacant)
    {
        this.id = id;
        this.streetID = streetID;
        this.location_coord = location_coord;
        this.vacant = vacant;
    }

    @Override
    public String toString() {
        return String.format(
                "Sensor[id=%s, streetID=%s, location_coord=%s, vacant=%s]",
                id, streetID, location_coord, vacant
        );
    }
}
