/*

Get a country distribution for a whois domain.

This script obtains this distribution in the following way:

1) It first computes the distribution of countries in the Whois
   data, and stores this in a local map.

2) Uses only whois data. Goes from the domain to the nameserver(s),
   and then to all the domains that share that nameserver(s). For 
   each of those domains, it collects the associated countries.
   From this distribution, it computes, for each element in the 
   distribution, the ratio of the relative frequency to the
   relative frequency in the data as a whole, as found in (1).
   It returns the element with the greatest such ratio.

3) Uses other data sets...

*/