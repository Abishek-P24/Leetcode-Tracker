-- Last updated: 7/10/2026, 9:45:43 AM
SELECT d.Name AS Department, e.name as Employee, e.salary as Salary
FROM (
    SELECT *,
           DENSE_RANK() OVER (
               PARTITION BY DepartmentId
               ORDER BY Salary DESC
           ) AS rnk
    FROM Employee
) e
JOIN Department d ON e.DepartmentId = d.Id
WHERE e.rnk <= 3;