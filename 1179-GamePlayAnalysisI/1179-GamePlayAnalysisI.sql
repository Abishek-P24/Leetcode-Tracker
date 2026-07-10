-- Last updated: 7/10/2026, 9:43:34 AM
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;