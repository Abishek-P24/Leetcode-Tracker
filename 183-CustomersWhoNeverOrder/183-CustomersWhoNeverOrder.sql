-- Last updated: 7/10/2026, 9:45:47 AM
SELECT c.NAME as Customers
FROM Customers c
LEFT JOIN Orders o
ON c.Id=o.customerId
WHERE o.CustomerId is NULL;