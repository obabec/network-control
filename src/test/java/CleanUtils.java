import com.redhat.patriot.network_control.model.Network;
import com.redhat.patriot.network_control.model.Router;
import com.redhat.patriot.network_simulator.example.cleanup.Cleaner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CleanUtils {
    public void cleanUp(ArrayList<Network> topology, HashMap<String, Router> routers) {
        Cleaner cleaner = new Cleaner();
        List<String> networks = new ArrayList<>();
        List<String> rts = new ArrayList<>(routers.keySet());
        topology.forEach(network -> networks.add(network.getName()));
        cleaner.cleanUp(networks, rts);
    }

}
