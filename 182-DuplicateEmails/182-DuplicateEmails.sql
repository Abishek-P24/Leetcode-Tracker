-- Last updated: 7/10/2026, 9:45:49 AM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(email) >1;