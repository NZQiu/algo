package var;


/*
 * Multiply two big numbers, assume all are valid positive int.
 */
public class MulStr {
    private String x;
    private String y;

    public MulStr(String x, String y) {
        if (x == null) x = "";
        if (y == null) y = "";

        while (x.length() < y.length()) {
            x = "0" + x;
        }
        while (y.length() < x.length()) {
            y = "0" + y;
        }
        this.x = x;
        this.y = y;
    }

    public String calculate() {
        return rmHeadZeros(mul(this.x, this.y));
    }

    private String rmHeadZeros(String p) {
        if (p == null || p.isEmpty()) return "";

        int start = 0;
        while (p.charAt(start) == '0' && start < p.length() - 1) {
            start++;
        }

        return p.substring(start, p.length());
    }

    private String mul(String x, String y) {
        if (x == null || y == null) return "";
        if (x.isEmpty() || y.isEmpty()) return "";

        if (x.length() == 1 && y.length() == 1) {
            int vx = x.charAt(0) - '0';
            int vy = y.charAt(0) - '0';
            return String.valueOf(vx * vy);
        }

        int xLen = x.length();
        String xh = x.substring(0, xLen / 2);
        String xt = x.substring(xLen / 2, xLen);

        int yLen = y.length();
        String yh = y.substring(0, yLen / 2);
        String yt = y.substring(yLen / 2, yLen);

        String p1 = mul(xh, yh);
        for (int i=0; i < xt.length() + yt.length(); i++) {
            p1 += "0";
        }

        String p2 = mul(xh, yt);
        for (int i=0; i < xt.length(); i++) {
            p2 += "0";
        }

        String p3 = mul(xt, yh);
        for (int i=0; i < yt.length(); i++) {
            p3 += "0";
        }
        String p4 = mul(xt, yt);

        return add(add(p1, p2), add(p3, p4));
    }

    private String add(String x, String y) {
        if (x == null || x.isEmpty()) return y;
        if (y == null || y.isEmpty()) return x;

        while (x.length() < y.length()) {
            x = "0" + x;
        }
        while (y.length() < x.length()) {
            y = "0" + y;
        }

        int k = x.length() - 1;
        String result = "";
        int advance = 0;
        while (k >= 0) {
            int vx = x.charAt(k) - '0';
            int vy = y.charAt(k) - '0';
            int vz = vx + vy + advance;
            advance = vz / 10;
            char c = (char) ('0' + vz % 10);
            result = c + result;
            k--;
        }

        if (advance > 0) {
            result = (char)('0' + advance) + result;
        }

        return result;
    }
}
