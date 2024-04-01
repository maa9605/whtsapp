package X;

import java.util.ArrayList;
import java.util.Comparator;

/* renamed from: X.12l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C224412l {
    public static final Comparator A07 = new Comparator() { // from class: X.12N
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C224312k) obj).A01 - ((C224312k) obj2).A01;
        }
    };
    public static final Comparator A08 = new Comparator() { // from class: X.12O
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C224312k) obj).A00, ((C224312k) obj2).A00);
        }
    };
    public int A01;
    public int A02;
    public int A03;
    public final int A04 = 2000;
    public final C224312k[] A06 = new C224312k[5];
    public final ArrayList A05 = new ArrayList();
    public int A00 = -1;
}
