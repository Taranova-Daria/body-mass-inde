public class BodyMassIndeService {
    public int calculate(double height, double weight) {

        int result;
        result = (int) (weight / (height * height));
        return result;

    }
}
