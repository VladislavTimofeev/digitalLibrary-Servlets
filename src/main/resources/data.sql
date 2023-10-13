-- подключиться через идею к БД
-- сконфигурировать диалект (выберется авто)
-- написать скл для создания бд и таблицыв книг

CREATE TABLE books
(
    id SERIAL PRIMARY KEY,
    number_of_pages integer,
    title varchar(30),
    release_year integer
);

INSERT INTO books
VALUES (1,360,'Harry Pottttter',1999)

SELECT 'id','number_of_pages','title','release_year' FROM books

SELECT * FROM books