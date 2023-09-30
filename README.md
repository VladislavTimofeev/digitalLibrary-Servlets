## Digital Library 

### Web application written on servlets

### Use cases : 

#### Book :

We can add, delete, update and get books.

Requests : 

- POST /books - create new book
- GET /books — get a list of books
- PUT /books/{id} — edit book by id
- DELETE /books/{id} — delete book by id

BookEntity :

- title, numberOfPage, releaseYear


#### Author :

Requests : 

- POST /authors — add new author
- GET /authors — get a list of authors
- GET /authors/{id} — get author by id
- PUT /authors/{id} — edit author by id
- DELETE /authors/{id} — delete author by id

AuthorEntity :

- firstName, lastName, dateOfBirth, country

#### Many-to-Many for books and authors : 

#### BookAuthorEntity :

- bookId, authorId