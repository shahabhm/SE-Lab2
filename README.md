به نام خدا

# آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)

## اهداف
در این آزمایش هدف بر آن است که دانشجویان با به کارگیری اصول SOLID در یک پروژه‌ی عملی ساده آشنا شوند.

## نیازمندی‌ها
آشنایی اولیه با مفاهیم برنامه نویسی و طراحی شی‌گرا که دانشجویان قبلاً در درس برنامه‌سازی پیشرفته با آن آشنا شده‌اند.

## ابزارهای مورد استفاده
- یک Java IDE مانند IntelliJ IDEA و یا Eclipse به همراه jdk حداقل نسخه ۸

## منابع آموزشی
برای آشنایی با این اصول و آشنایی با منابع مناسب به [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/blob/main/educational-resources/SOLID/README.md) مراجعه کنید.

## مقدمه
در این آزمایش شما خواهید آموخت که چگونه می‌توانید با به کارگیری اصول SOLID، نرم‌افزارهایی را بسازید که از نظر قابلیت نگهداری و بهبود، در وضعیت مطلوبی باشند و مدیریت تغییرات در آن‌ها به آسانی میسر باشد (شک نکنید که به کارگیری این اصول اساسی و بسیاری دیگر از اصول مهندسی نرم افزار، باعث تفاوت شما با سایر همکارانتان خواهد شد)

## بخش اول: توضیحاتی پیرامون برنامه‌ی داده شده
می‌توانید برنامه را از [اینجا](https://github.com/ssc-public/Software-Engineering-Lab/tree/main/base-projects/SOLID-Principles) بارگیری کنید.

### مفروضات مسئله
صورت آزمایش در درس افزار بارگزاری شده است و می‌توانید برای تحویل گزارش (با در نظر گرفتن ملاحظات گفته شده) از قالب های زیر استفاده کنید.

## بخش دوم: دستور آزمایش

### گام ۱: افزودن یک روش پیام رسانی دیگر

	تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>&nbsp;</strong></p>
</td>
<td width="198">
<p>&nbsp;</p>
</td>
<td width="141">
<p>&nbsp;</p>
</td>
<td width="292">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

مجموع تعداد تغییرات: ..............

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
کلاس‌های Food و Order کاملا کوهیسیو هستند و یک‌کار انچام می‌دهند.
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
کلاس Main چون در آن ۳ کار مختلف انتخاب غذا، روش پرداخت و پرداخت وجود دارد.

اینترفیس OrderService نیز هم مسئول پرداخت و هم ثبت سفارش است.
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
باقی کلاس‌ها، اجازه تغییر را نمی‌دهند در نتیجه این اصل را محقق می‌کنند.
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
کلاس Main چون که برای ایجاد یک فیچر جدید مجبور به تغییر آن شدیم.
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
کلاس‌هایی که از اینتفریس OrderService تولید‌شده اند، رابطه is-a کاملی ندارند. البته این اینترفیس بیشتر اصل ۴ را نقض می‌کند اما می‌توان تا حدی برای این اصل نیز آن را در نظر گرفت.
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
اینترفیس OrderService شامل توابعی است که همگی در کلاس‌های زیرین کاربرد ندارند و برخی خالی هستند.
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
.در کلاس Order نمونه‌ای از Food را نیاز داریم که از تابع setter گرفته شد
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
کلاس اصلی (Main) به طور مستقیم به کلاس‌های OnlineOrderService، OnSiteOrderService و PhoneOrderService وابسته است که این اصل را نقض می‌کند.
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
<tr>
<td width="168">
<p>&nbsp;</p>
</td>
<td width="246">
<p>&nbsp;</p>
</td>
<td width="284">
<p>&nbsp;</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟
2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟
افزایش قابلیت نگهداری:
یکی از مزایای اصلی رعایت اصول طراحی نرم‌افزار، افزایش قابلیت نگهداری و توسعه‌پذیری کد است. این بدان معناست که وقتی نیاز به افزودن ویژگی‌های جدیدی مانند یک روش پرداخت جدید یا یک سیستم ثبت سفارش جدید به برنامه دارید، می‌توانید به سادگی یک کلاس جدید ایجاد کنید که واسط‌های مناسب را پیاده‌سازی کند. این روش موجب می‌شود که ساختار اصلی کدها دست‌نخورده باقی بماند و نیازی به تغییر در کلاس‌های موجود نباشد. به عیارت دیگر، شما نیازی به اصلاح کلاس‌های موجود ندارید که خطر وارد شدن باگ‌ها را کاهش می‌دهد. از آنجا که کلاس‌های جدید مستقل از کلاس‌های موجود هستند، نیازی به تغییر در کلاس‌های قبلی نیست و این امر به کاهش خطر بروز باگ در بخش‌های موجود نرم‌افزار کمک می‌کند. این رویکرد نه تنها زمان توسعه را کاهش می‌دهد بلکه با حفظ پایداری سیستم، باعث افزایش رضایت مشتری و کاربران نهایی می‌شود.


خوانایی و سازماندهی کد:
هر کلاس و واسطه باید دارای مسئولیت‌های مشخصی باشد، که به درک و روند جریان کد کمک کند. این امر نه تنها باعث می‌شود کد ساختاریافته‌تر و منطقی‌تر باشد، بلکه به توسعه‌دهندگان جدیدی که به پروژه می‌پیوندند کمک می‌کند تا سریع‌تر با آن آشنا شوند. همچنین، هنگامی که شما یا همکارانتان پس از مدت طولانی به کد برمی‌گردید(منظور بعد از مدت زمانی طولانی)،‌ داشتن کدی که به خوبی سازماندهی شده و خوانا باشد، به شما اجازه می‌دهد به راحتی منطق آن را بفهمید و تغییرات لازم را بدون اشتباه اعمال کنید. به این ترتیب، نگهداری و توسعه کد در آینده نیز به مراتب آسان‌تر خواهد شد.


افزایش انعطاف‌پذیری: 
استفاده از واسط‌ها در طراحی نرم‌افزار، انعطاف‌پذیری بیشتری را به ارمغان می‌آورد. این امکان به توسعه‌دهندگان داده می‌شود تا پیاده‌سازی‌های مختلفی از سرویس‌هایی مانند OrderRegistrationService یا OrderPaymentService ایجاد کرده و در صورت نیاز، آنها را به راحتی با یکدیگر جایگزین کنند. با این رویکرد، نیازی به تغییر در کدهای دیگری که از این سرویس‌ها استفاده می‌کنند نخواهد بود.
این انعطاف‌پذیری به ویژه در محیط‌هایی که تغییرات سریع در نیازهای کسب‌وکار یا فناوری رخ می‌دهد، بسیار ارزشمند است. توسعه‌دهندگان می‌توانند بدون نگرانی از اختلال در عملکرد بخش‌های دیگر سیستم، پیاده‌سازی‌های جدیدی را آزمایش و به‌کار گیرند. همچنین، این روش به کاهش وابستگی‌های غیرضروری در کد کمک کرده و امکان توسعه و تست مؤثرتر را فراهم می‌آورد. این معماری نرم‌افزار، سازمان را قادر می‌سازد تا به سرعت به تغییرات بازار پاسخ دهد و نوآوری‌های جدید را با کمترین ریسک به سیستم اضافه کند.


کاهش اتصال:
در طراحی نرم‌افزار، کاهش وابستگی‌های مستقیم بین کلاس‌ها به افزایش ماژولار بودن و انعطاف‌پذیری سیستم کمک می‌کند. در این راستا، کلاس اصلی (Main) به جای وابستگی مستقیم به کلاس‌های سطح پایین مانند OnlineOrderService`، `OnSiteOrderService و PhoneOrderService`، به انتزاع‌هایی همچون `OrderRegistrationService و OrderPaymentService متکی است. 
این تغییر ساختاری به معنای کاهش اتصال بین کلاس‌ها و اجزای سیستم است. با تکیه بر انتزاع‌ها، کلاس اصلی می‌تواند بدون نیاز به تغییر در سایر بخش‌های سیستم، پیاده‌سازی‌های مختلف را به کار گیرد. به این ترتیب، اگر نیاز به افزودن یک روش جدید برای ثبت یا پرداخت سفارش باشد، می‌توان با ایجاد یک کلاس جدید که واسط‌های مرتبط را پیاده‌سازی می‌کند، این کار را انجام داد بدون آنکه سایر بخش‌ها تحت تأثیر قرار گیرند.
این نوع طراحی علاوه بر اینکه مدیریت و نگهداری کد را آسان‌تر می‌کند، به افزایش پایداری و استحکام سیستم نیز کمک می‌کند. با کاهش وابستگی‌های مستقیم، احتمال بروز خطاهای ناشی از تغییرات در یک بخش از سیستم به حداقل می‌رسد و امکان تست و ارتقاء هر بخش به صورت مستقل فراهم می‌شود. در نتیجه، سیستم به‌طور کلی ماژولارتر و مقاوم‌تر در برابر تغییرات می‌شود و می‌تواند به سرعت با نیازهای جدید و تغییرات محیطی سازگار شود.


تسهیل در آزمون‌نویسی:
یکی از مزایای کلیدی طراحی نرم‌افزار با وابستگی‌های به‌وضوح تعریف‌شده و جدا از هم، سهولت در نوشتن آزمون‌های واحد برای هر کلاس به صورت مجزا است. زمانی که کلاس‌ها به صورت مستقل طراحی شوند و وابستگی‌های خود را از طریق واسط‌ها مدیریت کنند، می‌توان برای هر کلاس آزمون‌های واحد دقیق و مشخصی ایجاد کرد.
این روش به توسعه‌دهندگان اجازه می‌دهد تا واسط‌ها را با استفاده از تکنیک‌های شبیه‌سازی یا موکینگ (Mocking) به کار بگیرند. با این کار، می‌توان رفتار کلاس‌هایی را که به آن‌ها وابسته هستند، بدون نیاز به اجرای واقعی آن‌ها، شبیه‌سازی و آزمایش کرد. به این ترتیب، شما می‌توانید تعاملات و پاسخ‌های مورد انتظار را به‌دقت تست کنید و اطمینان حاصل کنید که کلاس تحت آزمون به درستی با وابستگی‌هایش تعامل می‌کند.
این شیوه آزمون‌نویسی نه تنها به شناسایی و رفع خطاها در مراحل اولیه توسعه کمک می‌کند، بلکه فرآیند نگهداری و به‌روزرسانی نرم‌افزار را نیز تسهیل می‌کند. در نتیجه، تیم توسعه می‌تواند با اطمینان بیشتری تغییرات لازم را اعمال کند، زیرا آزمون‌های واحد دقیق و پوشش‌دهی بالا، به سرعت مشکلات احتمالی را آشکار می‌سازند. همچنین، این رویکرد به توسعه‌دهندگان امکان می‌دهد که با اطمینان از کیفیت و عملکرد صحیح نرم‌افزار، ویژگی‌های جدیدی را اضافه کنند.


## نحوه ارسال پروژه:
1.	گام ۱ را انجام داده و سپس کد نوشته شده‌ی خود را (با رعایت محدودیت‌های گفته شده در گام) در یک پوشه به نام Step_1_Non_SOLID ذخیره کنید و در مخزن گام ۲ قرار دهید. موارد توضیحی بایستی در بخش README مخزن قرار گیرد.
2.	گام ۲ (که بخش تحلیلی است) در فایل README مربوط به مخزن گام ۲ آورده شود (تمام جداول با فرمت داده شده و عناوین هرکدام از سوالات پرسیده شده بایستی در README آورده شود).
3.	گام ۳ که شامل بهبود است، بایستی به صورت جداگانه در پوشه دیگری به نام Step_3_With_SOLID قرار داده شود و در مخزن موجود باشد.
4.	گام ۴ نیز در قالب توضیحات در README مخزن آورده شود.
5.	گام ۵ (که نتیجه گیری است) در README مخزن آورده شود.
