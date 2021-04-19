# Java Rest Assured ile API Testi
Projenin amacı, http://www.omdbapi.com/ bağlantı adresindeki public api'nin testini gerçekleştirmektir. Proje, mimari açıdan büyümeye hazır bir yapıda geliştirilmiştir. Test senaryolarının durumları Log dosyası içerisinde kaydedilerek geçmişe yönelik takibi sağlanabilmektedir. Bu kapsamda aşağıdaki iki senaryo test edilmiştir.
1. "By Search" başlığı altındaki parametrelerle "Harry Potter" araması yapıp, gelen sonuçlardan "Harry Potter and the Sorcerer's Stone" filminin id'sinin alınması
2. İlk case'de alınan id ile "By ID or Title" başlığı altındaki metodlarda film araması
## Kullanılan Teknolojiler
**Java :** basit, nesne odaklı, ağ anlayışlı, yorumlanmış, sağlam, güvenli, taşınabilir, nötr mimarisi, yüksek performanslı ve dinamik bir bilgisayar dilidir. <br/>
**Rest Assured :** RESTful web servislerini test etmek için kullanılan Java tabanlı bir kitaplıktır. <br/>
**TestNG :** TestNG, Cédric Beust tarafından oluşturulan ve JUnit ve NUnit'ten esinlenen Java programlama dili için bir test çerçevesidir. <br/>
**Log4j :** Log4j, Java tabanlı bir günlük oluşturma yardımcı programıdır.  <br/>
## Proje Yapısı
![Proje Yapısı](https://user-images.githubusercontent.com/45245369/115285993-3c403680-a157-11eb-9252-744f3e3febbb.PNG)
### HelperMethods Paketi
- **ListenerTest.java :** TestNG kütüphanesini kullanarak testlerin durumuna göre işlenecek komutların tanımlandığı sınıftır.
- **Log.java :** Log4j kütüphanesini kullanarak konsol ve log dosyasına test senaryosu durumlarının kaydedildiği sınıftır.
#### serviceMethods Paketi
- **OMDBServiceMethods.java :** OMDB Test senaryolarının gerçekleştiriminde kullanılacak yardımcı fonksiyonların tanımlandığı sınıftır.
### models Paketi
#### searchByIDModels Paketi
- **SearchByIDResponse.java :** ID ile arama API cevabının modellendiği sınıftır.
- **Rating.java :** SearchByIDResponse.java sınıfı içerisinde bulunan Rating listesinin modellendiği sınıftır.
#### searchByTitleModels Paketi
- **SearchByTitleResponse.java :** Title ile arama API cevabının modellendiği sınıftır.
- **Search.java :** SearchByTitleResponse.java sınıfı içerisinde bulunan Search listesinin modellendiği sınıftır. Gelen cevapta bulunan film niteliklerini içerir.
### responseServices Paketi
- **OMDBServices.java :** OMDB Test senaryoları için Rest Assured kütüphanesini kullanarak istek fonksiyonlarının tanımlandığı sınıftır.
### OMDBSearch Paketi
- **OMDBSearchTestCases.java :** OMDB Test senaryolarının tanımlandığı sınıftır. API'lerden alınan isteklerin kontrolü burada sağlanır. 
## Proje Ekran Görüntüleri
### Konsol Çıktısı
![Console](https://user-images.githubusercontent.com/45245369/115290284-0782ae00-a15c-11eb-88c2-2bbe174bb406.PNG)
### TestNG Sonuçları Çıktısı
![TestNG](https://user-images.githubusercontent.com/45245369/115290397-26814000-a15c-11eb-980b-492f0acbae05.PNG)
### Log Dosyası Çıktısı
![Log](https://user-images.githubusercontent.com/45245369/115290714-8b3c9a80-a15c-11eb-82b5-487f26674c0f.PNG)
