import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeGroupTernary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("    🤖  برنامه تعیین گروه سنی - DataDroid");
        System.out.println("=========================================");
        System.out.println("(برای خروج، عدد 0 را وارد کنید)\n");

        boolean running = true;

        while (running) {
            try {
                System.out.print("سن خود را وارد کنید: ");
                int age = input.nextInt();

                if (age == 0) {
                    System.out.println("\n👋 خداحافظ! روز خوبی داشته باشی.");
                    running = false;
                    continue;
                }

                // تعیین گروه سنی با عملگر سه‌تایی
                String group = (age < 0)   ? "Not Identified" :
                               (age < 13)  ? "کودک" :
                               (age < 20)  ? "نوجوان" :
                               (age < 60)  ? "بزرگسال" : "سالمند";


                               

                // توضیح برای هر گروه (با if-else برای خوانایی)
                String description;
                if      (age < 0)  description = "⚠️ سن نمی‌تواند منفی باشد!";
                else if (age < 13) description = "در سن بازی و یادگیری. فرصت خوبی برای آموزش مالی.";
                else if (age < 20) description = "دوران نوجوانی و شکل‌گیری شخصیت. شروع یادگیری مهارت‌های مالی.";
                else if (age < 60) description = "سن کار و تلاش. می‌توانی سرمایه‌گذاری بلندمدت را شروع کنی.";
                else               description = "دوران تجربه و آرامش. مدیریت دارایی و انتقال تجربه.";

                System.out.println("─────────────────────────────────────────");
                System.out.println("👤 سن وارد شده    : " + age);
                System.out.println("🎯 گروه سنی       : " + group);
                System.out.println("💡 توضیح          : " + description);
                System.out.println("─────────────────────────────────────────\n");

            } catch (InputMismatchException e) {
                System.out.println("❌ ورودی نامعتبر! لطفاً یک عدد صحیح وارد کنید.\n");
                input.nextLine(); // پاک کردن بافر ورودی نامعتبر
            }
        }

        input.close();
    }
}