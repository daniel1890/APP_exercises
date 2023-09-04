package ex_2_4;

public class ReturnNBitsOfBinaryRepresentation {
    public ReturnNBitsOfBinaryRepresentation() {
    }

    public int CalculateNBitsOfN(int n) {
        if (n == 0) {
            return 0;
        }

        int leastSignificantBit = n & 1;

        return CalculateNBitsOfN(n >> 1) + leastSignificantBit;
    }
}
