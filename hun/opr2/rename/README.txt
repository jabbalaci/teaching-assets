Feladat
=======

Töltsük le és bontsuk ki az FMA.zip nevű állományt. A létrejövő
könyvtárban az állománynevek meglehetősen hosszúak. A feladat
az lesz, hogy az állományneveket rövidítsük le a következőképpen:

[Coalgirls]_Fullmetal_Alchemist_Brotherhood_01_(1280x720_Blu-ray_FLAC)_[EE8F24E1].ass  =>  ep_01.ass
[Coalgirls]_Fullmetal_Alchemist_Brotherhood_01_(1280x720_Blu-ray_FLAC)_[EE8F24E1].mkv  =>  ep_01.mkv
...
[Coalgirls]_Fullmetal_Alchemist_Brotherhood_64_(1280x720_Blu-ray_FLAC)_[851201A0].mkv  =>  ep_64.mkv
[Coalgirls]_Fullmetal_Alchemist_Brotherhood_64_(1280x720_Blu-ray_FLAC)_[851201A0].srt  =>  ep_64.srt


Segítség
========

Ubuntu alatt több állomány átnevezéséhez használjuk a "rename" parancsot.

Példa:

    # -n: No action (remove it for some real action)
    rename -n 's/Scan(.*)\.JPG/$1.jpg/' *.JPG

Először mindig a "-n" kapcsolóval futtassuk a parancsot, aminek a hatására
még nem végzi el az átnevezéseket, csupán a képernyőre írja ki, hogy mit mire
nevezne át.
Ha elégedettek vagyunk az eredménnyel, akkor futtassuk le a parancsot a
"-n" kapcsoló nélkül.

Tipp
====

Az átnevezést nem muszáj egy menetben elvégezni. Ha úgy kényelmesebb, akkor
futtassuk a rename parancsot egymás után többször...

rename script
=============

Más Linux disztribúciók nem biztos, hogy tartalmazzák ezt a szkriptet. Pl. az
Arch/Manjaro rendszereken a "rename" program nem pont' ugyanezt a szkriptet
rejti. Az Ubuntu alatti rename script megtalálható ebben a könyvtárban
"rename.pl" néven, így más rendszerekre is át lehet másolni. A script
kiterjesztése arra utal, hogy a program Perl nyelven lett megírva.
