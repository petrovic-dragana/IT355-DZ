DROP TABLE IF EXISTS jelo;
DROP TABLE IF EXISTS restoran;

create table restoran (id bigint generated by default as identity, adresa varchar(255), naziv varchar(255), ocena float(53) not null, telefon varchar(255), primary key (id));
create table jelo (id bigint generated by default as identity, cena float(53) not null, naziv varchar(255), opis varchar(255), id_restorana bigint not null, primary key (id));

INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 1', 'Restoran 1', 4.5, '123-456-7890');
INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 2', 'Restoran 2', 4.0, '234-567-8901');
INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 3', 'Restoran 3', 4.2, '345-678-9012');
INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 4', 'Restoran 4', 4.7, '456-789-0123');
INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 5', 'Restoran 5', 4.3, '567-890-1234');
INSERT INTO restoran (adresa, naziv, ocena, telefon) VALUES ('Adresa 6', 'Restoran 6', 4.6, '678-901-2345');


INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (500, 'Jelo 1', 'Opis 1', 1);
INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (600, 'Jelo 2', 'Opis 2', 2);
INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (700, 'Jelo 3', 'Opis 3', 3);
INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (800, 'Jelo 4', 'Opis 4', 4);
INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (900, 'Jelo 5', 'Opis 5', 5);
INSERT INTO jelo (cena, naziv, opis, id_restorana) VALUES (1000, 'Jelo 6', 'Opis 6', 6);