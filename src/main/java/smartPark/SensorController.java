package smartPark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by harvey on 29/04/17.
 */
@RestController
public class SensorController {

    @RequestMapping("/api/getAllSensors")
    public List<String> allSensors()
    {
        List<String> vacant= new ArrayList<String>();
        vacant.add("[54.604224, -5.931062]");
        vacant.add("[54.604312, -5.931134]");
        vacant.add("[54.604337, -5.931166]");
        vacant.add("[54.604452, -5.931220]");
        vacant.add("[54.603712, -5.931738]");
        vacant.add("[54.604517, -5.932586]");
        vacant.add("[54.604309, -5.932774]");
        vacant.add("[54.604909, -5.930870]");
        vacant.add("[54.604465, -5.929755]");

        vacant.add("[54.604465, -5.929755]");
        vacant.add("[54.605205, -5.931006]");
        vacant.add("[54.604937, -5.930874]");
        vacant.add("[54.604044, -5.932078]");
        vacant.add("[54.603951, -5.931977]");
        vacant.add("[54.603626, -5.930413]");

        return vacant;
    }

    @RequestMapping("/api/getAllVacant")
    public List<String> allVacant()
    {
        List<String> vacant= new ArrayList<String>();
        vacant.add("[54.604224, -5.931062]");
        vacant.add("[54.604312, -5.931134]");
        vacant.add("[54.604337, -5.931166]");
        vacant.add("[54.604452, -5.931220]");
        vacant.add("[54.603712, -5.931738]");
        vacant.add("[54.604517, -5.932586]");
        vacant.add("[54.604309, -5.932774]");
        vacant.add("[54.604909, -5.930870]");
        vacant.add("[54.604465, -5.929755]");

        return vacant;
    }

    @RequestMapping("/api/getStreet")
    public List<String> allStreet()
    {
        List<String> vacant= new ArrayList<String>();
        vacant.add("[54.604224, -5.931062]");
        vacant.add("[54.604312, -5.931134]");
        vacant.add("[54.604337, -5.931166]");
        vacant.add("[54.604452, -5.931220]");

        return vacant;
    }

    // This endpoint is proof of consept. Doesn't actually work
    @RequestMapping(value ="/api/addSensors", method = RequestMethod.PUT)
    public @ResponseBody Sensor createSensor(
            @RequestParam int id,
            @RequestParam int street_id,
            @RequestParam double location_coords,
            @RequestParam boolean vacant
    )
    {
        Sensor sensor = new Sensor(id, street_id, location_coords, vacant);
        m_sensorRepository.save(sensor);
        return sensor;
    }


    // Time constraints mean that we have to generate the stats for the parking sensors
    private List<Sensor> generateSensors()
    {
        List<Sensor> toReturn = new ArrayList<>();
        toReturn.add(new Sensor(1, 4, 45.0000, true));
        toReturn.add(new Sensor(2, 4, 45.0000, true));
        toReturn.add(new Sensor(3, 4, 45.0000, false));
        toReturn.add(new Sensor(4, 4, 45.0000, true));
        toReturn.add(new Sensor(5, 4, 45.0000, false));
        toReturn.add(new Sensor(6, 5, 45.0000, true));
        toReturn.add(new Sensor(7, 5, 45.0000, true));
        toReturn.add(new Sensor(8, 5, 45.0000, false));
        toReturn.add(new Sensor(9, 5, 45.0000, true));
        toReturn.add(new Sensor(10, 5, 45.0000, false));
        toReturn.add(new Sensor(11, 6, 45.0000, true));
        toReturn.add(new Sensor(12, 6, 45.0000, true));
        toReturn.add(new Sensor(13, 6, 45.0000, true));
        toReturn.add(new Sensor(14, 6, 45.0000, false));
        toReturn.add(new Sensor(15, 6, 45.0000, true));
        toReturn.add(new Sensor(16, 7, 45.0000, false));
        toReturn.add(new Sensor(17, 7, 45.0000, true));
        toReturn.add(new Sensor(18, 7, 45.0000, true));
        toReturn.add(new Sensor(19, 7, 45.0000, false));
        toReturn.add(new Sensor(20, 7, 45.0000, true));

        return toReturn;
    }


    @Autowired
    private SensorRepository m_sensorRepository;
}
