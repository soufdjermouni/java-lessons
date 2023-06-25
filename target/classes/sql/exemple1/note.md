	• Create Table

	CREATE TABLE users (
	id INT AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	);


	• Comment pouvez-vous importer des données à partir d'un fichier CSV dans MySQL ?

	Pour importer des données à partir d'un fichier CSV dans MySQL, vous pouvez utiliser la commande LOAD DATA INFILE, qui permet de charger des données depuis un fichier texte dans une table MySQL. Par exemple :

	USE preparing;
	set session sql_mode = '';
	set session sql_mode = 'NO_ENGINE_SUBSTITUTION';
	LOAD DATA INFILE 'C:/developpement/git/worspace-IdeaProjects-foramtion/java-new/src/main/resources/sql/exemple1/file.csv'
	INTO TABLE user
	FIELDS TERMINATED BY ','
	ENCLOSED BY '"'
	LINES TERMINATED BY '\r\n'
	IGNORE 1 LINES ;


	• Comment pouvez-vous optimiser une requête MySQL pour qu'elle s'exécute plus rapidement ?
	Réponse : Il existe plusieurs techniques pour optimiser une requête MySQL, notamment :

		○ Ajouter des index pour les colonnes utilisées dans les conditions de la requête.
		○ Éviter d'utiliser la fonction LIKE avec des jokers (wildcards % et _) en début de chaîne.
		○ Éviter d'utiliser des sous-requêtes ou des jointures imbriquées si possible.
		○ Limiter le nombre de colonnes retournées par la requête en utilisant la clause SELECT avec seulement les colonnes nécessaires.
		○ Utiliser la clause LIMIT pour limiter le nombre de résultats retournés si possible.

	• Comment pouvez-vous trouver les doublons dans une table MySQL ?
	Réponse : Vous pouvez trouver les doublons dans une table MySQL en utilisant la commande GROUP BY avec la clause HAVING COUNT.

	SELECT column_name, COUNT() FROM table_name GROUP BY column_name HAVING COUNT() > 1;

	SELECT user.username, COUNT(*) AS nb
	FROM user user
	GROUP BY user.username
	HAVING nb>1

	•     ajouter une nouvelle colonne à une table MySQL ?
	ALTER TABLE table_name ADD COLUMN new_column INT;


	• Comment pouvez-vous sauvegarder une base de données MySQL ?
	Réponse : Vous pouvez sauvegarder une base de données MySQL en utilisant la commande mysqldump. Par exemple, la commande suivante peut être utilisée pour sauvegarder une base de données nommée "database_name" dans un fichier nommé "backup.sql" :

	mysqldump -u username -p database_name > backup.sql

	• Créer Index :
	Pour créer un index sur une colonne, vous pouvez utiliser la commande CREATE INDEX. Par exemple, la commande suivante crée un index nommé "idx_column_name" sur une colonne nommée "column_name" de la table "table_name" :

	CREATE INDEX idx_column_name ON table_name (column_name);

	CREATE INDEX idx_username ON user (username);
