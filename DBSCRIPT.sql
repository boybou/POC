CREATE TABLE Artikel(
  artikel_id    serial,
  artikel_kast  INTEGER NOT NULL ,
  artikel_lade  INTEGER NOT NULL ,
  artikel_naam  VARCHAR(255) NOT NULL ,
  CONSTRAINT pk_artikel PRIMARY KEY (artikel_id)
);

INSERT INTO Artikel
VALUES (0,123,4,'Kweekstok');
INSERT INTO Artikel
VALUES (1,37,8,'Vaseline wit steriel 5g');
INSERT INTO Artikel
VALUES (2,66,2,'Bonewax');
INSERT INTO Artikel
VALUES (3,36,7,'Tachosil klein');
INSERT INTO Artikel
VALUES (4,123,5,'Schuursponsjes');
INSERT INTO Artikel
VALUES (5,122,5,'Kliniplast 10x20');
INSERT INTO Artikel
VALUES (6,36,3,'Instillagel');