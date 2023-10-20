# Regular Expression Metacharacters

- `.*`  : n'importe quelle chaine du caractère    
Exemples :    
   + password.matches(".*[A-Z].*") : Le password contient au moins une lettre majuscule 
   + password.matches(".*[0-9].*") : Le password contient au moins un chiffre 
- `\d`  : is a metacharacter that matches any digit from 0 to 9.     
Exemple  
/\d\d\d\d\d\d\d\d\d\d/g :  7458795123   = Ok

- `\D`  :  which matches all non-digit characters. It is the opposite of \d   
- `\w`  : which matches all word characters (a-z, A-Z, 0-9, and _)
- 