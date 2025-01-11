package main;

public class E_2469_ConvertTheTemperature {
    public double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        answer[0] = celsius + 273.15;
        answer[1] = celsius * 1.8 + 32.0;
        return answer;
    }
}
