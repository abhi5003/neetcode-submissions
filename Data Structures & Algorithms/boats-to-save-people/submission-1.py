class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        left, right, min_boat = 0, len(people) -1, 0
        people.sort()

        while left<=right:
            ''' Atmost two ppl allowed in boat. it could be one or two'''
            two_ppl = people[left] + people[right]
            ## so sum is less or equal then move for other
            if two_ppl <= limit:
                left+=1
                right-=1
            else:
                ## else we need to drop off heaviour person
                right-=1
            
            min_boat+=1
        
        return min_boat
        


    

