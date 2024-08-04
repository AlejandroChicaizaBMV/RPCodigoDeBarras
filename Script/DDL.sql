-- database: ../Database/prjCodigoBarras.sqlite
DROP TABLE IF EXISTS Productos;
CREATE TABLE Productos(
    IDProducto  INTEGER PRIMARY KEY AUTOINCREMENT,
    ProductoNombre VARCHAR (50) NOT NULL,
    ProductoCodigo VARCHAR (10) NOT NULL UNIQUE,
    ProductoPrecio DECIMAL(10, 2) NOT NULL,
    ProductoEstado VARCHAR(1) NOT NULL DEFAULT ('A'),
    FechaCreacion DATETIME DEFAULT (datetime('now','localtime')),
    FechaModifica DATETIME
);

INSERT INTO Productos(ProductoNombre, ProductoCodigo, ProductoPrecio)
VALUES
('Leche','1234567890',1),
('Aceite','1234567891',1.25),
('Huevos','1234567892',1.5),
('Chocolate','1234567893',1.75),
('Verduras','1234567894',0.5);

