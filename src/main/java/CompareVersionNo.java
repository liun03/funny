public class CompareVersionNo {
    public int compareVersion(String version1, String version2) {
        String[] v1Array = version1.split("\\.");
        String[] v2Array = version2.split("\\.");

        int maxL = v1Array.length > v2Array.length ? v1Array.length : v2Array.length;
        for (int i = 0; i < maxL; i++) {
            int v1Value = v1Array.length > i ? Integer.parseInt(v1Array[i]) : 0;
            int v2Value = v2Array.length > i ? Integer.parseInt(v2Array[i]) : 0;

            if (v1Value > v2Value) {
                return 1;
            }
            if (v2Value > v1Value) {
                return -1;
            }
        }
        return 0;
    }
}
