package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.1tF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41021tF {
    public static final C41031tG A00;
    public static final C41031tG A01;
    public static final C41031tG A02;

    static {
        C41031tG c41031tG = new C41031tG("({[", ")}]");
        A02 = c41031tG;
        C41031tG c41031tG2 = new C41031tG("*~_", "*~_");
        A00 = c41031tG2;
        A01 = new C41031tG(c41031tG, c41031tG2);
    }

    public static Pair A00(CharSequence charSequence, Pair pair, C41031tG c41031tG) {
        int intValue = ((Number) pair.first).intValue();
        char charAt = intValue != 0 ? charSequence.charAt(intValue - 1) : (char) 0;
        char charAt2 = ((Number) pair.second).intValue() != charSequence.length() ? charSequence.charAt(((Number) pair.second).intValue()) : (char) 0;
        char charAt3 = charSequence.charAt(((Number) pair.first).intValue());
        char charAt4 = charSequence.charAt(((Number) pair.second).intValue() - 1);
        if (c41031tG.A00(charAt, charAt2)) {
            return pair;
        }
        if (c41031tG.A00(charAt, charAt4)) {
            return new Pair(pair.first, Integer.valueOf(((Number) pair.second).intValue() - 1));
        }
        if (c41031tG.A00(charAt3, charAt2)) {
            return new Pair(Integer.valueOf(((Number) pair.first).intValue() + 1), pair.second);
        }
        return c41031tG.A00(charAt3, charAt4) ? new Pair(Integer.valueOf(((Number) pair.first).intValue() + 1), Integer.valueOf(((Number) pair.second).intValue() - 1)) : pair;
    }

    public static boolean A01(CharSequence charSequence, Pair pair) {
        C41031tG c41031tG = A02;
        Stack stack = new Stack();
        for (int intValue = ((Number) pair.first).intValue(); intValue < ((Number) pair.second).intValue(); intValue++) {
            char charAt = charSequence.charAt(intValue);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !c41031tG.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
