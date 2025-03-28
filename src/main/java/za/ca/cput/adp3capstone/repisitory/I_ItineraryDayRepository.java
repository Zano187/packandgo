package za.ca.cput.adp3capstone.repisitory;
/*I_ItineraryDayRepository Interface
Author: Luyanda Mbalenhle Makhanya (222788291)
Date: 28 March 2025
        */
import za.ca.cput.adp3capstone.domain.ItineraryDay;

import java.util.HashMap;

public interface I_ItineraryDayRepository extends IRepository<ItineraryDay, Integer>{
    HashMap<Integer, ItineraryDay> findItineraryDays();
}
