package oopPractice;

import java.time.LocalDate;

public interface TripFinder{

	public boolean suitableTrips(LocalDate onDate,
		Difficulty difficulty,String needBike);
}