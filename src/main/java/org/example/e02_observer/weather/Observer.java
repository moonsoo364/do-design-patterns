package org.example.e02_observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
