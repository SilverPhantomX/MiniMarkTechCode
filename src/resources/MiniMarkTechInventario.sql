USE MiniMarkTech;

CREATE TABLE inventario (
    idProducto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    precio INT NOT NULL,
    cantidad INT NOT NULL
);


INSERT INTO inventario (nombre, marca, precio, cantidad) VALUES
('Arroz 1kg', 'Tucapel', 1200, 50),
('Aceite 1L', 'Ideal', 1800, 30),
('Pan Molde', 'Mississippi', 1800, 25),
('Detergente 1L', 'Omo', 2500, 15),
('Gaseosa 1.5L', 'Coca Cola', 1500, 40),
('Leche 1L', 'Colun', 1150, 60),
('Huevos Docena', 'Santa Rosa', 2900, 35),
('Fideos Spaghetti 400g', 'Carozzi', 900, 45),
('Azúcar 1kg', 'Iansa', 1200, 50),
('Sal 1kg', 'Lobos', 500, 70),
('Atún en Agua 170g', 'San José', 1100, 40),
('Jabón Líquido 1L', 'Popeye', 1800, 25),
('Shampoo 400ml', 'Sedal', 2200, 20),
('Papel Higiénico 4un', 'Elite', 2100, 30),
('Café 170g', 'Nescafé Tradición', 3800, 18),
('Yoghurt Batido 1kg', 'Colun', 1800, 22),
('Mantequilla 250g', 'Soprole', 1600, 25),
('Queso Laminado 200g', 'Quillayes', 2500, 20),
('Agua Mineral 1.6L', 'Cachantún', 900, 50),
('Energética 473ml', 'Monster', 1500, 28),
('Galletas Tritón', 'Nestlé', 900, 40),
('Chocolate 90g', 'Sahne Nuss', 1500, 15),
('Cereal 500g', 'Zucaritas', 2800, 18),
('Salsa de Tomate 200g', 'Carozzi', 450, 60),
('Harina 1kg', 'Selecta', 950, 55);

