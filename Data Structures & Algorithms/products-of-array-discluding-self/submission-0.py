class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p,z=1,0
        l=[0]*len(nums)
        for i in range(len(nums)):
            if nums[i]==0:
                z+=1
            else:
                p*=nums[i]
        if z>1:
            return l
        for i in range(len(nums)):
            if z==1 and nums[i]==0:
                    l[i]=p
            elif z==1:
                l[i]=0
            else:
                l[i]=p//nums[i]
        return l    
        