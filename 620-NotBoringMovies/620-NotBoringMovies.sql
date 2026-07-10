-- Last updated: 7/10/2026, 9:43:59 AM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description <> 'boring'
ORDER BY rating DESC;