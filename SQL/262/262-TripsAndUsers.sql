SELECT t.Request_at AS Day,
ROUND(SUM(IF(t.Status!='completed',1,0))/COUNT(*),2) AS 'Cancellation Rate'
FROM Trips AS t JOIN Users AS u ON t.Client_Id = u.Users_Id 
WHERE u.Banned = 'No' AND t.Request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY t.Request_at;
