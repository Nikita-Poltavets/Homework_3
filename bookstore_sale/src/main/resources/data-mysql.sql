insert into publishers (id, create_time, update_time, publisher_name) values (1, current_timestamp(), current_timestamp(), 'test1');
insert into publishers (id, create_time, update_time, publisher_name) values (2, current_timestamp(), current_timestamp(), 'test2');
insert into publishers (id, create_time, update_time, publisher_name) values (3, current_timestamp(), current_timestamp(), 'test3');
insert into publishers (id, create_time, update_time, publisher_name) values (4, current_timestamp(), current_timestamp(), 'test4');
insert into publishers (id, create_time, update_time, publisher_name) values (5, current_timestamp(), current_timestamp(), 'test5');

insert into authors (id, create_time, update_time, first_name, last_name) values (1, current_timestamp(), current_timestamp(), 'Bjarne', 'Stroustrup');
insert into authors (id, create_time, update_time, first_name, last_name) values (2, current_timestamp(), current_timestamp(), 'Dennis', 'Ritchie');
insert into authors (id, create_time, update_time, first_name, last_name) values (3, current_timestamp(), current_timestamp(), 'James', 'Gosling');
insert into authors (id, create_time, update_time, first_name, last_name) values (4, current_timestamp(), current_timestamp(), 'Anders', 'Hejlsberg');
insert into authors (id, create_time, update_time, first_name, last_name) values (5, current_timestamp(), current_timestamp(), 'Robert', 'Martin');

insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (1, current_timestamp(), current_timestamp(), 'Programming: Principles and Practice Using C++', 'description1', '2-266-11156-6', 10.55, current_timestamp(), 'Programming', 600, 1);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (2, current_timestamp(), current_timestamp(), 'The C++ Programming Language;Design and Evolution of C++', 'description2', '2-266-11156-7', 15.75, current_timestamp(), 'Programming', 600, 1);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (3, current_timestamp(), current_timestamp(), 'The C programming language', 'description3', '2-266-11156-8', 21.00, current_timestamp(), 'Programming', 600, 1);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (4, current_timestamp(), current_timestamp(), 'The Java Language Specification, Java SE 8 Edition', 'description8', '2-266-11156-9', 10.55, current_timestamp(), 'Programming', 600, 1);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (5, current_timestamp(), current_timestamp(), 'The C# Programming Language', 'description4', '2-266-11156-0', 10.55, current_timestamp(), 'Programming', 600, 2);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (6, current_timestamp(), current_timestamp(), 'Clean Code: A Handbook of Agile Software Craftsmanship;The Clean Coder', 'description5', '3-266-11156-7', 10.55, current_timestamp(), 'Programming', 600, 2);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (7, current_timestamp(), current_timestamp(), 'The Clean Coder: A Code of Conduct for Professional Programmers', 'description6', '3-366-11156-7', 10.55, current_timestamp(), 'Programming', 600, 2);
insert into books (id, create_time, update_time, book_name, description, isbn, price, published_date, title, total_pages, publisher_id) values
        (8, current_timestamp(), current_timestamp(), 'Clean Architecture: A Craftsman''s Guide to Software Structure and Design', 'description7', '3-266-12156-7', 10.55, current_timestamp(), 'Programming', 600, 2);

insert into book_dependency (book_id, author_id) values (1, 1);
insert into book_dependency (book_id, author_id) values (2, 1);
insert into book_dependency (book_id, author_id) values (3, 2);
insert into book_dependency (book_id, author_id) values (4, 3);
insert into book_dependency (book_id, author_id) values (5, 4);
insert into book_dependency (book_id, author_id) values (6, 5);
insert into book_dependency (book_id, author_id) values (7, 5);
insert into book_dependency (book_id, author_id) values (8, 5);
