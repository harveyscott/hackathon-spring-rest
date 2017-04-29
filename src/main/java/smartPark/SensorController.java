package smartPark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        List<Sensor> sensors = new ArrayList<>();
        List<String> outputs;
        // Get sensors
        sensors.addAll(m_sensorRepository.findAll());
        outputs = sensors.stream().map(Sensor::toString).collect(Collectors.toList());
        return outputs;
    }

    @RequestMapping("/api/getAllVacant")
    public List<String> allVacant()
    {
        List<Sensor> sensors = new ArrayList<>();
        List<String> outputs;
        sensors.addAll((Collection<? extends Sensor>) m_sensorRepository.findByVacant(true));
        outputs = sensors.stream().map(Sensor::toString).collect(Collectors.toList());
        return outputs;
    }


    @Autowired
    private SensorRepository m_sensorRepository;
}
