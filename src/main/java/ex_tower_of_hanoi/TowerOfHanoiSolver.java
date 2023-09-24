package ex_tower_of_hanoi;

import ex_5_4.HanStack;

public class TowerOfHanoiSolver implements ITowerOfHanoiSolver {
    private final HanStack<Integer> stackA;
    private final HanStack<Integer> stackB;
    private final HanStack<Integer> stackC;
    public TowerOfHanoiSolver() {
        stackA = new HanStack<>();
        stackB = new HanStack<>();
        stackC = new HanStack<>();
    }
    // First add all N disks to stack A.
    // Then add all N-1 disks from A to C, when C contains N-1 disks move all disks from C to B.
    // Then add all N-1 disks from B to A, when A contains N-1, move remaining disk from B to C, move all disks from A to C.
    @Override
    public void solve(int n) {
        // First add all N disks to stack A.
        for(int i = n; i > 0; i--) {
            stackA.push(i);
        }

        startHanoi(n, stackA, stackC, stackB);
    }

    private void startHanoi(int n, HanStack<Integer> from, HanStack<Integer> to, HanStack<Integer> aux) {
        if(n <= 0) {
            return;
        }

        startHanoi(n - 1, from, aux, to);
        to.push(from.topAndPop());
        System.out.println(this.toString());
        startHanoi(n - 1, aux, to, from);
    }

    @Override
    public String toString() {
        String result = "";
        result +="Stack A: " + "\n" + stackA.toString() + "\n Stack B: \n" + stackB.toString() + "\n Stack C: \n" + stackC.toString();

        return result;
    }
}

/*
The idea is to use the helper node to reach the destination using recursion. Below is the pattern for this problem:

Shift ‘N-1’ disks from ‘A’ to ‘B’, using C.
Shift last disk from ‘A’ to ‘C’.
Shift ‘N-1’ disks from ‘B’ to ‘C’, using A.
 */