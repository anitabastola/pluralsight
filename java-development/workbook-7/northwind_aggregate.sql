USE northwind;

SELECT COUNT(*)
FROM suppliers;

SELECT SUM(Salary) AS total_salary
FROM employees;

-- 20362.929931640625

SELECT MIN(UnitPrice) AS cheapest_price
FROM Products;

-- 2.5000

SELECT AVG(UnitPrice) AS average_price
FROM products;

-- 28.86636364

SELECT MAX(UnitPrice) AS expensive_price
FROM Products;

-- 263.5000

SELECT SuplierID, COUNT(*) As ItemCount
FROM Products
GROUP BY SupplierID;

-- 263.5000

SELECT  CategoryID, AVG(UnitPrice) AS AveragePrice
FROM products
GROUP BY CategoryID;

-- 263.5000

SELECT SupplierID, COUNT(*) AS ItemCount
FROM products
GROUP BY SupplierID
HAVING ItemCount >= 5;

-- 263.5000

SELECT ProductId, ProductName, UnitPrice * UnitsInStock As InventoryValue
FROM Products
ORDER BY InventoryValue DESC, ProductName ASC;









