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
//     double guess = x / 2.0 ;
    
//         guess = (guess + x / guess ) / 2.0 ;
        
//         return (int) guess;
//     } 
// }