-- Cuenta 'TechGenius Inc.'
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('TechGenius Inc.', 'Lider en innovacion tecnologica', 'Grande', '123 Main St, Ciudad Principal', 'Tecnologia');
-- contactos cuenta 1
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Juan', 'juan.perez@email.com', 1);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Luis', 'luis.gonzalez@email.com', 1);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Laura', 'laura.martinez@email.com', 1);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Sergio', 'sergio.lopez@email.com', 1);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Isabel', 'isabel.rodriguez@email.com', 1);
-- Venta 1
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (100.00, '2023-11-28', 'Negociacion Inicial', 1);

-- Informes para la Venta 1
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (1, 'Bodega 1', 'Detalles venta 1 - Informe 1', '2023-11-29', '2023-11-30', '2023-12-08', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (1, 'Bodega 2', 'Detalles venta 1 - Informe 2', '2023-11-30', '2023-12-01', '2023-12-09', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (1, 'Bodega 1', 'Detalles venta 1 - Informe 3', '2023-12-01', '2023-12-02', '2023-12-10', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (1, 'Bodega 3', 'Detalles venta 1 - Informe 4', '2023-12-02', '2023-12-03', '2023-12-11', 'Naranjas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (1, 'Bodega 2', 'Detalles venta 1 - Informe 5', '2023-12-03', '2023-12-04', '2023-12-12', 'Fresas', 'Fruta');
-- Venta 2
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (180.00, '2023-12-05', 'Negociacion Inicial', 1);
-- Informes para la Venta 2
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (2, 'Bodega 1', 'Detalles venta 2 - Informe 1', '2023-12-06', '2023-12-07', '2023-12-15', 'Producto A', 'Tipo X');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (2, 'Bodega 2', 'Detalles venta 2 - Informe 2', '2023-12-07', '2023-12-08', '2023-12-16', 'Producto B', 'Tipo Y');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (2, 'Bodega 1', 'Detalles venta 2 - Informe 3', '2023-12-08', '2023-12-09', '2023-12-17', 'Producto C', 'Tipo Z');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (2, 'Bodega 3', 'Detalles venta 2 - Informe 4', '2023-12-09', '2023-12-10', '2023-12-18', 'Producto D', 'Tipo X');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (2, 'Bodega 2', 'Detalles venta 2 - Informe 5', '2023-12-10', '2023-12-11', '2023-12-19', 'Producto E', 'Tipo Y');

-- Venta 3
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (220.00, '2023-12-10', 'Negociacion Inicial', 1);
-- Informes para la Venta 3
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (3, 'Bodega 1', 'Detalles venta 3 - Informe 1', '2023-12-11', '2023-12-12', '2023-12-20', 'Producto A', 'Tipo X');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (3, 'Bodega 2', 'Detalles venta 3 - Informe 2', '2023-12-12', '2023-12-13', '2023-12-21', 'Producto B', 'Tipo Y');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (3, 'Bodega 1', 'Detalles venta 3 - Informe 3', '2023-12-13', '2023-12-14', '2023-12-22', 'Producto C', 'Tipo Z');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (3, 'Bodega 3', 'Detalles venta 3 - Informe 4', '2023-12-14', '2023-12-15', '2023-12-23', 'Producto D', 'Tipo X');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (3, 'Bodega 2', 'Detalles venta 3 - Informe 5', '2023-12-15', '2023-12-16', '2023-12-24', 'Producto E', 'Tipo Y');


-- Cuenta 'Quantum Innovations'
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Quantum Innovations', 'Explorando el futuro de la computación cuántica', 'Pequeña', '789 Quantum Lane, Ciudad Futura', 'Tecnología');

-- Contactos cuenta 2
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Marta', 'marta.rojas@email.com', 2);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Roberto', 'roberto.gomez@email.com', 2);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Elena', 'elena.santos@email.com', 2);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('David', 'david.martinez@email.com', 2);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Sofía', 'sofia.lopez@email.com', 2);

-- Venta 1
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (120.00, '2023-12-05', 'Negociación Inicial', 2);

-- Informes para la Venta 1
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (4, 'Bodega 1', 'Detalles venta 1 - Informe 1', '2023-12-06', '2023-12-07', '2023-12-15', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (4, 'Bodega 2', 'Detalles venta 1 - Informe 2', '2023-12-07', '2023-12-08', '2023-12-16', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (4, 'Bodega 1', 'Detalles venta 1 - Informe 3', '2023-12-08', '2023-12-09', '2023-12-17', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (4, 'Bodega 3', 'Detalles venta 1 - Informe 4', '2023-12-09', '2023-12-10', '2023-12-18', 'Naranjas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (4, 'Bodega 2', 'Detalles venta 1 - Informe 5', '2023-12-10', '2023-12-11', '2023-12-19', 'Fresas', 'Fruta');

-- Venta 2
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (200.00, '2023-12-15', 'Negociación Inicial', 2);

-- Informes para la Venta 2
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (5, 'Bodega 1', 'Detalles venta 2 - Informe 1', '2023-12-16', '2023-12-17', '2023-12-25', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (5, 'Bodega 2', 'Detalles venta 2 - Informe 2', '2023-12-17', '2023-12-18', '2023-12-26', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (5, 'Bodega 1', 'Detalles venta 2 - Informe 3', '2023-12-18', '2023-12-19', '2023-12-27', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (5, 'Bodega 3', 'Detalles venta 2 - Informe 4', '2023-12-19', '2023-12-20', '2023-12-28', 'Naranjas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (5, 'Bodega 2', 'Detalles venta 2 - Informe 5', '2023-12-20', '2023-12-21', '2023-12-29', 'Fresas', 'Fruta');
-- Venta 3
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (250.00, '2023-12-20', 'Negociación Inicial', 2);

-- Informes para la Venta 3
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 1', 'Detalles venta 3 - Informe 1', '2023-12-21', '2023-12-22', '2023-12-30', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 2', 'Detalles venta 3 - Informe 2', '2023-12-22', '2023-12-23', '2023-12-31', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 1', 'Detalles venta 3 - Informe 3', '2023-12-23', '2023-12-24', '2024-01-01', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 3', 'Detalles venta 3 - Informe 4', '2023-12-24', '2023-12-25', '2024-01-02', 'Naranjas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 2', 'Detalles venta 3 - Informe 5', '2023-12-25', '2023-12-26', '2024-01-03', 'Fresas', 'Fruta');


-- Cuenta 'DataDynamo Co.'
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('DataDynamo Co.', 'Donde los datos cobran vida', 'Grande', '321 Data Ave, Metropolis Digital', 'Tecnologia');

-- Contactos para la cuenta 'DataDynamo Co.'
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Alex', 'alex.smith@email.com', 3);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Diana', 'diana.jones@email.com', 3);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Roberto', 'roberto.rodriguez@email.com', 3);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Carolina', 'carolina.gomez@email.com', 3);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Eduardo', 'eduardo.santos@email.com', 3);

-- Ventas para la cuenta 'DataDynamo Co.'
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (120.00, '2023-12-10', 'Negociación Inicial', 3);
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (200.00, '2023-12-15', 'Presentación de Propuesta', 3);
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (150.00, '2023-12-20', 'Revisión de Contrato', 3);
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (180.00, '2023-12-25', 'Firma del Contrato', 3);
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (250.00, '2023-12-30', 'Entrega del Producto', 3);

-- Informes para la Venta 1
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 1', 'Detalles venta 1 - Informe 1', '2023-12-11', '2023-12-12', '2023-12-20', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 2', 'Detalles venta 1 - Informe 2', '2023-12-12', '2023-12-13', '2023-12-21', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (6, 'Bodega 1', 'Detalles venta 1 - Informe 3', '2023-12-13', '2023-12-14', '2023-12-22', 'Uvas', 'Fruta');

-- Informes para la Venta 2
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (7, 'Bodega 1', 'Detalles venta 2 - Informe 1', '2023-12-16', '2023-12-17', '2023-12-25', 'Fresas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (7, 'Bodega 2', 'Detalles venta 2 - Informe 2', '2023-12-17', '2023-12-18', '2023-12-26', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (7, 'Bodega 1', 'Detalles venta 2 - Informe 3', '2023-12-18', '2023-12-19', '2023-12-27', 'Plátanos', 'Fruta');

-- Informes para la Venta 3
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (8, 'Bodega 1', 'Detalles venta 3 - Informe 1', '2023-12-21', '2023-12-22', '2023-12-30', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (8, 'Bodega 2', 'Detalles venta 3 - Informe 2', '2023-12-22', '2023-12-23', '2023-12-31', 'Fresas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (8, 'Bodega 1', 'Detalles venta 3 - Informe 3', '2023-12-23', '2023-12-24', '2024-01-01', 'Manzanas', 'Fruta');
--informe para la venta 4
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (9, 'Bodega 2', 'Detalles venta 4 - Informe 1', '2024-01-06', '2024-01-07', '2024-01-15', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (9, 'Bodega 1', 'Detalles venta 4 - Informe 2', '2024-01-07', '2024-01-08', '2024-01-16', 'Uvas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (9, 'Bodega 3', 'Detalles venta 4 - Informe 3', '2024-01-08', '2024-01-09', '2024-01-17', 'Fresas', 'Fruta');
--informe para la venta 5 
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (10, 'Bodega 2', 'Detalles venta 5 - Informe 1', '2024-01-11', '2024-01-12', '2024-01-20', 'Manzanas', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (10, 'Bodega 1', 'Detalles venta 5 - Informe 2', '2024-01-12', '2024-01-13', '2024-01-21', 'Plátanos', 'Fruta');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (10, 'Bodega 3', 'Detalles venta 5 - Informe 3', '2024-01-13', '2024-01-14', '2024-01-22', 'Uvas', 'Fruta');

-- Cuenta 'RoboTech Dynamics'
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('RoboTech Dynamics', 'Pioneros en robótica avanzada', 'Mediana', '555 Robotics St, Ciudad Robotica', 'Tecnologia');

-- Contactos cuenta 4
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Eva', 'eva.robot@email.com', 4);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Adam', 'adam.robot@email.com', 4);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Ava', 'ava.robot@email.com', 4);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Atlas', 'atlas.robot@email.com', 4);
INSERT INTO Contacto (nombre, correo_Electronico, cuenta_id) VALUES ('Sophia', 'sophia.robot@email.com', 4);

-- Venta 6
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (300.00, '2024-01-15', 'Negociación Inicial', 4);
-- Informes para la Venta 6
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (46, 'Bodega 1', 'Detalles venta 6 - Informe 1', '2024-01-16', '2024-01-17', '2024-01-25', 'Robots A', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (46, 'Bodega 2', 'Detalles venta 6 - Informe 2', '2024-01-17', '2024-01-18', '2024-01-26', 'Robots B', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (46, 'Bodega 1', 'Detalles venta 6 - Informe 3', '2024-01-18', '2024-01-19', '2024-01-27', 'Robots C', 'Robot');

-- Venta 7
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (250.00, '2024-01-20', 'Presentación de Propuesta', 4);
-- Informes para la Venta 7
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (47, 'Bodega 2', 'Detalles venta 7 - Informe 1', '2024-01-21', '2024-01-22', '2024-01-30', 'Robots D', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (47, 'Bodega 1', 'Detalles venta 7 - Informe 2', '2024-01-22', '2024-01-23', '2024-01-31', 'Robots E', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (47, 'Bodega 3', 'Detalles venta 7 - Informe 3', '2024-01-23', '2024-01-24', '2024-02-01', 'Robots F', 'Robot');

-- Venta 8
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (180.00, '2024-02-01', 'Revisión de Contrato', 4);
-- Informes para la Venta 8
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (48, 'Bodega 1', 'Detalles venta 8 - Informe 1', '2024-02-02', '2024-02-03', '2024-02-10', 'Robots G', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (48, 'Bodega 2', 'Detalles venta 8 - Informe 2', '2024-02-03', '2024-02-04', '2024-02-11', 'Robots H', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (48, 'Bodega 1', 'Detalles venta 8 - Informe 3', '2024-02-04', '2024-02-05', '2024-02-12', 'Robots I', 'Robot');

-- Venta 9
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (200.00, '2024-02-08', 'Firma del Contrato', 4);
-- Informes para la Venta 9
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (49, 'Bodega 2', 'Detalles venta 9 - Informe 1', '2024-02-09', '2024-02-10', '2024-02-18', 'Robots J', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (49, 'Bodega 1', 'Detalles venta 9 - Informe 2', '2024-02-10', '2024-02-11', '2024-02-19', 'Robots K', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (49, 'Bodega 3', 'Detalles venta 9 - Informe 3', '2024-02-11', '2024-02-12', '2024-02-20', 'Robots L', 'Robot');

-- Venta 10
INSERT INTO Venta (monto, fecha_Cierre, etapa, cuenta_id) VALUES (300.00, '2024-02-15', 'Entrega del Producto', 4);
-- Informes para la Venta 10
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (50, 'Bodega 1', 'Detalles venta 10 - Informe 1', '2024-02-16', '2024-02-17', '2024-02-25', 'Robots M', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (50, 'Bodega 2', 'Detalles venta 10 - Informe 2', '2024-02-17', '2024-02-18', '2024-02-26', 'Robots N', 'Robot');
INSERT INTO Informe (venta_id, bodega_salida, detalles, fecha, fecha_salida, fecha_vencimiento, producto, tipo) VALUES (50, 'Bodega 1', 'Detalles venta 10 - Informe 3', '2024-02-18', '2024-02-19', '2024-02-27', 'Robots O', 'Robot');

INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('TradeMasters Ltd.', 'Especialistas en comercio internacional', 'Grande', '789 Commerce Blvd, Ciudad Global', 'Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('RetailRise Solutions', 'Transformando la experiencia de compra minorista', 'Mediana', '456 Market St, Pueblo Comercial', 'Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('LogiTrade Logistics', 'Soluciones logisticas para la cadena de suministro', 'Grande', '123 Logistics Lane, Ciudad Logistica', 'Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('GlobalGains Trading Co.', 'Conectando mercados para oportunidades ilimitadas', 'Pequena', '555 Trade St, Ciudad Comercio', 'Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('EcoMarket Enterprises', 'Comprometidos con el comercio sostenible', 'Mediana', '321 Green Ave, Ciudad Sostenible', 'Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Grand Suites & Resorts', 'Lujo y comodidad en cada estadia', 'Grande', '123 Luxury St, Ciudad Elegante', 'Hotelera');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Sunset Paradise Hotels', 'Donde cada atardecer es inolvidable', 'Mediana', '456 Sunset Blvd, Pueblo Costero', 'Hotelera');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Alpine Retreat Lodges', 'Descubre la belleza de la montana en cada temporada', 'Pequena', '789 Mountain View, Ciudad Alpina', 'Hotelera');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Tropical Oasis Resorts', 'Relajate en nuestro paraiso tropical', 'Grande', '555 Palm Lane, Ciudad Tropical', 'Hotelera');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Heritage Boutique Inns', 'Experimenta la historia y el encanto en cada rincon', 'Mediana', '321 Heritage St, Ciudad Historica', 'Hotelera');
-- Centros Comerciales (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Modern Mall', 'La última moda y tecnología en un solo lugar', 'Grande', '321 Trendy St, Ciudad Moderna', 'Centro Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Family Emporium', 'Para todas las necesidades de tu familia', 'Mediana', '555 Family Blvd, Pueblo Familiar', 'Centro Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Green Plaza', 'Tu destino ecológico para compras conscientes', 'Pequeña', '789 Eco Lane, Ciudad Sostenible', 'Centro Comercial');

-- Restaurantes (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Sizzling Steakhouse', 'Carnes a la parrilla que deleitan los sentidos', 'Grande', '123 Steak St, Ciudad Carnívora', 'Restaurante');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Seafood Harbor', 'Sabores frescos del océano en cada plato', 'Mediana', '456 Sea Blvd, Pueblo Marítimo', 'Restaurante');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Veggie Delight', 'Diversidad de opciones vegetarianas deliciosas', 'Pequeña', '789 Veg Lane, Ciudad Vegetariana', 'Restaurante');

-- Cafeterías (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Morning Brew Haven', 'Eleva tu mañana con la mezcla perfecta', 'Grande', '321 Morning St, Ciudad Matutina', 'Cafetería');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Choco Delight', 'El paraíso del chocolate en cada taza', 'Mediana', '555 Choco Blvd, Pueblo Dulce', 'Cafetería');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Tea Time Oasis', 'Explora el mundo a través de las hojas de té', 'Pequeña', '789 Tea Lane, Ciudad Tetera', 'Cafetería');
-- Centros Comerciales (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Modern Mall', 'La última moda y tecnología en un solo lugar', 'Grande', '321 Trendy St, Ciudad Moderna', 'Centro Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Family Emporium', 'Para todas las necesidades de tu familia', 'Mediana', '555 Family Blvd, Pueblo Familiar', 'Centro Comercial');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Green Plaza', 'Tu destino ecológico para compras conscientes', 'Pequeña', '789 Eco Lane, Ciudad Sostenible', 'Centro Comercial');

-- Restaurantes (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Sizzling Steakhouse', 'Carnes a la parrilla que deleitan los sentidos', 'Grande', '123 Steak St, Ciudad Carnívora', 'Restaurante');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Seafood Harbor', 'Sabores frescos del océano en cada plato', 'Mediana', '456 Sea Blvd, Pueblo Marítimo', 'Restaurante');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Veggie Delight', 'Diversidad de opciones vegetarianas deliciosas', 'Pequeña', '789 Veg Lane, Ciudad Vegetariana', 'Restaurante');

-- Cafeterías (Continuación)
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Morning Brew Haven', 'Eleva tu mañana con la mezcla perfecta', 'Grande', '321 Morning St, Ciudad Matutina', 'Cafetería');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Choco Delight', 'El paraíso del chocolate en cada taza', 'Mediana', '555 Choco Blvd, Pueblo Dulce', 'Cafetería');
INSERT INTO Cuenta (nombre, descripcion, tipo, direccion, industria) VALUES ('Tea Time Oasis', 'Explora el mundo a través de las hojas de té', 'Pequeña', '789 Tea Lane, Ciudad Tetera', 'Cafetería');
