//Given a string str, can you write a method that will return True if is a palindrome and False if it is not?


//using built-in methods
function isPalindrome(str)
{
    let reverseString = str.split("").reverse().join("") ;
    // console.log(reverseString);

    return str===reverseString ;
}

console.log(isPalindrome("racecar"));




//using for loop and reverse string concept

function isPalindrome1(str)
{
    let reverseString = "";
    for(let i=str.length-1;i>=0;i--)
    {
        reverseString += str[i];
    }
    return str===reverseString ;
}
console.log(isPalindrome1("palindrome"));



//using for loop and two pointer concept

function isPalindrome2(str)
{
    for(let i=0;i<str.length/2;i++)
    
       if(str[i] === str[str.length-1-i])
          return true;
       else
          return false;
}
console.log(isPalindrome2("madam"));

