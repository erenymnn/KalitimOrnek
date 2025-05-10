Bu projede, Java'da kalıtım (inheritance) kavramı kullanılarak geometrik şekiller (geometrik şekil, dikdörtgen ve kare) modellemesi yapılmıştır. Kodun amacı, temel sınıflar ve bu sınıflardan türeyen alt sınıflar arasında nasıl miras alınabileceğini,
metotların nasıl override edilebileceğini ve nesne yönelimli programlamada constructor'ların nasıl çalıştığını göstermektir.

📌 Projede Yer Alan Sınıflar:
GeometrikSekil: Taban (üst) sınıf. en ve boy özelliklerini içerir. Alan ve çevre hesaplamaları yapar.

Dikdortgen: GeometrikSekil sınıfından türetilmiştir. Özellikleri yazdıran ek bir metot ve toString() override edilmiştir.

Kare: GeometrikSekil sınıfından türetilmiştir. Kareye özgü alan ve çevre hesaplamaları yapılabilir (kodda sadece GeometrikSekil'in metotları kullanılmaktadır).

🎯 Amaç:
Kalıtım yoluyla kod tekrarını azaltmak

Override yöntemi ile metotların işlevini özelleştirmek

Constructor zincirlemesi ve sınıf ilişkilerini göstermek

Temel nesne yönelimli tasarım anlayışı kazandırmak
