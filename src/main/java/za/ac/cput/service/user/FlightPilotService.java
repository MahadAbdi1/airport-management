package za.ac.cput.service.user;

import za.ac.cput.domain.user.FlightPilot;
import za.ac.cput.service.IService;

import java.util.List;

public interface FlightPilotService extends IService<FlightPilot, String> {
    List<FlightPilot> findAllByUserId(String userId);
    List<FlightPilot>findAllByFlightId(String flightId);
    List<FlightPilot>findAllByDate(String date);
    List<FlightPilot>findAllByDateAndFLightId(String date,String flightId);

}
