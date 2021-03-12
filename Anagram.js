//We are given two strings like "cinema" and "iceman" as inputs. 
//Can you write a method isAnagram(str1, str2) that will return true or false depending on whether the strings are anagrams of each other?





function isAnagram(str1,str2)
{
   let a = str1.toLowerCase();
   let b = str2.toLowerCase();

   a = a.split("").sort().join("");
   b = b.split("").sort().join("");

   return a===b;
}

console.log(isAnagram("army","mary"));
console.log(isAnagram("icecream","ice"))
