SELECT DISTINCT L1.Num AS ConsecutiveNums
FROM Logs AS L1 JOIN Logs AS L2 JOIN Logs AS L3
WHERE L1.Num = L2.Num AND L1.Id = L2.Id - 1 AND L1.Num = L3.Num AND L3.Id = L2.Id + 1; 