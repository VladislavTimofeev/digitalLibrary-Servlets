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

CREATE TABLE authors
(
    id SERIAL PRIMARY KEY,
    first_name varchar(40),
    last_name varchar(40)
);