package Demo3;



public class MainClass {
    public static void main(String[] args) {
        Second second = new Second();
        second.firstMethod();
        second.OfficeTime();

        Third myLife = new Third();  // অবজেক্ট নিয়েছি এবং রেফার ভেরিয়েবল দিয়ে মেথহুড কল করে আউটপুট কল করেছি ।
        myLife.holyDay();
        myLife.university();

        Four four = new Four(10,10,10);   // এখানে রেফারেন্স ফেরিয়েবল দিয়ে হাইট , ওয়েট বসিয়ে আউটপুট বের করার জন্য
                                                           // মেথহুড কল করেছি
         four.displayVol();

    }
}