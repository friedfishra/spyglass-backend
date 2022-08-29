START TRANSACTION;

CREATE TABLE goals 
(
	id int not null auto_increment,
    name varchar(50) not null,
    description varchar(1024),
    image_path varchar(1024),
    target_date date not null,
    target_amount int not null,
    current_amount int not null,
    
    CONSTRAINT PK_goals PRIMARY KEY (id)
);

