var a=prompt("Enter Your Sentence.");

var b="";

for(let i=a.length-1;i>=0;i--)
{
   b += a.charAt(i);

}
console.log(b);
let c=b.split(" ").reverse().join(" ");

alert("Reverse : "+ c);

