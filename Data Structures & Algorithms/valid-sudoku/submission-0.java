class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> boxes = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.')
                    continue;

                String boxKey = (r / 3) + "," + (c / 3);

                if (!rows.computeIfAbsent(r, k -> new HashSet<>())
                        .add(ch)) // add() method return true/false
                    return false;
                if (!cols.computeIfAbsent(c, k -> new HashSet<>()).add(ch))
                    return false;
                if (!boxes.computeIfAbsent(boxKey, k -> new HashSet<>()).add(ch))
                    return false;
            }
        }
        return true;
    }
}
