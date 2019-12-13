public class Demo1 {
    public int findJudge(int N, int[][] trust) {

        int[] trusted = new int[N + 1];
        trusted[0] = -1;


        for (int[] tr : trust) {
            trusted[tr[0]] = -1;
            if (trusted[tr[1]] != -1) {
                trusted[tr[1]]++;
            }
        }

        for (int i = 0; i < trusted.length; i++) {
            if (trusted[i] == N - 1 ) {
                return i;
            }
        }

        return N == 1 ? 1 : -1;
    }
}
