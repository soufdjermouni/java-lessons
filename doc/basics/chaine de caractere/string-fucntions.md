# What is the difference between strip() and trim();  
    NB : U+0020 est la valeur Unicode hexadécimale du caractère Espace (SP)

- trim() removes only characters <= U+0020 (space); 
- strip() removes all Unicode whitespace characters (but not all 
control characters, such as \0)

**The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard.**