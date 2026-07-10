-- Last updated: 7/10/2026, 9:46:02 AM
SELECT score,
       DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
FROM Scores;