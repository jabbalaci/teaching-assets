def LD(s: str, t: str) -> int:
    """
    Levenshtein distance
    """
    s = " " + s
    t = " " + t
    d = {}
    S = len(s)
    T = len(t)
    for i in range(S):
        d[i, 0] = i
    #
    for j in range(T):
        d[0, j] = j
    #
    for j in range(1, T):
        for i in range(1, S):
            if s[i] == t[j]:
                d[i, j] = d[i - 1, j - 1]
            else:
                d[i, j] = min(d[i - 1, j] + 1, d[i, j - 1] + 1, d[i - 1, j - 1] + 1)
            #
        #
    #
    return d[S - 1, T - 1]
