package smartPark;

/**
 * Created by harvey on 29/04/17.
 */

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorRepository extends MongoRepository<Sensor, String > {
    public Sensor findByid(int id);
    public Sensor findByVacant(boolean vacant);
}
