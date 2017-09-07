SELECT s.Score, COUNT(r.Score) AS Rank FROM (SELECT DISTINCT Score FROM Scores) AS r, Scores AS s WHERE s.Score <= r.Score GROUP BY s.Id, s.Score ORDER BY s.Score DESC;
