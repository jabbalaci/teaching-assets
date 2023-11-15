import numpy as np
from bmi import bmi_list

print(bmi_list)

"""
A fenti bmi_list több mint 1.000 játékos BMI értékét tartalmazza.

A testtömegindexről itt olvashatunk többet: https://hu.wikipedia.org/wiki/Testt%C3%B6megindex

A NumPy segítségével egy tömbbe gyűjtsük ki azokat, akik túlsúlyosak (bmi >= 25).

Hány túlsúlyos játékos van?
"""

np_bmi = np.array(bmi_list)
obese = np_bmi >= 25

heavy = np_bmi[obese]
print(heavy)
print(len(heavy))
