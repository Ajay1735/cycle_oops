package oopPractice;

import java.time.LocalDate;

public interface Trip{
	public boolean suitableTrips(LocalDate onDate,
		Difficulty difficulty);
}