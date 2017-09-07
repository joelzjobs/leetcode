select Name from Candidate where id = (select candidateid from Vote group by candidateid order by count(candidateid) desc limit 1);
