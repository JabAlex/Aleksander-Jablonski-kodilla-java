package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverage(){
        double result = 0;
        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            result += temperature.getValue();
        }
        result = result / temperatures.getTemperatures().size();
        return result;
    }

    public double calculateMedian(){
        double result;
        List<Double> sortedTemp = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(sortedTemp);
        if(sortedTemp.size() % 2 == 1){
            result = sortedTemp.get(sortedTemp.size() / 2);
        } else{
            result = (sortedTemp.get(sortedTemp.size() / 2) + sortedTemp.get(sortedTemp.size() / 2 - 1)) / 2;
        }

        return result;
    }
}
