import java.util.Scanner;

public class B_Sail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sx = sc.nextLong();
        long sy = sc.nextLong();
        long ex = sc.nextLong();
        long ey = sc.nextLong();
        sc.nextLine();
        String str = sc.nextLine();

        String destString = "";

        int eastCount = 0, westCount = 0, northCount = 0, southCount = 0;
        if (ex - sx > 0) {
            for (int i = 1; i <= ex - sx; i++) {
                destString += 'E';
                eastCount++;
            }
        } else if (ex - sx < 0) {
            for (int i = 1; i <= Math.abs(ex - sx); i++) {
                destString += 'W';
                westCount++;
            }
        }
        if (ey - sy > 0) {
            for (int i = 1; i <= ey - sy; i++) {
                destString += 'N';
                northCount++;
            }
        } else if (ey - sy < 0) {
            for (int i = 1; i <= Math.abs(ey - sy); i++) {
                destString += 'S';
                southCount++;
            }
        }

        int stringCountE = 0, stringCountW = 0, stringCountN = 0, stringCountS = 0;
        for (int i = 0; i < str.length(); i++) {
            if (destString.contains(String.valueOf("E"))) {
                if (str.charAt(i) == 'E') {
                    stringCountE++;
                }
            } else if (destString.contains(String.valueOf("W"))) {
                if (str.charAt(i) == 'W') {
                    stringCountW++;
                }
            }
            if (destString.contains(String.valueOf("N"))) {
                if (str.charAt(i) == 'N') {
                    stringCountN++;
                }
            } else if (destString.contains(String.valueOf("S"))) {
                if (str.charAt(i) == 'S') {
                    stringCountS++;
                }
            }
        }

        // System.out.println(destString);
        boolean flag = true;
        if (destString.contains(String.valueOf("E"))) {
            if (eastCount > stringCountE) {
                System.out.println("-1");
                flag = false;
            }
        } else if (destString.contains(String.valueOf("W"))) {
            if (westCount  > stringCountW) {
                System.out.println("-1");
                flag = false;
            }
        }
        else if(destString.contains(String.valueOf("N"))) {
            if (northCount > stringCountN) {
                System.out.println("-1");
                flag = false;
            }
        } else if (destString.contains(String.valueOf("S"))) {
            if (southCount > stringCountS) {
                System.out.println("-1");
                flag = false;
            }
        }

        int cn = 0, result = 0;
        if (flag) {
            if (destString.contains(String.valueOf("E"))) {
                int i;
                for (i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'E')
                        cn++;
                    if (cn == eastCount)
                        break;
                }
                result = i + 1;
            } else if (destString.contains(String.valueOf("W"))) {
                cn = 0;
                int i;
                for (i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'W')
                        cn++;
                    if (cn == westCount)
                        break;
                }
                if (i + 1 > result)
                    result = i + 1;
            }

            if (destString.contains(String.valueOf("N"))) {
                cn = 0;
                int i;
                for (i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'N')
                        cn++;
                    if (cn == northCount)
                        break;
                }
                if (i + 1 > result)
                    result = i + 1;
            } else if (destString.contains(String.valueOf("S"))) {
                cn = 0;
                int i;
                for (i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'S')
                        cn++;
                    if (cn == southCount)
                        break;
                }
                if (i + 1 > result)
                    result = i + 1;
            }
            // System.out.println(destString);
            System.out.println(result);
        }
        sc.close(); }
}
