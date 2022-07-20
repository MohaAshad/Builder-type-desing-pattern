public class Test {
    public static void main(String[] args) {
        Smartwatch.Builder builder=new Smartwatch.Builder(512,4);
        Smartwatch smartwatch= builder.build();
        System.out.println(smartwatch);
        builder.setPrice(7000.00);
        builder.setWeight(58);
        System.out.println(builder);
    }
}
