from utils import duplaz, is_palindrome


def test_duplaz():
    assert duplaz(2) == 4
    assert duplaz(3) == 6
    assert duplaz(0) == 0
    assert duplaz(-1) == -2
    assert duplaz(-5) == -10


def test_is_palindrome():
    assert is_palindrome("anna") == True
    assert is_palindrome("ana") == True
    assert is_palindrome("a") == True
    assert is_palindrome("") == True
    assert is_palindrome("abc") == False
    assert is_palindrome("ab") == False
    assert is_palindrome("Anna") == False
