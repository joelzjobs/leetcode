SELECT t.Id FROM Weather AS t JOIN Weather AS p ON TO_DAYS(p.Date) = TO_DAYS(t.Date) - 1 WHERE t.Temperature > p.Temperature;
