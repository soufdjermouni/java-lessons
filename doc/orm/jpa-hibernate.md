# JPA Java Persistence API
It is a Java specification that offers a standardized way to interact with databases using ORM technology.

# persistence unit 
A persistence unit in JPA is a logical group of related entities. It defines the set of entities that can be managed 
as a group.

# JPQL Java Persistence Query Language
is an object-oriented query language. It is used to perform database operations on persistent objects. JPQL uses entity
object model to operate the SQL queries rather than database tables. JPA transforms JPQL into SQL. It can also perform
an aggregate function with sorting and grouping clauses.

# The EntityManager 
is accountable for managing entity persistence and retrieval operations in JPA. It provides methods 
to create, read, update, and delete entities from the database.

# Suppression en cascade CascadeType.REMOVE vs CascadeType.DELETE
CascadeType.REMOVE and CascadeType.DELETE both propagate the delete operation from parent to child entity.
CascadeType.REMOVE is specific to JPA, whereas CascadeType.DELETE is specific to Hibernate.

# EntityManager vs  Session Factory
In JPA, the EntityManager does the job of Session Factory. Session Factory is a component specific to Hibernate, and 
not part of the JPA specification

# many-to-many relationship 
Many-to-many relationships are not highly recommended in a relational database because it can create many problems, 
as Data redundancy, data insertion, deletion, and updating difficulties.


