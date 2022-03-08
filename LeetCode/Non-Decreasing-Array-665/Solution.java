public static boolean checkPossibility(int nums[]) {
    int i, count = 0, n = nums.length;
    int diff[] = new int[n - 1];
    if (n == 1)
        return true;
    for (i = 0; i < n - 1; i++) {
        diff[i] = nums[i + 1] - nums[i];
        if (diff[i] < 0)
            count++;
        if (count > 1)
            return false;
    }
    if (diff[0] < 0 || diff[n - 2] < 0) {
        return true;
    } else {
        for (i = 0; i < n - 1; i++) {
            if (diff[i] < 0) {
                if ((diff[i] + diff[i + 1] >= 0) || diff[i - 1] + diff[i] >= 0) {
                    return true;
                } else
                    return false;
            }
        }
    }
    return true;
}