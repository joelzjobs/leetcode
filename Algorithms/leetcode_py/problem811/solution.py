class Solution:
    def subdomainVisits(self, cpdomains):
        """
        :type cpdomains: List[str]
        :rtype: List[str]
        """
        lookup = {}
        for s in cpdomains:
            num, domain = s.split(' ')
            sub = domain.split('.')
            for i in range(len(sub)):
                subdomain = '.'.join(sub[i:])
                lookup[subdomain] = lookup.get(subdomain, 0) + int(num)
        return [str(n)+" "+d for d, n in lookup.items()]
