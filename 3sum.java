i [right] == nums[right - 1]) right--; // skip duplicates
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
    
