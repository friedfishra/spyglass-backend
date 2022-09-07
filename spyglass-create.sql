
DROP TABLE IF exists goal CASCADE;

CREATE TABLE goal 
(
	id int not null auto_increment,
    name varchar(200) not null,
    description varchar(1024),
    image_path varchar(1024),
    target_date date not null,
    target_amount int not null,
    current_amount int not null,
    status varchar(16),
    
    CONSTRAINT PK_goals PRIMARY KEY (id)
);



