//Find Last Digit Of a^b for Large Numbers

//Brut-Force approch : My Approch

class Solution1 {
    static int getLastDigit(String a, String b) {
        // code here
        int base = Integer.parseInt(a);
        int power = Integer.parseInt(b);
        int result = 1;
        if (power == 0)
            return 1;
            
        for(int i = 1; i <= power; i++){
            result = result * base;
        }
        
        return result % 10;
    }
};


//----------------------------------------------------------------------------------------------------\\


//Optimal Approch 
// 🧠 PROBLEM STATEMENT:
// Given two very large numbers 'a' and 'b' as strings, find the last digit of (a^b).
// Example: a = "2", b = "10" → 2^10 = 1024 → last digit = 4
// The problem is that 'b' can be extremely large (hundreds of digits), 
// so we cannot directly compute a^b or even parse b into an integer.

class Solution2 {
    static int getLastDigit(String a, String b) {

        // ⚙️ Base condition:
        // Anything raised to the power 0 is 1 (like 2^0 = 1, 9^0 = 1)
        if (b.equals("0")) return 1; 

        // 💡 Extract the last digit of 'a'
        // Because only the last digit of 'a' matters for the pattern.
        // Example: 12^something → only 2 matters for the last digit.
        int baseLastDigit = a.charAt(a.length() - 1) - '0'; 
        // (char - '0') → converts a character digit ('2') into an integer (2)
        // ❓You earlier asked: how 'a.charAt(...)-'0'' works?
        // 'a.charAt(...)' gives a character (like '9'), and characters in Java have ASCII values.
        // Subtracting '0' converts it into its actual digit integer.

        // ⚙️ Identify the repeating cycle for each last digit:
        // Each base's last digit has a predictable repeating pattern of last digits.
        int[] cycle;
        switch (baseLastDigit) {
            case 0: return 0; // Any power of 0 ends with 0
            case 1: return 1; // Any power of 1 ends with 1
            case 2: cycle = new int[]{2, 4, 8, 6}; break; // 2^1=2, 2^2=4, 2^3=8, 2^4=16 → pattern repeats
            case 3: cycle = new int[]{3, 9, 7, 1}; break;
            case 4: cycle = new int[]{4, 6}; break;       // 4^1=4, 4^2=16 → pattern repeats
            case 5: return 5;
            case 6: return 6;
            case 7: cycle = new int[]{7, 9, 3, 1}; break;
            case 8: cycle = new int[]{8, 4, 2, 6}; break;
            case 9: cycle = new int[]{9, 1}; break;
            default: return 0; // should never happen
        }

        // 🧩 cycleLength → number of repeating last digits
        int cycleLength = cycle.length;

        // 🧮 Now, we must find: which index of this cycle corresponds to b (the exponent)
        // But we CANNOT convert 'b' (since it can have hundreds of digits)
        // So we simulate (b % cycleLength) digit by digit.
        int exponentMod = 0;

        // 🧱 You earlier understood this as: 
        // "We process each digit of b and keep track of remainder"
        // Yes, that’s exactly right.
        for (int i = 0; i < b.length(); i++) {
            int currentDigit = b.charAt(i) - '0'; // convert char to int
            exponentMod = (exponentMod * 10 + currentDigit) % cycleLength;
            // ❓You asked: why multiply by 10?
            // Because every new digit in a number shifts the old digits left by one decimal place.
            // Example: building 123 → (((1*10)+2)*10)+3
            // So here we are building b step-by-step, but always taking modulo to avoid overflow.
        }

        // ⚡ Now exponentMod represents (b % cycleLength)
        // Example: If cycleLength = 4 and b = 10, then exponentMod = 2 → means index 1 (since 2-1)
        // ❓You asked: what if remainder is 0?
        // remainder 0 means the cycle is complete → we should pick the *last* element in the cycle.

        if (exponentMod == 0) exponentMod = cycleLength;

        // ✅ Finally, return the corresponding last digit
        // We use (exponentMod - 1) because our array index starts from 0.
        return cycle[exponentMod - 1];
    }
}
