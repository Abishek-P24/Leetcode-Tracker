-- Last updated: 7/10/2026, 9:43:37 AM
SELECT actor_id, director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;

