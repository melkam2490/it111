public class GallonsLiters {

    public static void main( String[]args){
        double liters;
        double converter= 0.26417205;
        double gallons;
        int count = 0;
        for (gallons= 1; gallons <= 100; gallons= gallons+5){
            if(count!=5){
                liters = Math.round((gallons / converter) * 100.0) / 100.0;
                if (gallons == 1) {
                    System.out.println(liters + " Liters = " + gallons + " Gallon");
                    count = count +1;
                }
                else {
                    System.out.println(liters + " Liters = " + gallons + " Gallons");
                    count = count + 1;
                    if (count == 5) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
        System.out.println("All done");
    }
}
