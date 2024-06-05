USE northwind;
SELECT ProductName
FROM products
WHERE UnitPrice = (SELECT MAX(Unitprice)
					FROM products);
                    
-- Cte de Blaye 

SELECT OrderID, shipName, ShipAddress
FROM orders
WHERE ShipVia = (SELECT ShipperID FROM Shippers WHERE CompanyName = "Federal Shipping");


		
SELECT orderID
FROM `Order Details` 
WHERE ProductID = (SELECT ProductID FROM Products WHERE ProductName = "Sasquatch Ale");

SELECT FirstName, LastName
FROM Employees
WHERE EmployeeID = (SELECT EmployeeID FROM Orders WHERE OrderID = 10266);

SELECT CompanyName
FROM Customers
WHERE CustomerID = (SELECT CustomerID FROM Orders WHERE OrderID = 10266);