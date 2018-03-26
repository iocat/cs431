
Departure Time: Random Distribution? 

The traffic object interface:
        Time:
            Hour: int
            Minute: int
            Second: int

        Generate a CarArrival.
            CarArrival:
                arrivalTime: Time
                departureTime: Time
            
        Manage a global clock, all system component must connect to traffic for the time.  (RPC)?

MM (manager/monitor): 
    - Scaffolding: help in assembling the system
    - Initialization: distribute tokens and budget.
    - Monitoring: 
        - Testing
        - Compiling statistics and final success measure.
        
There is a sort of like a governor that enforces policy how they work together... Question remains: the manager dies! 
