mypy -- optional static typing
==============================

Blog post: https://pythonadventures.wordpress.com/2018/07/25/mypy-optional-static-typing/

Telepítés
---------

    $ pip3 install mypy --user -U

Telepítés helye:

    ~/.local/bin

Ezt a könyvtárat tegyük be a PATH-ba.

Használat
---------

    $ mypy program.py     # egy adott file ellenőrzése
    $ mypy src/           # az adott mappában az összes file ellenőrzése

Ha a mypy arról panaszkodik, hogy bizonyos modulokat nem talál,
akkor így hívjuk meg:

    $ mypy program.py --ignore-missing-imports --follow-imports=skip

mypy.ini használata
-------------------

A mypy paramétereit egy `mypy.ini` konfigurációs állományba is bele lehet tenni.

Példa:

    $ mypy --config-file mypy.ini program.py

szükséges importok
------------------

Ha nem csak egy egyszerű típust akarunk megadni (pl. int, str), akkor
szükség lesz a `typing` modulra:

    from typing import Tuple, List, Any, Set, Optional

ajánlott előadás
----------------

Static Types for Python
by Jukka Lehtosalo, David Fisher
at PyCon 2017

https://www.youtube.com/watch?v=7ZbwZgrXnwY

\pagebreak
feladat
-------

Vegyük elő néhány korábbi forráskódunkat, s lássuk el
a függvényeket típusmegjelölésekkel.

Példák:

* string1.py
* string2.py
* list1.py
* list2.py
* stb.

ajánlott IDE
------------

* PyCharm. A PyCharm felismeri és ellenőrzi ezeket a típusmegjelöléseket.

* VS Code. A Python extension szintén felismeri és ellenőrzi a típusmegjelöléseket.
