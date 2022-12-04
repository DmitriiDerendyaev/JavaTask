public class Defasification {

    public static double CalcIntegral(double startPoint, double finishPoint, double stepAmount, IDefasification currentFunction) {
        double height = (finishPoint - startPoint) / stepAmount;

        double currentX = startPoint + height;
        double totalSum = 0.0F;

        for (int i = 0; i < stepAmount; i++) {
            totalSum += currentFunction.transferFunction(currentX);
            currentX += height;
        }

        return height * (0.5 * (currentFunction.transferFunction(startPoint) + currentFunction.transferFunction(finishPoint)) + totalSum);
    }

    public static double CalcGravityCenter(double startPoint, double firstSeparator, double secondSeparator, double finishPoint, double stepAmount) {
        double result = (CalcIntegral(startPoint, firstSeparator, stepAmount, (currentX) -> Math.pow(currentX, 3)) +
                CalcIntegral(firstSeparator, secondSeparator, stepAmount, (currentX) -> currentX) +
                CalcIntegral(secondSeparator, finishPoint, stepAmount, (currentX) -> currentX * (2.5 - 0.25 * currentX))) /
                (CalcIntegral(startPoint, firstSeparator, stepAmount, (currentX) -> Math.pow(currentX, 2)) +
                        CalcIntegral(firstSeparator, secondSeparator, stepAmount, (currentX) -> 1) +
                        CalcIntegral(secondSeparator, finishPoint, stepAmount, (currentX) -> (2.5 - 0.25 * currentX)));
        return result;
    }

    public static double CalcMedian(double startPoint, double firstSeparator, double secondSeparator, double finishPoint, double stepAmount){
        double totalArea = CalcIntegral(startPoint, firstSeparator, stepAmount, (currentX) -> Math.pow(currentX, 2)) +
                CalcIntegral(firstSeparator, secondSeparator, stepAmount, (currentX) -> 1) +
                CalcIntegral(secondSeparator, finishPoint, stepAmount, (currentX) -> (2.5 - 0.25 * currentX));

        double leftArea = CalcIntegral(startPoint, firstSeparator, stepAmount, (currentX) -> Math.pow(currentX, 2));
        double leftIncrement = 1;
        while (leftArea <= totalArea/2){
            leftArea += CalcIntegral(0, 0.01, stepAmount, (currentX) -> 1);
            leftIncrement += 0.01;
        }

        return leftIncrement;
    }
}
