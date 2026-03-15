class Fancy {
    private static final int MOD = 1000000007;
    private ArrayList<Long> arr;
    private long a, b;

    public Fancy() {
        arr = new ArrayList<>();
        a = 1;
        b = 0;
    }

    private long modPow(long x, long y, long mod) {
        long res = 1;
        x %= mod;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            y >>= 1;
        }
        return res;
    }

    public void append(int val) {
        long x = (val - b + MOD) % MOD;
        long invA = modPow(a, MOD - 2, MOD);
        x = (x * invA) % MOD;
        arr.add(x);
    }

    public void addAll(int inc) {
        b = (b + inc) % MOD;
    }

    public void multAll(int m) {
        a = (a * m) % MOD;
        b = (b * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= arr.size()) return -1;
        return (int)((a * arr.get(idx) % MOD + b) % MOD);
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */