-- database: ../Database/prjCodigoBarras.sqlite

-- Eliminar tablas si existen
DROP TABLE IF EXISTS Productos;
DROP TABLE IF EXISTS CatalogoII;
DROP TABLE IF EXISTS CatalogoI;

-- Crear la tabla CatalogoI
CREATE TABLE CatalogoI (
    IDCatalogoI          INTEGER PRIMARY KEY AUTOINCREMENT,
    CatalogoINombre      VARCHAR(50) NOT NULL UNIQUE,
    CatalogoIEstado      VARCHAR(1) NOT NULL DEFAULT 'A',
    FechaCreacion        DATETIME DEFAULT (datetime('now','localtime')),
    FechaModifica        DATETIME
);

-- Insertar datos en la tabla CatalogoI
INSERT INTO CatalogoI(CatalogoINombre)
VALUES
('Comestibles'),
('Belleza'),
('Hogar'),
('Deportes'),
('Vestimenta'),
('Farmacia'),
('Electronica y Entretenimiento'),
('Mascotas');

-- Crear la tabla CatalogoII
CREATE TABLE CatalogoII (
    IDCatalogoII       INTEGER PRIMARY KEY AUTOINCREMENT,
    CatalogoIINombre   VARCHAR(50) NOT NULL UNIQUE,
    IDCatalogoI        INTEGER NOT NULL,
    CatalogoIIEstado   VARCHAR(1) NOT NULL DEFAULT 'A',
    FechaCreacion      DATETIME DEFAULT (datetime('now','localtime')),
    FechaModifica      DATETIME,
    FOREIGN KEY (IDCatalogoI) REFERENCES CatalogoI(IDCatalogoI)
);

-- Insertar datos en la tabla CatalogoII
INSERT INTO CatalogoII (CatalogoIINombre, IDCatalogoI)
VALUES
('Lacteos'          , 1),
('Despensa'         , 1),
('Cereales'         , 1),
('Congelados'       , 1),
('Enlatados'        , 1),
('Dulces'           , 1),
('Frutas Y Verduras', 1),
('Cuidado Piel'     , 2),
('Ropa Interior'    , 5),
('Gala'             , 5),
('Juguete Gatos'    , 8),
('Juguete Perros'   , 8);

-- Crear la tabla Productos
CREATE TABLE Productos (
    IDProducto          INTEGER PRIMARY KEY AUTOINCREMENT,
    ProductoNombre      VARCHAR(50) NOT NULL,
    ProductoCodigo      VARCHAR(13) NOT NULL UNIQUE,
    ProductoPrecio      DECIMAL(10, 2) NOT NULL,
    IDCatalogoI         INTEGER NOT NULL,
    IDCatalogoII        INTEGER NOT NULL,
    ProductoEstado      VARCHAR(1) NOT NULL DEFAULT 'A',
    FechaCreacion       DATETIME DEFAULT (datetime('now','localtime')),
    FechaModifica       DATETIME,
    FOREIGN KEY (IDCatalogoI) REFERENCES CatalogoI(IDCatalogoI),
    FOREIGN KEY (IDCatalogoII) REFERENCES CatalogoII(IDCatalogoII)
);

-- Insertar datos en la tabla Productos
INSERT INTO Productos (ProductoNombre, ProductoCodigo, IDCatalogoI, IDCatalogoII, ProductoPrecio)
VALUES
('Leche'    ,'1234567890120'   ,1 , 1 ,1),
('Aceite'   ,'1234567890121'   ,1 , 2 ,1.25),
('Huevos'   ,'1234567890122'   ,1 , 2 ,1.5),
('Chocolate','1234567890123'   ,1 , 6 ,1.75),
('Verduras' ,'1234567890124'   ,1 , 7 ,0.5),
('Perfume'  ,'1234567890125'   ,2 , 8 ,5);




