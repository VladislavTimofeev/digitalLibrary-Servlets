## Digital Library 

### Web application written on servlets

### Use cases : 

#### Book :

Administrator can add, delete, update and get books.

Requests : 

- POST /addbooks - create new book
- GET /books — get a list of books
- PUT /upbooks/{id} — edit book by id
- DELETE /delbooks/{id} — delete book by id

#### User :

- The user can find a book by genre, author, book title.
- Upon request, the user can borrow the book if it is available, or reserve it.
- If the required book is not available, the user is placed on hold, and when a book appears, he receives a notification.
- The user can receive notifications about the approaching end of the period of use of the book, about the receipt by the library of the book that the user is waiting for.
- The user can renew the book when the term of use of the book comes to an end.
- If the user somehow forgets to return the book before the deadline, the book is considered overdue and the user pays a penalty.

Requests : 

- POST /addusers — add new user
- GET /users — get a list of users
- GET /users/{id} — get user by id
- PUT /users/{id} — edit user by id
- DELETE /users/{id} — delete user by id