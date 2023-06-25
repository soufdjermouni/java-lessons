
//Programmation synchrone 
function creerSalutation(nom) {
  return `Bonjour, je m'appelle ${nom} !`;
}

const nom = 'Miriam';
const salutation = creerSalutation(nom);
console.log(salutation);