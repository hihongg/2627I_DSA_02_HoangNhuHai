package btvn_week1.bai01;

public class BugQuickFind {
    private int[] leader;

    public BugQuickFind(int n) {
        leader = new int[n];
        for(int i = 0;i < n;i++) {
            leader[i] = i;
        }
    }

    public void union(int p, int q) {
        for (int i = 0; i < leader.length; i++) {
            if (leader[i] == leader[p]) {
                leader[i] = leader[q];
            }
        }
    }

    public int find(int j) {
        return leader[j];
    }

    public static void main(String[] args) {
        int n = 3;
        BugQuickFind a = new BugQuickFind(n);
        a.union(1, 0);
        a.union(0, 2);
        System.out.println(a.find(1));
        System.out.println(a.find(2));
        System.out.println((a.find(1) == a.find(2)));
    }
}
