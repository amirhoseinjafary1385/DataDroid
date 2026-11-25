# 🤖 DataDroid

پروژه‌ی **DataDroid** یک برنامه‌ی ساده و کاربردی برای تعیین **گروه سنی** بر اساس سن وارد شده است. این پروژه در دو نسخه پیاده‌سازی شده است:
۱. یک برنامه‌ی کنسولی (Command Line) در جاوا با استفاده از عملگر سه‌تایی (`?:`).
۲. یک برنامه‌ی وب کامل (Full-Stack) با استفاده از **Spring Boot** (بک‌اند) و **HTML/CSS/JS** (فرانت‌اند).

---

## 📸 ویژگی‌ها
- تعیین گروه سنی (کودک، نوجوان، بزرگسال، سالمند).
- اعتبارسنجی سن (مدیریت سن‌های منفی یا ورودی‌های غیرعدد).
- طراحی زیبا و ریسپانسیو برای رابط کاربری وب.
- اتصال واقعی بین وب و جاوا از طریق REST API.

---

## 📁 ساختار پروژه

```text
DataDroid/
│
├── src/                        # نسخه کنسولی جاوا (Java SE)
│   └── AgeGroupTernary.java
│
├── web/                        # فایل‌های استاتیک نسخه اولیه
│   ├── index.html
│   ├── script.js
│   └── styles.css
│
└── agerest/                    # نسخه وب (Spring Boot Backend)
    ├── pom.xml
    └── src/
        └── main/
            ├── java/com/datadroid/agerest/
            │   ├── AgerestApplication.java
            │   └── AgeController.java
            └── resources/
                ├── application.properties
                └── static/
                    ├── index.html
                    ├── script.js
                    └── styles.css


