-- Last updated: 7/10/2026, 9:44:22 AM
SELECT e.name
FROM Employee e
JOIN Employee m
ON e.id = m.managerId
GROUP BY e.id, e.name
HAVING COUNT(m.id) >= 5;