from lev import LD


def test_lev():
    assert LD("", "") == 0
    assert LD("toned", "roses") == 3
    assert LD("ab", "abcd") == 2
    assert LD("pet", "pets") == 1
    assert LD("sittin", "sitting") == 1
