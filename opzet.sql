CREATE TABLE plaat (
	  id int not null auto_increment,
    prijs				DOUBLE(5,2),
    naamAlbum           VARCHAR(25)
    producent		VARCHAR(25),
    zanger   		VARCHAR(25),
    lengte			int,
    cover			VARCHAR(250),
    primary key(id)
);

CREATE TABLE gebruiker (
    id int not null auto_increment,
	  gebruikersnaam varchar(25),
    email_adres varchar(25),
    wachtwoord varchar(64),
    rol varchar(25),
    primary key(id)
);
