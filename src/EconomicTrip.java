public class EconomicTrip extends Trip{

    public void setDistance1(int distance) {
        this.distance = distance;
        x = distance *5000;
    }


    WeatherTime weatherTime = s -> price = (s*1.4);
    Time time = s -> price = (s*1.2);
    Weather weather = s -> price = (s*1.2);


    /**
     * "0" is a brainy and traffic
     * "1" is a traffic
     * "2" is a brainy
     */

    public void setTypeCondition(int typeCondition) {
        this.typeCondition = typeCondition;
    }

    protected void typeCondition(int typeCondition){
        if(typeCondition == 0)
            weatherTime.trafficAndWeather(x);
        else if(typeCondition == 1)
            time.traffic(x);
        else if(typeCondition == 2)
            weather.brainy(x);
    }
    private double getPrice() {
        return price;
    }
}
