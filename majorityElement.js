//Suppose we're given an array of numbers like the following:

//[4, 2, 4]

//Could you find the majority element? 

//A majority is defined as "the greater part, or more than half, of the total. It is a subset of a set consisting of more than half of the set's elements."







function majority(nums)
{
    let sortedNums = nums.sort();

    let max=0,count=1;
    for(let i=1;i<nums.length;i++)
    {
        if(sortedNums[max]===sortedNums[i])
        {
            count++;
        }
        else
        {
            count--;
        }
        if(count==0)
        {
            max=i;
            count=1;
        }
    }
    if(count > (nums.length/2))
    console.log(sortedNums[max]);
    else
    console.log("No majority element");
}

majority([4,2,4]);
