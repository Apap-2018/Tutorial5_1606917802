package com.apap.tutorial5.service;
import java.util.List;
import java.util.Optional;

import com.apap.tutorial5.model.CarModel;
import com.apap.tutorial5.model.DealerModel;

public interface CarService {
	void addCar(CarModel car);
	public void deleteById(Long id);
	void updateCar(long id,CarModel car);
	CarModel getCar(Long id);
	void deleteCar(CarModel car);
}
