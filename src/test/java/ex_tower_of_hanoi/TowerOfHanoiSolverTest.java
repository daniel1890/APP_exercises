package ex_tower_of_hanoi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TowerOfHanoiSolverTest {
    private TowerOfHanoiSolver sut;
    @BeforeEach
    void setUp() {
        sut = new TowerOfHanoiSolver();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void solve() {
        int n = 10;
        sut.solve(n);

        sut.toString();
    }
}