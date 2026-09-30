class Solution:
    def largest(self, arr):
         max_value = arr[0]

         for i in range(1, len(arr)):
                if arr[i] > max_value:
                    max_value = arr[i]

         return max_value
