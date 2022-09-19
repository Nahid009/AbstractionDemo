package Demo3;

public class Four extends Second {

    double height, width, depth;
    public Four(double height, double width, double depth) {   // এখানে একটা কন্সট্রাটর কল করেছি , এবং প্যারেন্ট ক্লাস সেকেন্ড থেকে ফোর কে এক্সট্রেন্ড করেছি।
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

//    void box(double height, double width, double depth) {
//        this.height = height;
//        this.width = width;
//        this.depth = depth;
//
//}

    void displayVol(){                       // এখানে আউটপুট নেয়ার জন্য একটা মেথহুড কল করেছি।
        double vol = height  * width * depth ; // এখানে আউটপুট বের করার জন্য সুত্র লিখেছি
        System.out.println("Volume is : "+vol);
    }
}
