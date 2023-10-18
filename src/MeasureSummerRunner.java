public class MeasureSummerRunner {
    public static void main(String[] args) {
        Measurable[] ms = new Measurable[0];
        ms[0] = new Point(1, 2);
        ms[1] = new Point(3, 4);
        double d = MeasureSummer.sumMeasures(ms);
        System.out.println();
    }
}
