def anagramStrings(s, t):
    if len(s)!=len(t): return False
    s.sort()
    t.sort()
    return s==t