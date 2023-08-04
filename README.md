# calculator-using-BDD

## انجام مراحل مستند **"مثالی از تبدیل نیازمندی‌ها به موارد آزمون با استفاده از روش ایجاد مبتنی بر رفتار (BDD)"**
۱- ایجاد یک پروژه جدید Maven
![maven-1](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/ab1fd796-8f90-472d-91f8-ade121b1854d)
![maven-2](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/300aba75-c85a-4f0d-a2af-794c4faf2efb)
![maven-3](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/4009b7e7-67bb-45f6-861c-907b3bccdc59)

۲- افزودن dependencyهای موردنیاز شامل JUnit و Cucumber به فایل pom.xml پروژه

![maven-4](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/cf7e6076-6a0a-4cab-90d2-9e408f40c9e5)

۳- اجرای Maven->Test از طریق navigation bar سمت راست صفحه و اطمینان از انجام موفق آن با دیدن پیغام BUILD SUCCESS

![maven-5](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/6425f115-bbbf-44e6-9b4e-0065edeaab4f)

۴و ۵- با انجام این مراحل، ملزومات راه‌اندازی می‌شود

![maven-6](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/a0c228cb-12e6-44eb-ace3-0307f989c72b)

۶- ایجاد یک پکیج جدید به نام resources در پکیج test پروژه و راست کلیک بر روی آن و انتخاب Mark Directory as Test Resource Root
![maven-7](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/1cf77b7e-a360-499c-a269-70c952db6885)
![maven-8](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/dc60c0c4-80a4-4f54-8edc-66b87d96f1b3)
![maven-9](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/7d43f12f-925d-4e83-b351-d93e81e5373c)

۷- ایجاد پکیج جدید با نام calculator در مسیر src->main->java و ایجاد دایرکتوری جدید با نام features در مسیر test->resources

![maven-10](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/9fb4a407-779a-482b-9c1a-f7616b777d2f)

۸- ایجاد فایل جدید با عنوان calculator.feature در زیر دایرکتوری feature و نوشتن سناریوی جمع دو عدد در آن

![maven-11](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/4ef3a40f-9e0d-4424-a725-43037892304a)
![maven-12](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/276c700f-5896-4040-be2f-7c1f2246d92f)

**در این مرحله، گزینه‌های ایجاد step definition ظاهر نمیشد. علت آن، نصب نبودن plugin مربوط به Cucumber بود که انجام شد**

![maven-13](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/fc35d0cd-4ff9-42fd-a4a1-fdbc105decbd)

سپس با استفاده از این گزینه‌های quick fix، تعاریف اضافه شدند و مطابق راهنمایی مستند، تکمیل گشتند

![maven-14](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/4cedf918-b7d0-457f-931e-e8f55875680c)
![maven-15](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/7745d411-aa22-4172-92e2-1be419f7b6e8)
![maven-16](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/4b1430ef-ff94-4ebf-8e3a-fb82e1fdc459)
![maven-17](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/686f401c-fc51-435f-ab8d-cbde23cc55a9)

سپس کلاس اصلی یعنی Calculator.java پیاده‌سازی شد تا ارورهای کامپایل تست‌ها از بین برود

![maven-18](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/e64f09de-7b87-42e1-9873-c6c8192a8084)

۹- بروز خطا هنگام اجرای test های Maven و معرفی نسخه‌ی بالاتر آن در فایل pom.xml

![maven-19](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/9a23462e-dec9-4193-bb08-f603fe5c6fa4)
![maven-20](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/551f77c1-a692-46f4-a7aa-17f742af4182)

10- **هنگام اجرای calculator.feature، به خطای تصویر زیر برخوردیم و مشخص شد که باید نسخه‌ی بروزتری از IntelliJ را استفاده کنیم**

![maven-21](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/c4a63418-6a69-442a-ba68-2e9399ee5011)

**در ادامه هم هنگام اجرا، خطای دیگری نمایش داده می‌شد و آن undefined بودن step ها بود. برای رفع این مشکل نیز پس از کمی جستجو، JDK 8 نصب شد و با ورژن 17 جایگزین شد. پس از اعمال این دو تغییر، اجرای تمام مراحل از ابتدا، مشکل را حل کرد و تست‌ها پاس شدند.**

![maven-22](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/20e35989-a619-4ea2-849c-3f33f2d1b4f0)


۱۱- ایجاد فایل RunnerTest.java برای مشاهده‌ی جزئیات اجرا از طریق JUnit


بروز خطا در فایل RunnerTest اولیه


۱۲- رفع خطا با افزودن مسیر فایل feature و پاس شدن تست‌ها

![maven-25](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/4a7a09be-8e89-4968-9296-44baa93ebdc9)

۱۳- مشاهده‌ي نتایج تست‌ها با تغییر اعداد. همانطور که در این تصویر مشخص است، اگر نتیجه‌ی مورد انتطار ما عددی مانند ۳۰۰۰ باشد، با جوابی که تابع add بازمیگرداند (یعنی ۳)، یکسان نبوده و موجب fail شدن تست‌ها می‌شود.

![maven-26](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/afed1e70-f023-4dca-b690-d75418ae59e2)

۱۴- تعریف سناریوی دیگر با استفاده از Scenario Outline

![maven-27](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/54e5f754-4583-41ce-ac6e-c9604b0b8e1f)

همانطور که در این تصویر مشخص است، یمثال دوم از سناریوی دوم، undefined می‌شود. علت بروز این مشکل آن است که در Regex های تعریف‌شده برای step definition ها، اعداد منفی در نظر گرفته نشده‌اند. درواقع رجکس به صورت +d\\\\ است که به معنای یک تا چند رقم از ۰ تا ۹ است و مشخصا علامت منفی پشت عدد را نمی‌گیرد. بنابراین وقتی که در مثال دوم، یک عدد منفی به عنوان value 1 داده می‌شود، شناخته نمی‌شود. با تغییر رجکس‌ها به یک حالت عمومی‌تر که شامل اعداد صحیح منفی نیز باشد، این مشکل برطرف می‌شود و تمام تست‌ها پاس می‌شوند. رجکس جدید به صورت +d\\\\?- است. علامت ? در رجکس نشان‌دهنده‌ی تعداد ۰ یا یک است. بنابراین اعدادی پذیرفته می‌شوند که یا هیچ علامت منفی ای ندارند (مانند قبل)، یا یک علامت منفی دارند.

![maven-28](https://github.com/MahtaFetrat/calculator-using-BDD/assets/62302965/7de356f1-9ae3-484a-aa8d-e0eafa021c73)

۱۵- حال می‌خواهیم به پروژه زده شده قابلیت‌های تقسیم و به توان رساندن اعداد را اضافه کنیم. برای این دو قابلیت سناریو‌های تست به دو صورت عادی و outline را می‌نویسیم:
![image](https://github.com/MahtaFetrat/calculator-using-BDD/assets/24840082/e40edb67-7a0a-4eae-9181-cb85d04a50f2)
![image](https://github.com/MahtaFetrat/calculator-using-BDD/assets/24840082/9e065187-dbd9-45b0-a4ad-7d8de829bac9)

۱۶- حال این سناریوها را به موارد تست تبدیل می‌کنیم. همچنین چون در تقسیم خروجی اعشاری نیز ممکن است باید آن حالت را نیز اضافه کنیم:
![image](https://github.com/MahtaFetrat/calculator-using-BDD/assets/24840082/b9b95b3e-dc10-4a8f-9da2-9183f3392c7a)

۱۷- کد اصلی این دو قابلیت:
![image](https://github.com/MahtaFetrat/calculator-using-BDD/assets/24840082/87ce3065-8f50-446e-8b42-d894e306d0b3)

۱۸- حال همه تست‌ها را مجددا اجرا می‌کنیم تا از درستی برنامه مطمئن شویم:
![image](https://github.com/MahtaFetrat/calculator-using-BDD/assets/24840082/83770a40-26a9-4078-b01a-2664c7e588fa)
