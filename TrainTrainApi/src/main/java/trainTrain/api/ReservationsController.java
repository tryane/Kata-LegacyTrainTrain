package trainTrain.api;

import com.traintrain.WebTicketManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ReservationsController {
    @RequestMapping(method = RequestMethod.POST, value = "api/reservations")
    public String update(@RequestBody RequestDto requestDto) throws IOException, InterruptedException {
        WebTicketManager webTicketManager = new WebTicketManager();
        return webTicketManager.reserve(requestDto.train_id, requestDto.number_of_seats);
    }

    @RequestMapping(method = RequestMethod.GET, value = "api.value")
    public String get(String value) {
        return value;
    }
}
