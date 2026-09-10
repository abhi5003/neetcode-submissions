class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        left, right, min_boat = 0, len(people) -1, 0
        people.sort()

        while left<=right:
            two_ppl = people[left] + people[right]
            if two_ppl <= limit:
                left+=1
                right-=1
            else:
                right-=1
            min_boat+=1
        
        return min_boat
        


    

