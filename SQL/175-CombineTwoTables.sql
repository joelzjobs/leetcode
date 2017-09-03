SELECT FirstName, LastName, City, State FROM Person AS p LEFT JOIN Address AS addr ON p.PersonId = addr.PersonId;
