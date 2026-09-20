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
        int n = 3;             //tạo mảng leader = [0, 1, 2]
        BugQuickFind a = new BugQuickFind(n);
        a.union(1, 0);       //gộp 1 và 0
                                   //i = 0: leader[0] (0) != 1 -> giữ nguyên.
                                    //i = 1: leader[1] (1) == 1 -> đổi leader[1] thành 0.
                                    //i = 2: leader[2] (2) != 1 -> giữ nguyên.
                                    //=> leader = [0, 0, 2] (đúng)
        a.union(0, 2);       //ộp 0 và 2
                                    //i = 0: leader[0] (0) == leader[0] (0) -> Đổi leader[0] = 2.mảng biến thành 2 [2, 0, 2]
                                    //i = 1: leader[1] đang bằng 0. khi kiểm tra điều kiện leader[1] == leader[0] cho kết quả False sẽ ko chạy hàm trong if
                                    //i = 2: ko chạy hàm trong if
                                    //Kết quả: leader = [2, 0, 2]. (Sai Vì đúng theo quickfind thì phải là [2, 2, 2] nhưng find(1) = 0 khác find(2) = 2).
        System.out.println(a.find(1));
        System.out.println(a.find(2));
        System.out.println((a.find(1) == a.find(2))); // check
    }
}
