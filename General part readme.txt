Object Relational Mapping with JPA
General part
By Mikkel Lund Clausen / DAT

In the first TWO semesters (error in assignment citing three) we started working with writing to txt files., row by row. We also managed to store savegames from our TextAdventure in a txt file.
When we were introduced to SQL we started working with a Data Access Object class, that mapped data from objects to the database. Afterwards we build mapper classes that were paired up with the classes from the backend (e.g. User and UserMapper).
We have not worked with cookies in browsers yet.

The rationale behind ORM is that the framework handles all the queries, inserts, alters, statements, resultsets, stringifies etc. The framework does all the magic, and we dont need any mapper classes and essentially no SQL scripting. 

Hereafter listed my perseption of the subject.
Pros:
- Less coding
- Less repetitions
- No stupid stringify of objects to put in db, and stringifying when retreiving from db before returning the newly populated object with data (object -> strings -> db) and (object <- strings <- db)

Cons:
