package Demo3;

public class Second implements First {

   // এখানে ইন্টারফেস কে ইম্পিলিমেন্ট করেছি

    @Override
    public void firstMethod() {
        System.out.println("First Interface");
    } // তারপর ওভার রাইড করে প্রিন্টলাইন করেছি ।

    @Override
    public void OfficeTime() {
        System.out.println("Office time is a 4:00 pm");
    }





}
