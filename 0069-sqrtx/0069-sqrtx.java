//step1 : math :  sqrt(x);

class Solution {
    public int mySqrt(int x) {
    double val = Math.sqrt(x);
    return (int )val;
    } 
}

//--------------------------------------------

// class Solution {
//     public int mySqrt(int x) {
//         double guess = x / 2.0;
        
//         while (Math.abs(guess * guess - x) > 0.0001) {
//             guess = (guess + x / guess) / 2.0;
//         }
        
//         return (int) Math.round(guess);
//     }
// }
