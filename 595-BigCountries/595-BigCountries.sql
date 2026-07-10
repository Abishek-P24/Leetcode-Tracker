-- Last updated: 7/10/2026, 9:44:14 AM
SELECT
    name,
    population,
    area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;