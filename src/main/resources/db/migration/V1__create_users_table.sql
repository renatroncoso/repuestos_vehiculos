CREATE TABLE repuestos ( 
    vin BIGINT NOT NULL AUTO_INCREMENT,
    familia  VARCHAR (50) NOT NULL,
    componentes VARCHAR(50) NOT NULL,
    nombre VARCHAR (100) NOT NULL UNIQUE,
    stock NUMBER (30) NOT NULL,
    PRIMARY KEY (vin)
);